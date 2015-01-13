package gui;

import java.awt.EventQueue;

public class TestklasseJulianNeu
{
	private ClockPanel frame;

	public static void main(String[] args)
	{

		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				ClockPanel frame = new ClockPanel(8, 16, 120);
				frame.start();
				frame.setDisplay('E');
			}

		});
	}
}


