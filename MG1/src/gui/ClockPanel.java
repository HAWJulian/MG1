package gui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import Motor.MotorSteuerung;
import Project.Time;
import Project.Values;
import Project.Weather;

public class ClockPanel extends JFrame implements Runnable
{

	
	protected Thread th;
	// H�lt den Frame der Uhren

	/**
	 * 
	 */
	protected static final long serialVersionUID = 4636687551480582977L;

	// H�lt alle Uhren
	protected Clock[][] clocks;
	
	
	// Eine Variable die benutzt wird um while true Schleifen zu brechen.
	//Diese Variable auf true zu setzen beendet die aktuelle Schleife
	protected boolean loopbreaker;

	// H�lt die Informationen �ber den Frame, Anzahl der Zeilen, Spalten und den
	// Durchmesser einer Uhr
	protected int rows;
	protected int columns;
	protected int diameter;
	protected MotorSteuerung ms;
	// Erzeugt ein Objekt vom Typ values, welches f�r die �bersetzung von
	// darzustellenden Objekten in Gradzahl der Zeiger zust�ndig ist
	protected Values values = new Values();


	public Clock[][] getClocks()
	{
		return clocks;
	}
	//Vergr��ert verkleinert das panel
	public void changeAmountOfClocks(int targetRows, int targetColumns, int targetDiameter)
	{
		th.stop();
		initPanel(targetRows, targetColumns, targetDiameter);
		start();
		
	}
	
