package gui_2;
//Julian ist toll.

import java.awt.Image;

import javax.swing.JPanel;

import Motor.MotorSteuerung;
import Project.Time;
import Project.Weather;

public class ReworkedPanel extends JPanel implements Runnable
{
	
	private boolean cirles = false;
	//Speichert welche Operation momentan auf dem Panel läuft, bzhw welche als nächstes ablaufen soll. Siehe setDisplay()
	private char selector;
	
	// Hält den Frame der Uhren
	protected Thread th;
	
	/**
	 * 
	 */
	
	private boolean isAnimationCalled;
	
	private boolean motorCaller = false;
	
	protected static final long serialVersionUID = 4636687551480582977L;

	// Hält alle Uhren
	protected ReworkedClock[][] clocks;
	
	//Hält ein BIld, welches alle Uhren erhalten auf dem sie sich selbst zeichen können
	private Image image;
	
	
	// Hält die Informationen über den Frame, Anzahl der Zeilen, Spalten und den
	// Durchmesser einer Uhr
	protected int rows;
	protected int columns;
	protected int diameter;
	protected MotorSteuerung ms;
	
	// Erzeugt ein Objekt vom Typ values, welches für die Übersetzung von
	// darzustellenden Objekten in Gradzahl der Zeiger zuständig ist
	protected ReworkedValues values = new ReworkedValues();

	//Getter Methode für die clocks
	public ReworkedClock[][] getClocks()
	{
		return clocks;
	}
	//Vergrößert verkleinert das panel
	@Deprecated
	public void changeAmountOfClocks(int targetRows, int targetColumns, int targetDiameter)
	{
		th.stop();
		initPanel(targetRows, targetColumns, targetDiameter);
		start();
	}
	
	public void focusMotorClock()
	{
		int[] data = ms.getFocussedClock();
		clocks[data[0]][data[1]].makeItFancy();
	}
	
	
	//Initalisiert das Panel
	protected void initPanel(int rows, int columns, int diameter)
	{
		
		setSize(columns * diameter + 10, rows * diameter + 40);
		setVisible(true);
		setLayout(null);
		clocks = new ReworkedClock[columns][rows];
		for (int i = 0; i < columns; i++)
		{
			for (int j = 0; j < rows; j++)
			{
				clocks[i][j] = new ReworkedClock(diameter, image);
				add(clocks[i][j]);

				clocks[i][j].setBounds(diameter * i, diameter * j, diameter,
						diameter);
			}
		}
		
		this.rows = rows;
		this.columns = columns;
		this.diameter = diameter;
		
	
	}
	
	//Konstruktor des Panel. Übergeben werden die Anzahl Zeilen/Spalten, sowie ein Bild auf dem gezeichnet werden kann
	//und alle Uhren
	@Deprecated
	public ReworkedPanel (int rows, int columns, int diameter, Image im,
			ReworkedClock[][] clock)
	{
		this.image = im;
		initPanel(rows, columns, diameter);
		this.clocks = clock;
	}


	//Zweiter Konstruktor der Uhr. Einziger Unterschied ist dass das Panel die Uhren hier selber erzeugt.
	//Diesen Konstruktor benutzen!
	public ReworkedPanel(int rows, int columns, int diameter, Image im)
	{
		this.image = im;
		initPanel(rows, columns, diameter);
		ms = new MotorSteuerung(this.getClocks());
		isAnimationCalled = false;
		
	}

	// Startet das Clockpanel
	public void start()
	{
		th = new Thread(this);
		th.start();
	}

	//Run Methode des Panel
	@Override
	public void run()
	{
		while (true)
		{
			System.out.println("run called");
			setDisplay(selector);	
		}
	}
	
	/*
	public ReworkedClock[][] safeClockData()
	{
		return this.clocks;
	}
	
	*/
	
