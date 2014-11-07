package gui_2;

import gui.ClockPanel;

import java.util.ArrayList;

public class ThreadedPresentation implements Runnable{

	private int actualEvent = 0;
	private int amountOfEvents = 0;
	//Holods the frame
	private ClockPanel frame;
	
	private int timeLeftTillEventChanges;
	
	private ArrayList<PresentationEvent> eventQueue = new ArrayList<PresentationEvent>();
	
	@Override
	public void run() {
		
		while (true)
		{
			if (timeLeftTillEventChanges==0)
			{
				if (actualEvent<amountOfEvents)
				{
					PresentationEvent event = eventQueue.get(actualEvent);
					timeLeftTillEventChanges = event.getDuration();
					if (event.getDuration()!=0)
					{
						frame.setDisplay(event.getSelector());
						
					}
					else
					{
						frame.changeAmountOfClocks(event.getRows(), event.getColumns(), event.getDiameter());
						timeLeftTillEventChanges+=2;
					}
					actualEvent++;
				}
			}
			frame.run();
			timeLeftTillEventChanges--;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public ThreadedPresentation()
	{
		frame = new ReworkedPanel(3, 8, 120);
		frame.setLocation(01, 40);
		frame.start();
		actualEvent=0;
		addEventToQueue(new PresentationEvent(600, 'S'));
		addEventToQueue(new PresentationEvent(8, 16, 120));
		addEventToQueue(new PresentationEvent(600, 'T'));
		addEventToQueue(new PresentationEvent(600, 'S'));
	}
	
	public void addEventToQueue(PresentationEvent event)
	{
		eventQueue.add(event);
		amountOfEvents++;
	}

}
