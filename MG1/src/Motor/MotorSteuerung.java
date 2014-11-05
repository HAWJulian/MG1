package Motor;

import gui.*;
import jssc.SerialPort;
import jssc.SerialPortException;

import java.util.Scanner;

public class MotorSteuerung {
	
	static Scanner scanner = new Scanner(System.in);
	
	int degreeM;
	int degreeH;
	boolean directionM;
	boolean directionH;
	Clock[][] clocks2;
	int dirM;
	int dirH;
	
	public MotorSteuerung(Clock[][] clocks)
	{
		clocks2 = clocks;
	}
	
	private void setDegrees(Clock[][] clocks2) {
		degreeM = (int) clocks2[1][1].getTargetDegreeM();
		degreeH = (int) clocks2[1][1].getTargetDegreeH();
	}
	
	private void setDirection(Clock[][] clocks) {
		directionM = clocks2[1][1].getDirectionM();
		directionH = clocks2[1][1].getDirectionH();
	}
	
	public void refresh(Clock[][] clocks2)
	{
		setDegrees(clocks2);
		setDirection(clocks2);
		//System.out.println(degreeM);
		//System.out.println(degreeH);
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
		String data = "" + degreeM + ", " + degreeH + ", " + dirM + ", " + dirH;
		
		System.out.println(data);
	}
	//Sende/Empfange Arduino Daten
	private void ArduinoCommunication()
	{
		SerialPort serialPort = new SerialPort("/dev/tty.usbmodem1421");
		try
		{
			serialPort.openPort();// Open serial port
			serialPort.setParams(9600, 8, 1, 0);// Set params.
			System.out.println("eingabe [zahl, zahl]: ");
			while (true)
			{
				String buchstabe = scanner.nextLine();
				// Write data to port
				serialPort.writeBytes(buchstabe.getBytes());
				byte[] buffer = serialPort.readBytes();// Read bytes from serial
														// port
				if (buffer != null)
				{
					String text = new String(buffer);
					System.out.println(text);
				}
			}

			// serialPort.closePort();//Close serial port
		}
		catch (SerialPortException ex)
		{
			System.out.println(ex);
		}
	}

}
