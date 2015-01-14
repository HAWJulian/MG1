package gui_2;

import java.awt.EventQueue;

public class ReworkedPresentation{

	//Konstruktor der Präsi. Bekommt kein Argument und erzeugt einen neuen Frame
	public ReworkedPresentation()
	{
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {

				new ReworkedFrame(8, 16, 120);	
			}
		});
	}

}
