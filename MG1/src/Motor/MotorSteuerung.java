package Motor;

import gui.*;
import jssc.SerialPort;
import jssc.SerialPortException;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MotorSteuerung {
	
	
	static Scanner scanner = new Scanner(System.in);
	
	int degreeM;
	int degreeH;
	boolean directionM;
	boolean directionH;
	Clock[][] clocks2;
	int dirM;
	int dirH;
	String data;
	SerialPort serialPort = new SerialPort("/dev/tty.usbmodem1421");
	int turnMinute;
	int turnHour;
	/*
	 * MotorSteuerung soll erhalten: Um wie viel grad soll sich der jeweilige Zeiger bewegen und in welche Richtung.
	 * Sollte die Rotation > 360° sein, muss die Anzahl der Rotationen reingerechnet werden (2x360° = 720° als Übergabe)
	 * Sollte eine Rotation nicht derterminstisch sein, wird eine extrem große Gradzahl zur Rotation verwendet und über das Programm gestoppt
	 * Im Programm (in welchem auch immer) wird die aktuelle Position beider Zeiger gespeichert, damit bei einer nicht deterministischhen Rotations
	 * die Restrotation auf die neue Position bestimmt werden kann.
	 */
	public MotorSteuerung(Clock[][] clocks)
	{
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
	
	private void setDegrees(Clock[][] clocks2) {
		degreeM = (int) clocks2[1][1].getTargetDegreeM();
		degreeH = (int) clocks2[1][1].getTargetDegreeH();
	}
	
	private void setDirection(Clock[][] clocks) {
		directionM = clocks2[1][1].getDirectionM();
		directionH = clocks2[1][1].getDirectionH();
	}
	private void setTurn(Clock[][] clocks)
	{
		turnMinute = clocks2[1][1].getRandomVariable1();
		turnHour = clocks2[1][1].getRandomVariable2();
	}
	
	public void refresh(Clock[][] clocks2)
	{
		setDegrees(clocks2);
		setDirection(clocks2);
		setTurn(clocks2);
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
		//data = degreeM + ", " + degreeH + ", " + dirM + ", " + dirH;
		data = degreeM + ", " + dirM + ", " + turnMinute;
		//this.ArduinoCommunication();
		System.out.println(data);
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
