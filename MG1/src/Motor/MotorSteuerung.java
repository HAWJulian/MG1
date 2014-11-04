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
	
	public void setDegrees(Clock[][] clocks) {
		degreeM = (int) clocks[0][0].getTargetDegreeM();
		degreeH = (int) clocks[0][0].getTargetDegreeH();
	}
	
	public void setDirection(Clock[][] clocks) {
		directionM = clocks[0][0].getDirectionM();
		directionH = clocks[0][0].getDirectionH();
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
