package gui;

import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Project.Values;

public class TestklasseJulian {
	private Values values = new Values();
	private ClockPanel[][] arrayClock;
	private ClockPanel clock;
	
	private JPanel contentPane;
	private JFrame frame;
	
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
		arrayClock=new ClockPanel[2][3];
		//Erzeuge Frame
		frame = new JFrame();
		frame.setSize(600, 920);
		frame.setTitle("test");
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(null);
		
		//Erzeugt ein Array von Uhren und startet sie
		for (int i=0; i<2; i++)
		{
			for (int j=0; j<3; j++)
			{
				arrayClock[i][j] = new ClockPanel(300);
				frame.add(arrayClock[i][j]);

				arrayClock[i][j].setBounds(300*i, 300*j, 300, 300);
			//	arrayClock[i][j].setPointerDegree(40*i, 40*i);
				arrayClock[i][j].start();
			}
		}
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
		
		//Erzeuge eine neue Uhr, füge sie dam Frame hinzu und starte sie
	/*	clock = new ClockPanel(300);
		frame.add(clock);
		clock.setPointerDegree(70, 50);
		clock.start(); */
		
	//	TestThread thread = new TestThread(clock);
	//	thread.start();
	//	System.out.println("test");
		
	}
	

	
	

}
