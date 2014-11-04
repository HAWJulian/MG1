package Motor;

import jssc.SerialPort;
import jssc.SerialPortException;

import java.util.Scanner;

public class MotorSteuerung {
//
	static Scanner scanner = new Scanner(System.in);
	
	//Sende/Empfange Arduino Daten
    SerialPort serialPort = new SerialPort("/dev/tty.usbmodem1421");
    try {
        serialPort.openPort();//Open serial port
        serialPort.setParams(9600, 8, 1, 0);//Set params.
        System.out.println("eingabe [zahl, zahl]: ");
        while(true) {
            String buchstabe = scanner.nextLine();
            serialPort.writeBytes(buchstabe.getBytes());//Write data to port
            
            
            byte[] buffer = serialPort.readBytes();//Read bytes from serial port
            if(buffer != null) {
            	String text = new String(buffer);
            	
            System.out.println(text);
            }
        }
        
        //serialPort.closePort();//Close serial port
    }
    catch (SerialPortException ex) {
        System.out.println(ex);
    }
    
}
