package gui_2;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class ReworkedFrame extends JFrame
{
	
	//H�lt den Character der als letztes getippt wurde. Dies ist wichtig um festzustellen ob er sich ge�ndert hat
	private char lastTyped;
	
	//H�lt das Panel, welches die Uhren h�lt und den gesamten Content anzeigt
	private ReworkedPanel panel;
	
	
	//Konstruktor des Frames. Bekommt die Anzahl Zeilen, Spalten und den Durchmesser �bergeben
	public ReworkedFrame(int rows, int columns, int diameter)
	{
	
		//setUndecorated(true);
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		this.getContentPane().setBackground(Color.WHITE);
		setUndecorated(true);
		setTitle("ClockCeption");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(columns * diameter + 10, rows * diameter + 40);
		setSize(1920, 1080);
		setVisible(true);
		setLayout(null);
		//setBounds(10, 10, columns * diameter + 10,  rows * diameter + 40);
		setLocation(5, 5);
		Image screen =createImage(diameter, diameter);
		lastTyped = 1;
		
		panel = new ReworkedPanel(rows, columns, diameter, screen);
		panel.setSelector('P');
		add (panel);
		panel.start();
		addKeyListener(new KeyListener() {
			
			
			//Der KeyListener des Frames. Checkt jedes Mal wenn eine Taste losgelassen wird ob es eine andere ist
			//als die, die als letztes gedr�ckt werden
			@Override
			public void keyTyped(KeyEvent arg0) {
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) {
				char a = Character.toUpperCase(arg0.getKeyChar());
				System.out.println(arg0.getKeyCode());
				if (arg0.getKeyCode()==27)
				{
					panel.resetClock();
					System.exit(0);
				}
				if (a=='-')
				{
					panel.renderCircles();
				}
				else if (a=='.')
				{
					panel.focusMotorClock();
					System.out.println("motor");
				}
				else
				{
					if (a!=lastTyped)
					{
						System.out.println("key changed: "+a);
						lastTyped = a;
						panel.setSelector(lastTyped);
				
					}
				}
			}
			
			@Override
			public void keyPressed(KeyEvent arg0) {
				
			}
		});	
	}
}