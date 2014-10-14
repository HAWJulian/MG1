package gui;

import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Project.Time;
import Project.Values;

public class TestklasseJulian {
	private Values values = new Values();
	private ClockPanel[][] arrayClock;
	private ClockPanel clock;
	
	private JPanel contentPane;
	private JFrame frame;
	int size;
	int columns;
	int rows;
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestklasseJulian frame = new TestklasseJulian();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		

	}
	
	public TestklasseJulian()
	{
		size = 200;
		columns = 8;
		rows = 3;
		arrayClock=new ClockPanel[columns][rows];
		//Erzeuge Frame
		frame = new JFrame();
		frame.setSize(columns * size, (rows * size) + 20);
		frame.setTitle("test");
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(null);
		
		//Erzeugt ein Array von Uhren und startet sie
		for (int i=0; i<columns; i++)
		{
			for (int j=0; j<rows; j++)
			{
				arrayClock[i][j] = new ClockPanel(size);
				frame.add(arrayClock[i][j]);

				arrayClock[i][j].setBounds(size*i, size*j, size, size);
			//	arrayClock[i][j].setPointerDegree(40*i, 40*i);
				arrayClock[i][j].start();
			}
		}
		displayTime();
	}
	
	private void displayTime() 
	{
		Time time = new Time();
		values.displayCharacter(String.valueOf(time.getHours0()).charAt(0), 0, 0, arrayClock);
		values.displayCharacter(String.valueOf(time.getHours1()).charAt(0), 2, 0, arrayClock);
		values.displayCharacter(String.valueOf(time.getMinutes0()).charAt(0), 4, 0, arrayClock);
		values.displayCharacter(String.valueOf(time.getMinutes1()).charAt(0), 6, 0, arrayClock);
		
		System.out.println((char) time.getHours0());
		while (true) 
		{
			try 
			{
				Thread.sleep(1000);
				if(time.refreshTime())
				{
					values.displayCharacter(String.valueOf(time.getHours0()).charAt(0), 0, 0, arrayClock);
					values.displayCharacter(String.valueOf(time.getHours1()).charAt(0), 2, 0, arrayClock);
					values.displayCharacter(String.valueOf(time.getMinutes0()).charAt(0), 4, 0, arrayClock);
					values.displayCharacter(String.valueOf(time.getMinutes1()).charAt(0), 6, 0, arrayClock);
				}
				else
				{
					//test!
					//values.animation1(rows, columns, arrayClock);
				}
			} 
			catch (InterruptedException e)
			{

				e.printStackTrace();
			}
		}
	}
	
	private void playAnimation1()
	{
		//step#1 move pointer in start position
		//step#2 rotate pointer (for a set amount of seconds)
		//step#3 stop them column by column
	}
	
	//testmethod
	private void displayChars()
	{
		//execute step by step with debugger, else make the thread sleep for ~2k ms after each call
		values.displayCharacter('1', 0, 0, arrayClock);
		values.displayCharacter('2', 0, 0, arrayClock);
		values.displayCharacter('3', 0, 0, arrayClock);
		values.displayCharacter('4', 0, 0, arrayClock);
		values.displayCharacter('5', 0, 0, arrayClock);
		values.displayCharacter('6', 0, 0, arrayClock);
		values.displayCharacter('7', 0, 0, arrayClock);
		values.displayCharacter('8', 0, 0, arrayClock);
		values.displayCharacter('9', 0, 0, arrayClock);
		values.displayCharacter('0', 0, 0, arrayClock);
		values.displayCharacter('a', 0, 0, arrayClock);
		values.displayCharacter('b', 0, 0, arrayClock);
		values.displayCharacter('c', 0, 0, arrayClock);
		values.displayCharacter('d', 0, 0, arrayClock);
		values.displayCharacter('e', 0, 0, arrayClock);
		values.displayCharacter('f', 0, 0, arrayClock);
		values.displayCharacter('g', 0, 0, arrayClock);
		values.displayCharacter('h', 0, 0, arrayClock);
		values.displayCharacter('i', 0, 0, arrayClock);
		values.displayCharacter('j', 0, 0, arrayClock);
		values.displayCharacter('k', 0, 0, arrayClock);
		values.displayCharacter('l', 0, 0, arrayClock);
		values.displayCharacter('m', 0, 0, arrayClock);
		values.displayCharacter('n', 0, 0, arrayClock);
		values.displayCharacter('o', 0, 0, arrayClock);
		values.displayCharacter('p', 0, 0, arrayClock);
		values.displayCharacter('q', 0, 0, arrayClock);
		values.displayCharacter('r', 0, 0, arrayClock);
		values.displayCharacter('s', 0, 0, arrayClock);
		values.displayCharacter('t', 0, 0, arrayClock);
		values.displayCharacter('u', 0, 0, arrayClock);
		values.displayCharacter('v', 0, 0, arrayClock);
		values.displayCharacter('w', 0, 0, arrayClock);
		values.displayCharacter('x', 0, 0, arrayClock);
		values.displayCharacter('y', 0, 0, arrayClock);
		values.displayCharacter('z', 0, 0, arrayClock);
	}
	

	
	

}
