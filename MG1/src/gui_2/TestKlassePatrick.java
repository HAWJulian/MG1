package gui_2;

import gui.Clock;
import gui.ClockPanel;

import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Project.Values;

public class TestKlassePatrick{

	
	private Clock clock;
	
	private JPanel contentPane;
	private ClockPanel frame;
	private Values values = new Values();
	//Test
	
	//NVM this
	public static void main(String[] args) {
		//ThreadedPresentation presi = new ThreadedPresentation();
		//presi.run();
		
		
		//panel.setIcon(new ImageIcon	(Frame.class.getResource("/gui_2/importantPicture.png")));
		
		stuff();	
	
		

	}
	
	private static void stuff()
	{

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				JLabel label = new JLabel();
				label.setIcon(new ImageIcon(Frame.class.getResource("/gui_2/importantPicture.png")));
				try {
					JLabel[] labels = new JLabel[12];
					JFrame[] frames = new JFrame[12];
					for (int i = 0; i < frames.length; i++) {
						labels[i] = new JLabel();
						labels[i].setIcon(new ImageIcon(Frame.class.getResource("/gui_2/importantPicture.png")));
						frames[i]= new JFrame();
						frames[i].setLocationRelativeTo(null);
						frames[i].setResizable(false);
					//	frames[i].setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						frames[i].setVisible(true);
						frames[i].setBounds((300*(i/3)), (300*i)%900, 300, 300);
						frames[i].add(labels[i]);
						
						frames[i].addWindowListener(new WindowAdapter() {
							@Override
							public void windowClosing(WindowEvent event)
							{
								stuff();
							}
						}); 
						
					/*	while (true)
						{
							for (int j = 0; j < frames.length; j++) 
							{
								frames[i].setLocation((int)(800*Math.random()), (int)(800*Math.random()));
								Thread.sleep(1000);
							}
						}*/
					}
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private static int ex()
	{
		stuff();
		return 2;
	}
	
	
	
	

	
	
	

	
	

}
