package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;

import Project.Time;
import Project.Values;
import Project.Weather;

public class TestklasseJulian {
	private Values values = new Values();
	private Clock[][] arrayClock;
	
	private JFrame frame;
	int size;
	int columns;
	int rows;
	Weather w = new Weather();
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestklasseJulian frame = new TestklasseJulian();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		

	}
	
	public TestklasseJulian()
	{
		size = 100;
		columns = 16;
		rows = 8;
		arrayClock=new Clock[columns][rows];
		//Erzeuge Frame
		frame = new JFrame();
		frame.setSize(columns * size, (rows * size) + 20);
		frame.setTitle("test");
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(null);
		
		//Erzeugt ein Array von Uhren und startet sie
		for (int i=0; i<columns; i++)
		{
			for (int j=0; j<rows; j++)
			{
				arrayClock[i][j] = new Clock(size);
				frame.add(arrayClock[i][j]);

				arrayClock[i][j].setBounds(size*i, size*j, size, size);
			//	arrayClock[i][j].setPointerDegree(40*i, 40*i);
				arrayClock[i][j].start();
			}
		}
		//displayTimeHuge();
		//displayTime();
		//displayChars();
		//playAnimation1();
		displayWeather();
	}
	

	@SuppressWarnings("unused")
	private void displayTimeHuge()
	{
		Time time = new Time();
		values.displayCharacterhuge(String.valueOf(time.getHours0()).charAt(0), 0, 1, arrayClock);
		values.displayCharacterhuge(String.valueOf(time.getHours1()).charAt(0), 4, 1, arrayClock);
		values.displayCharacterhuge(String.valueOf(time.getMinutes0()).charAt(0), 8, 1, arrayClock);
		values.displayCharacterhuge(String.valueOf(time.getMinutes1()).charAt(0), 12, 1, arrayClock);
		while (true) 
		{
			try 
			{
				Thread.sleep(1000);
				if(time.refreshTime())
				{
					values.displayCharacterhuge(String.valueOf(time.getHours0()).charAt(0), 0, 1, arrayClock);
					values.displayCharacterhuge(String.valueOf(time.getHours1()).charAt(0), 4, 1, arrayClock);
					values.displayCharacterhuge(String.valueOf(time.getMinutes0()).charAt(0), 8, 1, arrayClock);
					values.displayCharacterhuge(String.valueOf(time.getMinutes1()).charAt(0), 12, 1, arrayClock);
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
	@SuppressWarnings("unused")
	private void displayTime() 
	{
		Time time = new Time();
		values.displayCharacter(String.valueOf(time.getHours0()).charAt(0), 0, 0, arrayClock);
		values.displayCharacter(String.valueOf(time.getHours1()).charAt(0), 2, 0, arrayClock);
		values.displayCharacter(String.valueOf(time.getMinutes0()).charAt(0), 4, 0, arrayClock);
		values.displayCharacter(String.valueOf(time.getMinutes1()).charAt(0), 6, 0, arrayClock);
		while (true) 
		{
			try 
			{
				Thread.sleep(1000);
				if(time.refreshTime())
				{
					values.displayCharacter(String.valueOf(time.getHours0()).charAt(0), 0, 0, arrayClock);
					values.displayCharacter(String.valueOf(time.getHours1()).charAt(0), 2, 0, arrayClock);
					values.displayCharacter(String.valueOf(time.getMinutes0()).charAt(0), 4, 0, arrayClock);
					values.displayCharacter(String.valueOf(time.getMinutes1()).charAt(0), 6, 0, arrayClock);
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
	
	@SuppressWarnings("unused")
	private void playAnimation1()
	{
		//step#1 move pointer in start position
		values.startanimation1(rows, columns, arrayClock);
		//step#2 rotate pointer (for a set amount of seconds)
		//step#3 stop them column by column
	}
	
	//shows current weather
	private void displayWeather()
	{
		//api call (get current weather of (city)
		w.currentWeather("Hamburg");
		values.setdefault(arrayClock);
		while(true)
		{
			int sleep = 12000;
			// write "weather"
			
			values.displayCharacter('w', 1, 3, arrayClock);
			values.displayCharacter('e', 3, 3, arrayClock);
			values.displayCharacter('a', 5, 3, arrayClock);
			values.displayCharacter('t', 7, 3, arrayClock);
			values.displayCharacter('h', 9, 3, arrayClock);
			values.displayCharacter('e', 11, 3, arrayClock);
			values.displayCharacter('r', 13, 3, arrayClock);
			try {
				Thread.sleep(sleep);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			values.setdefault(arrayClock);
			// get current weather
			// step#1 show weather (cloudy, sunny, etc.)
			values.showWeather(w.getWeather().toLowerCase(), 0, 0, arrayClock);
			try {
				Thread.sleep(sleep);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			values.setdefault(arrayClock);

			// step#2 show temperature
			// tempera-
			// ture
			values.displayCharacter('t', 0, 1, arrayClock);
			values.displayCharacter('e', 2, 1, arrayClock);
			values.displayCharacter('m', 4, 1, arrayClock);
			values.displayCharacter('p', 6, 1, arrayClock);
			values.displayCharacter('e', 8, 1, arrayClock);
			values.displayCharacter('r', 10, 1, arrayClock);
			values.displayCharacter('a', 12, 1, arrayClock);
			values.displayCharacter('-', 14, 1, arrayClock);
			values.displayCharacter('t', 0, 4, arrayClock);
			values.displayCharacter('u', 2, 4, arrayClock);
			values.displayCharacter('r', 4, 4, arrayClock);
			values.displayCharacter('e', 6, 4, arrayClock);
			try {
				Thread.sleep(sleep);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			values.setdefault(arrayClock);
			// get length of temperaturr
			int templength = w.getTemp().length();
			if (templength == 1) {
				values.displayCharacterhuge(w.getTemp().charAt(0), 2, 1,
						arrayClock);
				values.displayCharacterhuge('�', 6, 1, arrayClock);
				values.displayCharacterhuge('C', 8, 1, arrayClock);
			} else if (templength == 2 || templength == 3) {
				if (templength == 3) {
					values.displayCharacterhuge('�', 0, 3, arrayClock);
				}
				values.displayCharacterhuge(w.getTemp().charAt(0), 2, 1,
						arrayClock);
				values.displayCharacterhuge(w.getTemp().charAt(1), 6, 1,
						arrayClock);
				values.displayCharacterhuge('�', 10, 1, arrayClock);
				values.displayCharacterhuge('C', 12, 1, arrayClock);
			} else {
				values.setdefault(arrayClock);
			}
			sleep(sleep);
			values.setdefault(arrayClock);
			
			// step#3 show humidity
			values.displayCharacter('h', 0, 3, arrayClock);
			values.displayCharacter('u', 2, 3, arrayClock);
			values.displayCharacter('m', 4, 3, arrayClock);
			values.displayCharacter('i', 6, 3, arrayClock);
			values.displayCharacter('d', 8, 3, arrayClock);
			values.displayCharacter('i', 10, 3, arrayClock);
			values.displayCharacter('t', 12, 3, arrayClock);
			values.displayCharacter('y', 14, 3, arrayClock);
			sleep(sleep);
			values.setdefault(arrayClock);

			int humlength = w.getHumidity().length();
			if (humlength == 2 || humlength == 3) {
				values.displayCharacterhuge(
						w.getHumidity().charAt(humlength - 2), 6, 1, arrayClock);
				values.displayCharacterhuge('%', 10, 2, arrayClock);
				if (humlength == 3) {
					values.displayCharacterhuge(w.getHumidity().charAt(0), 2,
							1, arrayClock);
				}
			} else {
				values.setdefault(arrayClock);
			}
			
			sleep(sleep);
			
			values.setdefault(arrayClock);
			
			values.displayCharacter('w', 4, 3, arrayClock);
			values.displayCharacter('i', 6, 3, arrayClock);
			values.displayCharacter('n', 8, 3, arrayClock);
			values.displayCharacter('d', 10, 3, arrayClock);
			sleep(sleep);
			values.setdefault(arrayClock);
			//step#4 show wind (direction/speed)
			int degreehelper = Integer.parseInt(w.getWinddegrees());
			if (degreehelper > 180)
			{
				degreehelper -= 180;
			}
			else
			{
				degreehelper += 180;
			}
			values.setall(degreehelper, degreehelper, arrayClock);
			values.displayCharacter('n', 7, 0, arrayClock);
			values.displayCharacter('s', 7, 5, arrayClock);
			values.displayCharacter('w', 0, 3, arrayClock);
			values.displayCharacter('e', 14, 3, arrayClock);
			sleep(7500);
			for(int wind = 0; wind <= 20; wind++)
			{
				
				if (wind % 2 == 0) {
					values.setall(degreehelper+10,degreehelper+10, arrayClock);
					values.displayCharacter('n', 7, 0, arrayClock);
					values.displayCharacter('s', 7, 5, arrayClock);
					values.displayCharacter('w', 0, 3, arrayClock);
					values.displayCharacter('e', 14, 3, arrayClock);
				}
				else
				{
					values.setall(degreehelper-10,degreehelper-10, arrayClock);
					values.displayCharacter('n', 7, 0, arrayClock);
					values.displayCharacter('s', 7, 5, arrayClock);
					values.displayCharacter('w', 0, 3, arrayClock);
					values.displayCharacter('e', 14, 3, arrayClock);
				}
				sleep(500);
			}
			values.setall(degreehelper,degreehelper, arrayClock);
			values.displayCharacter('n', 7, 0, arrayClock);
			values.displayCharacter('s', 7, 5, arrayClock);
			values.displayCharacter('w', 0, 3, arrayClock);
			values.displayCharacter('e', 14, 3, arrayClock);
			sleep(sleep);

			values.setdefault(arrayClock);
		}
		
		//display w.getHumidity()
		//step#4 show wind speed/direction
		//display w.getWinddir()/w.getWinddegrees()/w.getWindspeed()
	}
	
	private void sleep(int duration)
	{
		try {
			Thread.sleep(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	//testmethod
	//displays every implemented character
	@SuppressWarnings("unused")
	private void displayChars()
	{
		//execute step by step with debugger, else make the thread sleep for ~2k ms after each call
		//otherwise this will only display the last call.
		values.displayCharacter('1', 0, 0, arrayClock);
		values.displayCharacter('2', 0, 0, arrayClock);
		values.displayCharacter('3', 0, 0, arrayClock);
		values.displayCharacter('4', 0, 0, arrayClock);
		values.displayCharacter('5', 0, 0, arrayClock);
		values.displayCharacter('6', 0, 0, arrayClock);
		values.displayCharacter('7', 0, 0, arrayClock);
		values.displayCharacter('8', 0, 0, arrayClock);
		values.displayCharacter('9', 0, 0, arrayClock);
		values.displayCharacter('0', 0, 0, arrayClock);
		values.displayCharacter('a', 0, 0, arrayClock);
		values.displayCharacter('b', 0, 0, arrayClock);
		values.displayCharacter('c', 0, 0, arrayClock);
		values.displayCharacter('d', 0, 0, arrayClock);
		values.displayCharacter('e', 0, 0, arrayClock);
		values.displayCharacter('f', 0, 0, arrayClock);
		values.displayCharacter('g', 0, 0, arrayClock);
		values.displayCharacter('h', 0, 0, arrayClock);
		values.displayCharacter('i', 0, 0, arrayClock);
		values.displayCharacter('j', 0, 0, arrayClock);
		values.displayCharacter('k', 0, 0, arrayClock);
		values.displayCharacter('l', 0, 0, arrayClock);
		values.displayCharacter('m', 0, 0, arrayClock);
		values.displayCharacter('n', 0, 0, arrayClock);
		values.displayCharacter('o', 0, 0, arrayClock);
		values.displayCharacter('p', 0, 0, arrayClock);
		values.displayCharacter('q', 0, 0, arrayClock);
		values.displayCharacter('r', 0, 0, arrayClock);
		values.displayCharacter('s', 0, 0, arrayClock);
		values.displayCharacter('t', 0, 0, arrayClock);
		values.displayCharacter('u', 0, 0, arrayClock);
		values.displayCharacter('v', 0, 0, arrayClock);
		values.displayCharacter('w', 0, 0, arrayClock);
		values.displayCharacter('x', 0, 0, arrayClock);
		values.displayCharacter('y', 0, 0, arrayClock);
		values.displayCharacter('z', 0, 0, arrayClock);
	}
	

	
	

}