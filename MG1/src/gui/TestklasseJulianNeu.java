package gui;

import java.awt.EventQueue;

import Motor.MotorSteuerung;

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
				frame.setDisplay('A');
			}

		});
	}
}
