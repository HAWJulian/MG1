package gui;

public class Presentation implements Runnable{

	
	private ClockPanel panel;
	@Override
	public void run() {
		panel.setDisplay('S');
		panel.breakLoop();
		sleep(10000);
		panel.setDisplay('T');
		panel.breakLoop();
		
	}
	
	
	private void sleep(int duration)
	{
		try {
			Thread.sleep(duration);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Presentation(ClockPanel panel)
	{
		this.panel = panel;
	}
	
	
	
	

}