	protected void initPanel(int rows, int columns, int diameter)
	{
		
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent arg0) {
				System.out.println("typed");
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("typed2");
			}
			
			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("typed3");
			}
		});
		setSize(columns * diameter + 10, rows * diameter + 40);
		setTitle("ClockCeption");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(null);
		clocks = new Clock[columns][rows];
		for (int i = 0; i < columns; i++)
		{
			for (int j = 0; j < rows; j++)
			{
				clocks[i][j] = new Clock(diameter);
				add(clocks[i][j]);

				clocks[i][j].setBounds(diameter * i, diameter * j, diameter,
						diameter);
				clocks[i][j].initClock();
			}
		}
		
		this.rows = rows;
		this.columns = columns;
		this.diameter = diameter;
		this.loopbreaker =false;

	
	}


	public ClockPanel(int rows, int columns, int diameter)
	{
		initPanel(rows, columns, diameter);
		ms = new MotorSteuerung(this.getClocks());
	}

	// Startet das Clockpanel
	public void start()
	{
		th = new Thread(this);
		th.start();
	}

	@Override
	public void run()
	{
		while (true)
		{
			ms.refresh(clocks);
			for (int i = 0; i < columns; i++)
			{
				for (int j = 0; j < rows; j++)
				{
					clocks[i][j].tick();
				}
			}
			try
			{
				Thread.sleep(10);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}	
	}
	
	public void setTickrate(int tickrate, int posX, int posY)
	{
		clocks[posX][posY].setTickrate(tickrate);
	}
	
	//Setzt die tickraten aller Uhren auf 1
	public void resetTickrate()
	{
		for (int i=0; i<columns; i++)
		{
			for (int j=0; j<rows; j++)
			{
				clocks[i][j].setTickrate(1);
			}
		}
	}

	// Sagt dem Panel was es darstellen soll. �bergeben wird ein char welcher
	// ein K�rzel ist.
	//
	public void setDisplay(char selector)
	{
		switch (selector)
		{
		case 'T':
			displayTimeHuge();
			break;
		// "Small" kleine Darstellung der Zeit
		case 'S':
			displayTime();
			break;
		case 'W':
			displayWeather();
			break;
		case 'C':
			displayChars();
			break;
		case 'A':
			playAnimation1();
			break;
		case 'B':
			playAnimation2();
			break;
		case 'D':
			playAnimation3();
			break;
		case 'E':
			playAnimation4();
			break;
		default:
			clocksToDefault();
			break;
		}
	}
	
	
	public void breakLoop()
	{
		loopbreaker = true;
	}
	
	//checkt ob alle uhren stehen
	// true = alle uhren stehen
	//
	public boolean checkIfNoClocksRotates()
	{
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < columns; j++)
			{
				if(clocks[j][i].getIsMoving())
				{
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean checkIfColumnXNotRotates(int x)
	{
		for(int i = 0; i < rows; i++)
		{
			if(clocks[x][i].getIsMoving())
			{
				return false;
			}
		}
		return true;
	}

	// Setzt alle Zeiger auf "default Stellung" (180�)
	protected void clocksToDefault()
	{
		values.setdefault(clocks);
	}

	// Stellt die aktuelle Uhrzeit in gro�en Zahlen dar, Methode von Julian
	protected void displayTimeHuge()
	{
		Time time = new Time();
		displayTimeHugehelper(time);
		while (true)
		{
			if (loopbreaker)
			{
				loopbreaker = false;
				break;
			}
			try
			{
				Thread.sleep(1000);
				if (time.refreshTime())
				{
					displayTimeHugehelper(time);
				}
				else
				{
					// test!
				}
			}
			catch (InterruptedException e)
			{

				e.printStackTrace();
			}
		}
	}

	protected void displayTimeHugehelper(Time time)
	{
		values.displayCharacterhuge(String.valueOf(time.getHours0()).charAt(0),
				0, 1, clocks);
		values.displayCharacterhuge(String.valueOf(time.getHours1()).charAt(0),
				4, 1, clocks);
		values.displayCharacterhuge(String.valueOf(time.getMinutes0())
				.charAt(0), 8, 1, clocks);
		values.displayCharacterhuge(String.valueOf(time.getMinutes1())
				.charAt(0), 12, 1, clocks);
	}

	// Zeit in klein darstellen. Julian
	protected void displayTime()
	{
		Time time = new Time();
		values.displayCharacter(String.valueOf(time.getHours0()).charAt(0), 0,
				0, clocks);
		values.displayCharacter(String.valueOf(time.getHours1()).charAt(0), 2,
				0, clocks);
		values.displayCharacter(String.valueOf(time.getMinutes0()).charAt(0),
				4, 0, clocks);
		values.displayCharacter(String.valueOf(time.getMinutes1()).charAt(0),
				6, 0, clocks);
		while (true)
		{
			if (loopbreaker)
			{
				loopbreaker =false;
				break;
			}
			try
			{
				Thread.sleep(1000);
				if (time.refreshTime())
				{
					values.displayCharacter(String.valueOf(time.getHours0())
							.charAt(0), 0, 0, clocks);
					values.displayCharacter(String.valueOf(time.getHours1())
							.charAt(0), 2, 0, clocks);
					values.displayCharacter(String.valueOf(time.getMinutes0())
							.charAt(0), 4, 0, clocks);
					values.displayCharacter(String.valueOf(time.getMinutes1())
							.charAt(0), 6, 0, clocks);
				}
				else
				{
					// test!
				}
			}
			catch (InterruptedException e)
			{

				e.printStackTrace();
			}
			//TEST!
			break;
		}
	}

	// Stellt das Wetter dar. Methode von Julian
	protected void displayWeather()
	{
		Weather w = new Weather();
		// api call (get current weather of (city)
		w.currentWeather("Hamburg");
		values.setdefault(clocks);
		while (true)
			
		{
			if (loopbreaker)
			{
				loopbreaker = false;
				break;
			}
			int sleep = 9000;
			// step#1 show conditions	
			displayConditions(w, sleep);
			// step#2 show temperature
			displayTemperature(w, sleep);
			// step#3 show humidity
			displayHumidity(w, sleep);
			
			values.displayCharacter('w', 4, 3, clocks);
			values.displayCharacter('i', 6, 3, clocks);
			values.displayCharacter('n', 8, 3, clocks);
			values.displayCharacter('d', 10, 3, clocks);
			sleep(sleep);
			
			values.setdefault(clocks);
			// step#4 show wind (direction/speed)
			int degreehelper = Integer.parseInt(w.getWinddegrees());
			if (degreehelper > 180)
			{
				degreehelper -= 180;
			}
			else if(degreehelper == 180)
			{
				degreehelper = 0;
			}
			else
			{
				degreehelper += 180;
			}
			values.setall(degreehelper, degreehelper, clocks);
			values.displayCharacter('n', 7, 0, clocks);
			values.displayCharacter('s', 7, 5, clocks);
			values.displayCharacter('w', 0, 3, clocks);
			values.displayCharacter('e', 14, 3, clocks);
			sleep(50);
			while(!checkIfNoClocksRotates())
			{
				sleep(200);
			}
			for (int wind = 0; wind <= 20; wind++)
			{

				if (wind % 2 == 0)
				{
					values.setall(degreehelper + 10, degreehelper + 10, clocks);
					values.displayCharacter('n', 7, 0, clocks);
					values.displayCharacter('s', 7, 5, clocks);
					values.displayCharacter('w', 0, 3, clocks);
					values.displayCharacter('e', 14, 3, clocks);
				}
				else
				{
					values.setall(degreehelper - 10, degreehelper - 10, clocks);
					values.displayCharacter('n', 7, 0, clocks);
					values.displayCharacter('s', 7, 5, clocks);
					values.displayCharacter('w', 0, 3, clocks);
					values.displayCharacter('e', 14, 3, clocks);
				}
				sleep(350);
			}
			values.setall(degreehelper, degreehelper, clocks);
			values.displayCharacter('n', 7, 0, clocks);
			values.displayCharacter('s', 7, 5, clocks);
			values.displayCharacter('w', 0, 3, clocks);
			values.displayCharacter('e', 14, 3, clocks);
			sleep(sleep);
			values.setdefault(clocks);
			
			//speed
			values.displayCharacter('s', 3, 3, clocks);
			values.displayCharacter('p', 5, 3, clocks);
			values.displayCharacter('e', 7, 3, clocks);
			values.displayCharacter('e', 9, 3, clocks);
			values.displayCharacter('d', 11, 3, clocks);
			sleep(sleep);
			values.setdefault(clocks);
			String windspeed = w.getWindspeed();
			if(windspeed.length() == 1)
			{
				values.displayCharacterhuge(windspeed.charAt(0), 4, 1, clocks);
				values.drawKMH(8, 1, clocks);
			}
			else if(windspeed.length() == 2)
			{
				values.displayCharacterhuge(windspeed.charAt(0), 2, 1, clocks);
				values.displayCharacterhuge(windspeed.charAt(1), 6, 1, clocks);
				values.drawKMH(10, 1, clocks);
			}
			else if(windspeed.length() == 3)
			{
				values.displayCharacterhuge(windspeed.charAt(0), 0, 1, clocks);
				values.displayCharacterhuge(windspeed.charAt(1), 4, 1, clocks);
				values.displayCharacterhuge(windspeed.charAt(2), 8, 1, clocks);
				values.drawKMH(12, 1, clocks);
			}
			else
			{
				values.setdefault(clocks);
			}
			sleep(sleep);
			values.setdefault(clocks);
		}
		// display w.getHumidity()
		// step#4 show wind speed/direction
		// display w.getWinddir()/w.getWinddegrees()/w.getWindspeed()
	}
	protected void displayTemperature(Weather w, int sleep)
	{
		
		values.displayCharacter('t', 0, 1, clocks);
		values.displayCharacter('e', 2, 1, clocks);
		values.displayCharacter('m', 4, 1, clocks);
		values.displayCharacter('p', 6, 1, clocks);
		values.displayCharacter('e', 8, 1, clocks);
		values.displayCharacter('r', 10, 1, clocks);
		values.displayCharacter('a', 12, 1, clocks);
		values.displayCharacter('-', 14, 1, clocks);
		values.displayCharacter('t', 0, 4, clocks);
		values.displayCharacter('u', 2, 4, clocks);
		values.displayCharacter('r', 4, 4, clocks);
		values.displayCharacter('e', 6, 4, clocks);
		sleep(sleep);
		
		values.setdefault(clocks);
		// get length of temperature
		int templength = w.getTemp().length();
		//temp is negative
		if(w.getTemp().charAt(0) == '-')
		{
			if(templength == 2)
			{
				values.displayCharacterhuge('�', 2, 3, clocks);
				values.displayCharacterhuge(w.getTemp().charAt(1), 4, 1, clocks);
				values.displayCharacterhuge('�', 8, 1, clocks);
				values.displayCharacterhuge('C', 10, 1, clocks);
			}
			else if(templength == 3)
			{
				values.displayCharacterhuge('�', 0, 3, clocks);
				values.displayCharacterhuge(w.getTemp().charAt(1), 2, 1, clocks);
				values.displayCharacterhuge(w.getTemp().charAt(2), 6, 1, clocks);
				values.displayCharacterhuge('�', 10, 1, clocks);
				values.displayCharacterhuge('C', 12, 1, clocks);
			}
		}
		//temp is positive
		else
		{
			if(templength == 1)
			{
				values.displayCharacterhuge(w.getTemp().charAt(0), 3, 1, clocks);
				values.displayCharacterhuge('�', 7, 1, clocks);
				values.displayCharacterhuge('C', 9, 1, clocks);
			}
			else if(templength == 2)
			{
				values.displayCharacterhuge(w.getTemp().charAt(0), 1, 1, clocks);
				values.displayCharacterhuge(w.getTemp().charAt(1), 5, 1, clocks);
				values.displayCharacterhuge('�', 9, 1, clocks);
				values.displayCharacterhuge('C', 11, 1, clocks);
			}
		}
		/*
		if (templength == 1)
		{
			values.displayCharacterhuge(w.getTemp().charAt(0), 2, 1, clocks);
			values.displayCharacterhuge('�', 6, 1, clocks);
			values.displayCharacterhuge('C', 8, 1, clocks);
		}
		else if (templength == 2 || templength == 3)
		{
			int x = 0;
			if (templength == 3)
			{
				
				x++;
			}
			values.displayCharacterhuge(w.getTemp().charAt(x), 2, 1, clocks);
			values.displayCharacterhuge(w.getTemp().charAt(x+1), 6, 1, clocks);
			values.displayCharacterhuge('�', 10, 1, clocks);
			values.displayCharacterhuge('C', 12, 1, clocks);
		}
		else
		{
			values.setdefault(clocks);
		}
		*/
		sleep(sleep);
		values.setdefault(clocks);
	}
	protected void displayHumidity(Weather w, int sleep)
	{
		
		values.displayCharacter('h', 0, 3, clocks);
		values.displayCharacter('u', 2, 3, clocks);
		values.displayCharacter('m', 4, 3, clocks);
		values.displayCharacter('i', 6, 3, clocks);
		values.displayCharacter('d', 8, 3, clocks);
		values.displayCharacter('i', 10, 3, clocks);
		values.displayCharacter('t', 12, 3, clocks);
		values.displayCharacter('y', 14, 3, clocks);
		sleep(sleep);
		
		values.setdefault(clocks);
		int humlength = w.getHumidity().length();
		if (humlength == 2 || humlength == 3)
		{
			values.displayCharacterhuge(w.getHumidity().charAt(humlength - 2),
					6, 1, clocks);
			values.displayCharacterhuge('%', 10, 2, clocks);
			if (humlength == 3)
			{
				values.displayCharacterhuge(w.getHumidity().charAt(0), 2, 1,
						clocks);
			}
		}
		else if (humlength == 4)
		{
			values.displayCharacterhuge('1', 0, 1, clocks);
			values.displayCharacterhuge('0', 4, 1, clocks);
			values.displayCharacterhuge('0', 8, 1, clocks);
			values.displayCharacterhuge('%', 12, 2, clocks);
		}
		else
		{
			values.setdefault(clocks);
		}

		sleep(sleep);

		values.setdefault(clocks);
	}
	protected void displayConditions(Weather w, int sleep)
	{
		
		values.displayCharacter('w', 1, 3, clocks);
		values.displayCharacter('e', 3, 3, clocks);
		values.displayCharacter('a', 5, 3, clocks);
		values.displayCharacter('t', 7, 3, clocks);
		values.displayCharacter('h', 9, 3, clocks);
		values.displayCharacter('e', 11, 3, clocks);
		values.displayCharacter('r', 13, 3, clocks);
		sleep(sleep);
		
		values.setall(270, 270, clocks);
		// get current weather
		// step#1 show weather (cloudy, sunny, etc.)
		values.showWeather(w.getWeather().toLowerCase(), 0, 0, clocks);
		sleep(sleep);
		values.setdefault(clocks);

	}
	// Only used for testing issues. Patrick
	protected void displayChars()
	{
		// execute step by step with debugger, else make the thread sleep for
		// ~2k ms after each call
		// otherwise this will only display the last call.
		values.displayCharacter('1', 0, 0, clocks);
		values.displayCharacter('2', 0, 0, clocks);
		values.displayCharacter('3', 0, 0, clocks);
		values.displayCharacter('4', 0, 0, clocks);
		values.displayCharacter('5', 0, 0, clocks);
		values.displayCharacter('6', 0, 0, clocks);
		values.displayCharacter('7', 0, 0, clocks);
		values.displayCharacter('8', 0, 0, clocks);
		values.displayCharacter('9', 0, 0, clocks);
		values.displayCharacter('0', 0, 0, clocks);
		values.displayCharacter('a', 0, 0, clocks);
		values.displayCharacter('b', 0, 0, clocks);
		values.displayCharacter('c', 0, 0, clocks);
		values.displayCharacter('d', 0, 0, clocks);
		values.displayCharacter('e', 0, 0, clocks);
		values.displayCharacter('f', 0, 0, clocks);
		values.displayCharacter('g', 0, 0, clocks);
		values.displayCharacter('h', 0, 0, clocks);
		values.displayCharacter('i', 0, 0, clocks);
		values.displayCharacter('j', 0, 0, clocks);
		values.displayCharacter('k', 0, 0, clocks);
		values.displayCharacter('l', 0, 0, clocks);
		values.displayCharacter('m', 0, 0, clocks);
		values.displayCharacter('n', 0, 0, clocks);
		values.displayCharacter('o', 0, 0, clocks);
		values.displayCharacter('p', 0, 0, clocks);
		values.displayCharacter('q', 0, 0, clocks);
		values.displayCharacter('r', 0, 0, clocks);
		values.displayCharacter('s', 0, 0, clocks);
		values.displayCharacter('t', 0, 0, clocks);
		values.displayCharacter('u', 0, 0, clocks);
		values.displayCharacter('v', 0, 0, clocks);
		values.displayCharacter('w', 0, 0, clocks);
		values.displayCharacter('x', 0, 0, clocks);
		values.displayCharacter('y', 0, 0, clocks);
		values.displayCharacter('z', 0, 0, clocks);
	}
	
	public boolean isLoopBroken()
	{
		return !loopbreaker;
	}
	
	
	
	protected void playAnimation1()
	{
		int y = 1000;
		// step#1 move pointer in start position
		values.startanimation1(rows, columns, clocks);
		sleep(6000);
		// step#2 rotate pointer (for a set amount of degree)
		values.rotateover360(20000, 20000, true, false, clocks);
		sleep(6000);
		// step#3 stop them column by column
		stopAniCbyC(y);
		
	}
	
	protected void playAnimation2()
	{
		int y = 100;
		//start position
		values.startanimation2(rows, columns, clocks);
		sleep(3600);
		//rotate (atm = 720�)
		values.rotateClocks(rows, columns, clocks);
		stopAniCbyC(y);
		
	}
	// method to stop any display/animatioin to morph into display time huge, 
	// stoping it column by column - waiting y ms after each column
	protected void stopAniCbyC(int y)
	{
		while(true)
		{
			Time time = new Time();
			for(int i = 0; i < columns; i ++)
			{
				//display no#1
				if (i < 4)
				{
					values.displayAnimationCharacter(time.getHours0(), i,
							clocks);
					sleep(y);
				}
				//display no#2
				else if (i < 8)
				{
					values.displayAnimationCharacter(time.getHours1(), i,
							clocks);
					sleep(y);
				}
				//display no#3
				else if (i < 12)
				{
					values.displayAnimationCharacter(time.getMinutes0(), i,
							clocks);
					sleep(y);
				}
				//display no#4
				else
				{
					values.displayAnimationCharacter(time.getMinutes1(), i,
							clocks);
					sleep(y);
				}
	
			}
			if(checkIfNoClocksRotates())
			{
				break;
			}
		}
	}
	
	protected void playAnimation3()
	{
		values.startanimation3(rows, columns, clocks);
		sleep(3000);
		values.animation3(rows, columns, clocks);
	}
	
	protected void playAnimation4()
	{
		values.startanimation4(rows, columns, clocks);
		sleep(5000);
		values.animation4(rows, columns, clocks);
	}
	protected void sleep(int duration)
	{
		try
		{
			Thread.sleep(duration);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	

}
