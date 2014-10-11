package gui;

import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TestKlasse{

	private ClockPanel clock;
	
	private JPanel contentPane;
	private JFrame frame;
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestKlasse frame = new TestKlasse();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		

	}
	
	public TestKlasse()
	{
		
		//Erzeuge Frame
		frame = new JFrame();
		frame.setSize(600, 620);
		frame.setTitle("test");
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		//Erzeuge eine neue Uhr, füge sie dam Frame hinzu und starte sie
		clock = new ClockPanel(600);
		frame.add(clock);
		clock.setPointerDegree(70, 50);
		clock.start();
		
	//	TestThread thread = new TestThread(clock);
	//	thread.start();
	//	System.out.println("test");
		
	}
	
	

	
	

}
