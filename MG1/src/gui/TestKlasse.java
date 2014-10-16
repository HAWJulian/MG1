package gui;

import java.awt.EventQueue;

import javax.swing.JPanel;

import Project.Values;

public class TestKlasse{

	
	private Clock clock;
	
	private JPanel contentPane;
	private ClockPanel frame;
	private Values values = new Values();
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClockPanel frame = new ClockPanel(8 , 16 ,100);
					frame.start();
					frame.setDisplay('W');
					
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
		
		
		

	}
	
	
	
	

	
	
	

	
	

}
