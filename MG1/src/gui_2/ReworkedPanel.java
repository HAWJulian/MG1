package gui_2;

import gui.ClockPanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ReworkedPanel extends ClockPanel {

	private boolean next;
	//Overworked panel with KeyListener
	public ReworkedPanel(int rows, int columns, int diameter) {
		super(rows, columns, diameter);
		this.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent arg0) {
				
				
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) {
				System.out.println(arg0);
				next = true;
				
			}
			
			@Override
			public void keyPressed(KeyEvent arg0) {
				
				
			}
		});
	}
	
	public boolean getNext()
	{
		if (next)
		{
			next=false;
			return true;
		}
		return false;
	}
	
	@Override
	public void run()
	{
		ms.refresh(clocks);
		for (int i = 0; i < columns; i++)
		{
				for (int j = 0; j < rows; j++)				{
				clocks[i][j].tick();
			}
		}
			
			
	}
	
}
