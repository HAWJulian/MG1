package Motor;

import gui.*;
import jssc.SerialPort;
import jssc.SerialPortException;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MotorSteuerung {
	
	
	static Scanner scanner = new Scanner(System.in);
	int var1 = 3;
	int var2 = 2;
	boolean directionM;
	boolean directionH;
	Clock[][] clocks2;
	int dirM;
	int dirH;
	String data;
	
	//SerialPort serialPort = new SerialPort("/dev/tty.usbmodem1421");
	SerialPort serialPort = new SerialPort("COM3");
	//Initialisierung des seriellen Ports und clockArray übernehmen
	public MotorSteuerung(Clock[][] clocks) {
		
		clocks2 = clocks;
		try
		{
			serialPort.openPort();// Open serial port
			serialPort.setParams(9600, 8, 1, 0);// Set params.
			System.out.println("Serieller Port geoeffnet");
		}
		catch(Exception e)
		{
			System.out.println("failed to open port");
		}
	}
	
	//Richtung der jeweiligen Uhr übernehmen
	private boolean setDirection(Clock[][] clocks) {
		
		directionM = clocks2[var1][var2].getDirectionM();
		directionH = clocks2[var1][var2].getDirectionH();
		boolean moving = clocks2[var1][var2].getIsMoving();
		
		return moving;
	}
	
	public void refresh(Clock[][] clocks2) {
		
		setDirection(clocks2);
		if(directionM)
		{
			dirM = 1;
		}
		else
		{
			dirM = 0;
		}
		
		if(directionH)
		{
			dirH = 0;
		}
		else
		{
			dirH = 1;
		}
		
		data = dirM + "," + dirH + ':';
		//Todo: nur ein zeiger bewegt sich
		if(clocks2[var1][var2].getIsMoving())
		{
			if(clocks2[var1][var2].isHMoving() && !(clocks2[var1][var2].isMMoving()))
			{
				dirM = 2;
				System.out.println("test/////");
			}
			else if(clocks2[var1][var2].isMMoving() && !(clocks2[var1][var2].isHMoving()))
			{
				dirH = 2;
				System.out.println("test2////");
			}
			this.ArduinoCommunication();
			/*try
			{
				TODO: Thread.sleep(15);
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			//System.out.println("is H moving: " + clocks2[var1][var2].isHMoving());
			//System.out.println("is M moving: " + clocks2[var1][var2].isMMoving());
			System.out.println("java: " + data + "-" + "-" + dirM + "-" + dirH);
		}
		
		
	}
	//Sende/Empfange Arduino Daten
	private void ArduinoCommunication()
	{
		byte[] buffer = null;
		// String buchstabe = scanner.nextLine();
		// Write data to port
		try
		{
			serialPort.writeBytes(data.getBytes());
			buffer = serialPort.readBytes();// Read bytes from serial
			// port
		}
		catch (SerialPortException e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		if (buffer != null)
		{
			String text = new String(buffer);
			System.out.println(text);
		}
	}

	// serialPort.closePort();//Close serial port

	//setzt zeiger auf default
	public void toDefault() {
		dirM = 3;
		dirH = 3;
		
		data = dirM + "," + dirH + ':';
		
		this.ArduinoCommunication();
	}
	
	public int[] getFocussedClock()
	{
		return new int[]{var1,var2};
	}
}
