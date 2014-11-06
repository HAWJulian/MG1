package gui;

public class Presentation implements Runnable{

	//Diese Klasse soll am Ende diesein die unsere Pr�sentation f�r MG1 kontrolliert. Looking forward!
	
	private ClockPanel panel;
	@Override
	public void run() {

		panel.setDisplay('T');
		panel.setDisplay('S');
		panel.setDisplay('W');
		
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
