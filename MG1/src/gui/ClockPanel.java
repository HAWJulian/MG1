package gui;

import javax.swing.JFrame;

import Project.Time;
import Project.Values;

public class ClockPanel extends JFrame implements Runnable {
	
	//Hält den Frame der Uhren
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4636687551480582977L;

	//Hält alle Uhren
	private Clock[][] clocks;
	
	//Hält die Informationen über den Frame, Anzahl der Zeilen, Spalten und den Durchmesser einer Uhr
	private int rows;
	private int columns;
	private int diameter;
	
	//Erzeugt ein Objekt vom Typ values, welches für die Übersetzung von darzustellenden Objekten in Gradzahl der Zeiger zuständig ist
	private Values values = new Values();
	
	public Clock[][] getClocks()
	{
		return clocks;
	}
	
	public ClockPanel(int rows, int columns, int diameter)
	{
		this.rows = rows;
		this.columns = columns;
		this.diameter = diameter;
		
		setSize(columns*diameter+10 , rows*diameter+10 );
		System.out.println(rows*diameter+10);
		setTitle("ClockCeption");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(null);
		clocks = new Clock[columns][rows];
		for (int i=0; i<columns; i++)
		{
			for (int j=0; j<rows; j++)
			{
				clocks[i][j] = new Clock(diameter);
				add(clocks[i][j]);

				clocks[i][j].setBounds(diameter*i, diameter*j, diameter, diameter);
			//	arrayClock[i][j].setPointerDegree(40*i, 40*i);
				clocks[i][j].initClock();
			}
		}
		
	}
	
	public void start()
	{
		Thread th = new Thread(this);
		th.start();
	}



	@Override
	public void run() {
		while (true)
		{
			for (int i=0; i<columns; i++)
			{
				for (int j=0; j<rows; j++)
				{
					clocks[i][j].tick();
				}
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	//Stellt die aktuelle Uhrzeit in großen Zahlen dar, Methode von Julian
	public void displayTimeHuge()
	{
		Time time = new Time();
		values.displayCharacterhuge(String.valueOf(time.getHours0()).charAt(0), 0, 1, clocks);
		values.displayCharacterhuge(String.valueOf(time.getHours1()).charAt(0), 4, 1, clocks);
		values.displayCharacterhuge(String.valueOf(time.getMinutes0()).charAt(0), 8, 1, clocks);
		values.displayCharacterhuge(String.valueOf(time.getMinutes1()).charAt(0), 12, 1, clocks);
		while (true) 
		{
			try 
			{
				Thread.sleep(1000);
				if(time.refreshTime())
				{
					values.displayCharacterhuge(String.valueOf(time.getHours0()).charAt(0), 0, 1, clocks);
					values.displayCharacterhuge(String.valueOf(time.getHours1()).charAt(0), 4, 1, clocks);
					values.displayCharacterhuge(String.valueOf(time.getMinutes0()).charAt(0), 8, 1, clocks);
					values.displayCharacterhuge(String.valueOf(time.getMinutes1()).charAt(0), 12, 1, clocks);
				}
				else
				{
					//test!
				}
			} 
			catch (InterruptedException e)
			{

				e.printStackTrace();
			}
		}
	}
	
	
	
	
}