	//Setter für den Selector. wird vom KeyListener des Frames genutzt um Zugriff auf das Panel zu erhalten ohne sich selber
	//in eine Dauerschleife zu versetzen
	public void setSelector (char s)
	{
		this.selector = s;
		if (selector == 'A')
		{
			isAnimationCalled = true;
		}
	}
	
	private void renderOneClock()
	{
		for (int i=0; i<columns; i++)
		{
			for (int j=0; j<rows; j++)
			{
				clocks[i][j].setRenderer(false);
			}
		}
		clocks[1][1].setRenderer(true);
		values.rotateover360(360, 360, true, true, clocks);
		letClocksTick(36);
	}
	private void renderAllClocks()
	{
		for (int i=0; i<columns; i++)
		{
			for (int j=0; j<rows; j++)
			{
				clocks[i][j].setRenderer(true);
			}
		}
		setSelector('N');
		
	}
	
	public void renderCircles()
	{
		cirles = !cirles;
		
		for (int i=0; i<columns; i++)
		{
			for (int j=0; j<rows; j++)
			{
				clocks[i][j].setCircles(cirles);
			}
		}
	}
	//Wird benutzt damit sich die Uhr an Position <x|y> schneller oder langsamer bewegt. 
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

	// Sagt dem Panel was es darstellen soll. Übergeben wird ein char welcher
	// ein Kürzel ist.
	private void setDisplay(char selector)
	{
		System.out.println(selector);
		switch (selector)
		{
		case 'O':
			renderAllClocks();
			break;
		case 'P':
			renderOneClock();
			break;
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
		case 'N':
			showNames();
			break;
		case'M':
			System.out.println("Motoranbindung aktiviert");
			motorCaller = true;
			clocksToDefault();
		default:
			clocksToDefault();
			break;
		}
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
	
	//Überprüft ob sich die Ihren der Spalte x noch bewegen. true=Spalte steht
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

	// Setzt alle Zeiger auf "default Stellung" (180°)
	protected void clocksToDefault()
	{
		values.setdefault(clocks);
		letClocksTick(50);
	}

	// Stellt die aktuelle Uhrzeit in großen Zahlen dar, Methode von Julian
	protected void displayTimeHuge()
	{
		values.setdefault(clocks);
		Time time = new Time();
		displayTimeHugehelper(time);
		while (selector=='T')
		{
			
			
				letClocksTick(100);
				if (time.refreshTime())
				{
					displayTimeHugehelper(time);
				}
				else
				{
					// test!
				}
			}
	}

	
	//HElper methode zum Darstellen der Zeit
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
		values.setdefault(clocks);
		Time time = new Time();
		values.displayCharacter(String.valueOf(time.getHours0()).charAt(0), 0,
				0, clocks);
		values.displayCharacter(String.valueOf(time.getHours1()).charAt(0), 2,
				0, clocks);
		values.displayCharacter(String.valueOf(time.getMinutes0()).charAt(0),
				4, 0, clocks);
		values.displayCharacter(String.valueOf(time.getMinutes1()).charAt(0),
				6, 0, clocks);
		while (selector=='S')
		{
			letClocksTick(100);
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
			

			//TEST!
		break;
		}
	}

	
	
