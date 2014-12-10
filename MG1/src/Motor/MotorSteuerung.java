package Motor;

import gui.*;
import jssc.SerialPort;
import jssc.SerialPortException;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MotorSteuerung {
	
	
	static Scanner scanner = new Scanner(System.in);
	
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
			
		}
	}
	
	//Richtung der jeweiligen Uhr übernehmen
	private boolean setDirection(Clock[][] clocks) {
		
		directionM = clocks2[1][1].getDirectionM();
		directionH = clocks2[1][1].getDirectionH();
		boolean moving = clocks2[1][1].getIsMoving();
		
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
			dirH = 1;
		}
		else
		{
			dirH = 0;
		}
		
		data = dirM + "," + dirH + ':';
		//Todo: nur ein zeiger bewegt sich
		if(setDirection(clocks2))
		{
			this.ArduinoCommunication();
			System.out.println(data + "-" + "-" + dirM + "-" + dirH);
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

}
