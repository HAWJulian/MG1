package Motor;

import jssc.SerialPort;
import jssc.SerialPortException;

import java.util.Scanner;

public class MotorSteuerung {
	
	static Scanner scanner = new Scanner(System.in);

	///*
	//WRITE
	public static void main(String[] args) {
        SerialPort serialPort = new SerialPort("/dev/tty.usbmodem1421");
        try {
            serialPort.openPort();//Open serial port
            serialPort.setParams(9600, 8, 1, 0);//Set params.
            System.out.println("buchstabe eingeben [l/r/s]: ");
            while(true) {
	            String buchstabe = scanner.nextLine();
	            serialPort.writeBytes(buchstabe.getBytes());//Write data to port
            }
            //serialPort.closePort();//Close serial port
        }
        catch (SerialPortException ex) {
            System.out.println(ex);
        }
    }
    //*/
	
	
	/*
	//READ
	public static void main(String[] args) {
        SerialPort serialPort = new SerialPort("/dev/tty.usbmodem1421");
        try {
            serialPort.openPort();//Open serial port
            serialPort.setParams(9600, 8, 1, 0);//Set params.
            while (true) {
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
	*/

	
	/*
	//TEST
    public static void main(String[] args) {
        SerialPort serialPort = new SerialPort("/dev/tty.usbmodem1421");
        try {
            System.out.println("Port opened: " + serialPort.openPort());
            System.out.println("Params setted: " + serialPort.setParams(9600, 8, 1, 0));
            System.out.println("\"Hello World!!!\" successfully writen to port: " + serialPort.writeBytes("Hello World!!!".getBytes()));
            System.out.println("Port closed: " + serialPort.closePort());
        }
        catch (SerialPortException ex){
            System.out.println(ex);
        }
    }
    */
    
}