	// Stellt das Wetter dar. Methode von Julian
	protected void displayWeather()
	{
		values.setdefault(clocks);
		Weather w = new Weather();
		// api call (get current weather of (city)
		w.currentWeather("Hamburg");
		values.setdefault(clocks);
		while (selector=='W')
			
		{
			int sleep = 4000;
			// step#1 show conditions	
			displayConditions(w, sleep);
			if (selector!='W')
			{
				continue;
			}
			
			// step#2 show temperature
			displayTemperature(w, sleep);
			
			if (selector!='W')
			{
				continue;
			}
			// step#3 show humidity
			displayHumidity(w, sleep);
			
			if (selector!='W')
			{
				continue;
			}
			
			values.displayCharacter('w', 4, 3, clocks);
			values.displayCharacter('i', 6, 3, clocks);
			values.displayCharacter('n', 8, 3, clocks);
			values.displayCharacter('d', 10, 3, clocks);
			letClocksTick(sleep/10);
			
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
			letClocksTick(5);
			while(!checkIfNoClocksRotates())
			{
				letClocksTick(20);
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
				letClocksTick(20);
			}
			values.setall(degreehelper, degreehelper, clocks);
			values.displayCharacter('n', 7, 0, clocks);
			values.displayCharacter('s', 7, 5, clocks);
			values.displayCharacter('w', 0, 3, clocks);
			values.displayCharacter('e', 14, 3, clocks);
			letClocksTick(sleep/10);
			values.setdefault(clocks);
			
			//speed
			values.displayCharacter('s', 3, 3, clocks);
			values.displayCharacter('p', 5, 3, clocks);
			values.displayCharacter('e', 7, 3, clocks);
			values.displayCharacter('e', 9, 3, clocks);
			values.displayCharacter('d', 11, 3, clocks);
			letClocksTick(sleep/10);
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
			letClocksTick(sleep/10);
			values.setdefault(clocks);
		}
		// display w.getHumidity()
		// step#4 show wind speed/direction
		// display w.getWinddir()/w.getWinddegrees()/w.getWindspeed()
	}
	
	//Methode die von displayWeather gecalled wird. Zeigt die Temperatur an
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
		letClocksTick(sleep/20);
		
