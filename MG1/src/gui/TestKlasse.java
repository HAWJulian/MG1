package gui;

import java.awt.EventQueue;
import java.awt.event.WindowEvent;

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
					ClockPanel frame = new ClockPanel(3, 8, 120);
					frame.setLocation(01, 40);
					frame.start();
					frame.setDisplay('S');
					Thread.sleep(5000);

					//frame2.dispatchEvent(new WindowEvent (frame2, WindowEvent.WINDOW_CLOSING));
					ClockPanel frame2 = new ClockPanel(8 , 16 ,120);

					frame2.start();
					Presentation presi = new Presentation(frame2);
					presi.run();
					
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
		
		
		

	}
	
	
	
	

	
	
	

	
	

}
