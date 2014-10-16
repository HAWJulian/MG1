package gui;

import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TestKlasse{

	private Clock[][] arrayClock;
	private Clock clock;
	
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
		arrayClock=new Clock[2][3];
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
				arrayClock[i][j] = new Clock(300);
				frame.add(arrayClock[i][j]);

				arrayClock[i][j].setBounds(300*i, 300*j, 300, 300);
			//	arrayClock[i][j].setPointerDegree(40*i, 40*i);
				arrayClock[i][j].start();
			}
		}

	}
	
	

	
	

}