		values.setdefault(clocks);
		// get length of temperature
		int templength = w.getTemp().length();
		//temp is negative
		if(w.getTemp().charAt(0) == '-')
		{
			if(templength == 2)
			{
				values.displayCharacterhuge('°', 2, 3, clocks);
				values.displayCharacterhuge(w.getTemp().charAt(1), 4, 1, clocks);
				values.displayCharacterhuge('°', 8, 1, clocks);
				values.displayCharacterhuge('C', 10, 1, clocks);
			}
			else if(templength == 3)
			{
				values.displayCharacterhuge('°', 0, 3, clocks);
				values.displayCharacterhuge(w.getTemp().charAt(1), 2, 1, clocks);
				values.displayCharacterhuge(w.getTemp().charAt(2), 6, 1, clocks);
				values.displayCharacterhuge('°', 10, 1, clocks);
				values.displayCharacterhuge('C', 12, 1, clocks);
			}
		}
		//temp is positive
		else
		{
			if(templength == 1)
			{
				values.displayCharacterhuge(w.getTemp().charAt(0), 3, 1, clocks);
				values.displayCharacterhuge('°', 7, 1, clocks);
				values.displayCharacterhuge('C', 9, 1, clocks);
			}
			else if(templength == 2)
			{
				values.displayCharacterhuge(w.getTemp().charAt(0), 1, 1, clocks);
				values.displayCharacterhuge(w.getTemp().charAt(1), 5, 1, clocks);
				values.displayCharacterhuge('°', 9, 1, clocks);
				values.displayCharacterhuge('C', 11, 1, clocks);
			}
		}
		/*
		if (templength == 1)
		{
			values.displayCharacterhuge(w.getTemp().charAt(0), 2, 1, clocks);
			values.displayCharacterhuge('°', 6, 1, clocks);
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
			values.displayCharacterhuge('°', 10, 1, clocks);
			values.displayCharacterhuge('C', 12, 1, clocks);
		}
		else
		{
			values.setdefault(clocks);
		}
		*/
		letClocksTick(sleep/10);
		values.setdefault(clocks);
	}
	
	//Zeigt Feuchtigkeit
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
		letClocksTick(sleep/10);
		
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

		letClocksTick(sleep/10);

		values.setdefault(clocks);
	}
	
	//Zeigt die Windrichtung
	protected void displayConditions(Weather w, int sleep)
	{
		
		values.displayCharacter('w', 1, 3, clocks);
		values.displayCharacter('e', 3, 3, clocks);
		values.displayCharacter('a', 5, 3, clocks);
		values.displayCharacter('t', 7, 3, clocks);
		values.displayCharacter('h', 9, 3, clocks);
		values.displayCharacter('e', 11, 3, clocks);
		values.displayCharacter('r', 13, 3, clocks);
		letClocksTick(sleep/10);
		
		values.setall(270, 270, clocks);
		// get current weather
		// step#1 show weather (cloudy, sunny, etc.)
		values.showWeather(w.getWeather().toLowerCase(), 0, 0, clocks);
		letClocksTick(sleep/10);
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
	
	//Zeigt nacheinenader unsere Namen und was wir gemacht haben
	//Tastatur benutzen um zur nächsten Person zu kommen.
	//Patrick => 1 drücken => Julian => Michael
	protected void showNames()
	{
		values.setdefault(clocks);
		
		while (selector =='N')
		{
			values.setRowToDefault(clocks, 0);
			values.setRowToDefault(clocks, 1);
			values.setRowToDefault(clocks, 2);
			values.setRowToDefault(clocks, 3);
			values.setRowToDefault(clocks, 4);
			values.setRowToDefault(clocks, 5);
			
			values.displayCharacter('c', 2, 0, clocks);
			values.displayCharacter('l',4, 0, clocks);
			values.displayCharacter('o', 6, 0, clocks);
			values.displayCharacter('c', 8, 0, clocks);
			values.displayCharacter('k', 10, 0, clocks);
			values.displayCharacter('c', 0, 3, clocks);
			values.displayCharacter('e', 2, 3, clocks);
			values.displayCharacter('p', 4, 3, clocks);
			values.displayCharacter('t', 6, 3, clocks);
			values.displayCharacter('i', 8, 3, clocks);
			values.displayCharacter('o', 10, 3, clocks);
			values.displayCharacter('n', 12, 3, clocks);
			letClocksTick(50);
		}
		
		while (selector == '1')
		{
			values.setRowToDefault(clocks, 0);
			values.setRowToDefault(clocks, 1);
			values.setRowToDefault(clocks, 2);
			values.displayCharacter('p', 0, 0, clocks);
			values.displayCharacter('a', 2, 0, clocks);
			values.displayCharacter('t', 4, 0, clocks);
			values.displayCharacter('r', 6, 0, clocks);
			values.displayCharacter('i', 8, 0, clocks);
			values.displayCharacter('c', 10, 0, clocks);
			values.displayCharacter('k', 12, 0, clocks);
			letClocksTick(50);
			
			values.setRowToDefault(clocks, 3);
			values.setRowToDefault(clocks, 4);
			values.setRowToDefault(clocks, 5);
			values.displayCharacter('d', 0, 3, clocks);
			values.displayCharacter('e', 2, 3, clocks);
			values.displayCharacter('s', 4, 3, clocks);
			values.displayCharacter('i', 6, 3, clocks);
			values.displayCharacter('g', 8, 3, clocks);
			values.displayCharacter('n', 10, 3, clocks);
		}
		while (selector == '2')
		{
		
			values.displayCharacter('j', 0, 0, clocks);
			values.displayCharacter('u', 2, 0, clocks);
			values.displayCharacter('l', 4, 0, clocks);
			values.displayCharacter('i', 6, 0, clocks);
			values.displayCharacter('a', 8, 0, clocks);
			values.displayCharacter('n', 10, 0, clocks);
			letClocksTick(50);
			

			values.setRowToDefault(clocks, 3);
			values.setRowToDefault(clocks, 4);
			values.setRowToDefault(clocks, 5);
			values.displayCharacter('a', 0, 3, clocks);
			values.displayCharacter('n', 2, 3, clocks);
			values.displayCharacter('i', 4, 3, clocks);
			//values.displayCharacter('/', 6, 3, clocks);
			values.displayCharacter('a', 8, 3, clocks);
			values.displayCharacter('p', 10, 3, clocks);
			values.displayCharacter('i', 12, 3, clocks);
		}
		
		while (selector == '3')
		{
			
			
			values.displayCharacter('m', 0, 0, clocks);
			values.displayCharacter('i', 2, 0, clocks);
			values.displayCharacter('c', 4, 0, clocks);
			values.displayCharacter('h', 6, 0, clocks);
			values.displayCharacter('a', 8, 0, clocks);
			values.displayCharacter('e', 10, 0, clocks);
			values.displayCharacter('l', 12, 0, clocks);
			letClocksTick(50);
			
			values.displayCharacter('h', 0, 3, clocks);
			values.displayCharacter('a', 2, 3, clocks);
			values.displayCharacter('r', 4, 3, clocks);
			values.displayCharacter('d', 6, 3, clocks);
			values.displayCharacter('w', 8, 3, clocks);
			values.displayCharacter('a', 10, 3, clocks);
			values.displayCharacter('r', 12, 3, clocks);
			values.displayCharacter('e', 14, 3, clocks);
			
		}	
			
			
			
		
	}
	
	
	//Spielt die erste Animation ab
	protected void playAnimation1()
	{
		int y = 1000;
		
		if (isAnimationCalled)
		{
			System.out.println("test");
			isAnimationCalled=false;
			// step#1 move pointer in start position
			values.startanimation1(rows, columns, clocks);
			letClocksTick(300);
			// step#2 rotate pointer (for a set amount of degree)
			values.rotateover360(5000, 5000, true, false, clocks);
			letClocksTick(600);
			// step#3 stop them column by column
		}
		stopAniCbyC(y);
		
	}
	//Spielt die zweite Anomation ab
	protected void playAnimation2()
	{
		int y = 200;
		//start position
		values.startanimation2(rows, columns, clocks);
		letClocksTick(200);
		//rotate (atm = 720°)
		values.rotateClocks(rows, columns, clocks, this);
		
		stopAniCbyC(y);
		
	}
	// method to stop any display/animatioin to morph into display time huge, 
	// stoping it column by column - waiting y ms after each column
	protected void stopAniCbyC(int y)
	{
		y= (int) (y);
		
		while(selector=='A' || selector=='B')
		{
			Time time = new Time();
			for(int i = 0; i < columns; i ++)
			{
				//display no#1
				if (i < 4)
				{
					values.displayAnimationCharacter(time.getHours0(), i,
							clocks);
					letClocksTick(y/10);
				}
				//display no#2
				else if (i < 8)
				{
					values.displayAnimationCharacter(time.getHours1(), i,
							clocks);
					letClocksTick(y/10);
				}
				//display no#3
				else if (i < 12)
				{
					values.displayAnimationCharacter(time.getMinutes0(), i,
							clocks);
					letClocksTick(y/10);
				}
				//display no#4
				else
				{
					values.displayAnimationCharacter(time.getMinutes1(), i,
							clocks);
					letClocksTick(y/10);
				}
	
			}
			if(checkIfNoClocksRotates())
			{
				break;
			}
		}
	}
	
	//Spielt die Animation #3 ab
	protected void playAnimation3()
	{
		values.startanimation3(rows, columns, clocks);
		letClocksTick(300);
		values.animation3(rows, columns, clocks, this);
		letClocksTick(300);
	}
	
	//Spielt die Animation #4 ab
	protected void playAnimation4()
	{
		values.startanimation4(rows, columns, clocks);
		letClocksTick(500);
		values.animation4(rows, columns, clocks, this);
		letClocksTick(500);
	}
	
	//Wird vom Panel benutzt damit die Uhren ticken. Statt sleep() soll von jeder Display-Funktion des Panels letClocksTick
	//benutzt werden, da sich die Uhr ansonsten nicht rendert!
	public void letClocksTick(int times)
	{
		for (int i=0; i<times; i++)
		{
			if (motorCaller)
			{
				ms.refresh(clocks);	
			}
			for (int k = 0; k < columns; k++)
			{
				for (int j = 0; j < rows; j++)
				{
					
					clocks[k][j].tick();
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
	
	public void resetClock()
	{
		ms.toDefault();
	}
	

}
