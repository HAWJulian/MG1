package gui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.JPanel;
// TODO auf cpu optimieren
public class Clock extends JPanel implements Runnable{
	
	//Variable die speichert wie viele ticks seit dem letzten render vergangen sind
	private int ticks;
	
	//Speichert ab nach wie vielen ticks gerendert werden soll
	private int tickrate;
	
	//Speichert das Zentrum der Uhr (da sie quadratisch ist wird nur ein Wert gespeichert
	private int center;
	
	//speichert die Uhr, exklusive der Zeiger
	private Graphics clock;
	
	//aktuelle Gradzahl für die Position der Zeiger (H Stunde, M Minute)
	private float degreeH , degreeM;
	//Gibt an welche Gradzahl die Uhren erreichen sollen
	private float targetDegreeH, targetDegreeM;
	
	//Gibt die Größe der zu erzeugenden Uhr an
	private int diameter;
	
	private Image screen;
	
	//Gibt an ob die Uhr dabei ist sich zu bewegen
	private boolean isMoving;
	
	//Gibt an ob die Zeiger sich mit oder gegen den Uhrzeigersinn drehen (H Stunde / M Minute) true = mit dem Uhrzeigersinn
	private boolean directionH , directionM;
	
	private int randomVariable1, randomVariable2;
	
	public int getRandomVariable1()
	{
		return randomVariable1;
	}
	public int getRandomVariable2()
	{
		return randomVariable2;
	}
	public boolean getIsMoving()
	{
		return isMoving;
	}
	
	public boolean getDirectionH()
	{
		return directionH;
	}
	
	public boolean getDirectionM()
	{
		return directionM;
	}
	
	public float getTargetDegreeH()
	{
		return targetDegreeH;
	}
	
	public float getTargetDegreeM()
	{
		return targetDegreeM;
	}
	//Setzt die Geschwindigkeit mit der die Uhr sich dreht. Standard tickrate ist 1, was bedeutet, dass die Uhr sich mit jedem tick um 1 Grad bewegt.
	public void setTickrate(int tickrate)
	{
		this.tickrate = tickrate;
		ticks=0;
	}
	

	private void calculateDirection()
	{
		// 270 -> 10 clock ( -260)
		// 10 -> 270 counter ( 260)
		// 45 -> 180 clock (135)
		// 180 -> 45 counter(-135)
		if (((targetDegreeH - degreeH) > 180) || ((targetDegreeH - degreeH) > -180) && ((targetDegreeH - degreeH) < 0))
		{
			directionH = false;
		}
		
		else
		{
			directionH = true;
		}
		
		if (((targetDegreeM - degreeM) > 180) || ((targetDegreeM - degreeM) > -180) && ((targetDegreeM - degreeM) < 0))
		{
			directionM = false;
		}
		
		else
		{
			directionM = true;
		}
		
		
	}
	
	private void calculatePointerPosition()
	{
		
		//Wenn die Zeiger ihre Positionen erreicht haben wird die Bewegung der Uhren beendet
		if (((targetDegreeH == degreeH) && (targetDegreeM == degreeM))) 
		{
			if (randomVariable1==0 && randomVariable2==0)
			{
				isMoving = false;
				return;	
			}
			
			
		}
		else
		{
			isMoving = true;
		}
		//Wenn der Stundenzeiger seine Zielposition noch nicht erreicht wird er um ein Grad verschoben
		if (!(targetDegreeH == degreeH ))
		{
			//Wenn directionH true ist wird er nach rechts gedreht
			if (directionH) 
			{
				degreeH++;
				degreeH=degreeH%360;
			}
			//Ansonsten nach links
			else
			{
				degreeH--;
				if(degreeH == -1)
				{
					degreeH = 359;
				}
			}
			
		}
		else
		{
			if (randomVariable1>0)
			{
				randomVariable1--;
				if (directionH)
				{
					degreeH++;
					degreeH=degreeH%360;
					
				}
				else
				{
					degreeH--;
					if (degreeH<0)
					{
						degreeH=359;
					}
					
				}
			}
		}
		//Selbes für Minutenzeiger
		if (!(targetDegreeM == degreeM))
		{
			//Wenn directionM true ist wird er nach rechts gedreht
			if (directionM)
			{
				degreeM++;
				degreeM=degreeM%360;
			}
			//Ansonsten nach rechts
			else
			{
				degreeM--;
				if(degreeM == -1)
				{
					degreeM = 359;
				}
			}
		}
		
		else
		{
			if (randomVariable2>0)
			{
				randomVariable2--;
				if (directionM)
				{
					degreeM++;
					degreeM=degreeM%360;
					
				}
				else
				{
					degreeM--;
					if (degreeM<0)
					{
						degreeM=359;
					}
					
				}
			}
		}
		
	}

	// force rotation
	public void forceRotation(int hour, int minute, boolean clockwiseH, boolean clockwiseM)
	{
		targetDegreeH = hour;
		targetDegreeM = minute;
		directionH = clockwiseH;
		directionM = clockwiseM;
		
		randomVariable1 = randomVariable2 = 0;
		
	}
	
	//Setzt die Zielposition ohne die Rotationsrichtung zu ändern
	public void setDegree (int hour , int minute)
	{
		targetDegreeH = hour;
		targetDegreeM = minute;
		randomVariable1 = randomVariable2 = 0;
	}

	//Setzt die Zielposition der Zeiger
	public void setPointerDegree(int hour, int minute)
	{
		//Die Werte werden eingespeichert und die Drehrichtung berechnet
	
		targetDegreeH = hour;
		targetDegreeM = minute;
		randomVariable1 = randomVariable2 = 0;
		calculateDirection();
	}
	
	public void rotateForMoreThan360Degrees(int degreesH, int degreesM, boolean directionH, boolean directionM)
	{
		this.directionH = directionH;
		this.directionM = directionM;
		randomVariable1=degreesH/360;
		randomVariable2=degreesM/360;
		if (directionH)
		{
			targetDegreeH += degreesH%360;
			targetDegreeH= targetDegreeH%360;
		}
		else
		{
			targetDegreeH-=degreesH%360;
			if (targetDegreeH<0)
			{
				targetDegreeH+=360;
			}
		}
		if (directionM)
		{
			targetDegreeM += degreesM%360;
			targetDegreeM= targetDegreeM%360;
		}
		else
		{
			targetDegreeM-=degreesM%360;
			if (targetDegreeM<0)
			{
				targetDegreeM+=360;
			}
		}
		
		
		
	}
	//Konstruktor einer Uhr. Setzt den Durchmesser, das Zentrum der Uhr und die Startgradzahlen der Zeiger (180)
	public Clock(int size)
	{
		targetDegreeH=180;
		targetDegreeM=180;
		diameter = size;
		center = diameter/2;
		degreeH = 180;
		degreeM = 180;
		ticks=0;
		tickrate=1;
		directionH=true;
		directionM=true;
		
	}
	
	public void initClock()
	{
		screen = createVolatileImage(diameter, diameter);
		screen = createImage(diameter, diameter);
		
	}
	
	public void tick()
	{
		if (ticks==tickrate)
		{
			ticks=0;
			calculatePointerPosition();
		}
		render(clock);
		ticks++;
	}
	//Startet die Uhr (Rendern und Bewegung)
	//ClockPanel benutzen - ClockPanel.start
	@Deprecated
	public void start()
	{
		initClock();
		
		isMoving = true;
		Thread th = new Thread(this);
		th.start();
	}
	
	private void render(Graphics g)
	{
		int i = 0;
		// rendern der Uhr
		clock = screen.getGraphics();
		
		int radius = diameter - 30;
		
		//Hintergrundfarbe des Panels auf weiß setzen
		clock.setColor(Color.WHITE);
		clock.fillRect(0, 0, diameter, diameter);
		
		//Großen (gefüllten) schwarzen Kreis malen
		clock.setColor(Color.BLACK);
		clock.fillOval(0 , 0, diameter ,  diameter);
		
		//Weißen Kreis im schwarzen Zeichnen. So bleibt nur noch ein schwarzer Rand übrig
		clock.setColor(Color.WHITE);
		clock.fillOval(i+3, i+3, diameter-5, diameter-5);
		
		//Objekte des Typs "Graphics" besitzen nicht die Möglichkeit die Dicke (Stroke) zu ändern. Daher wird das Objekt clock auf ein Objekt vom Typ Grahics2D gecastet
		Graphics2D clock2 = (Graphics2D) clock;
		clock2.setStroke(new BasicStroke(10));
		
		//Minutenzeiger rendern
		clock2.setColor(Color.BLACK);
		int zeigerMx = (int) ((center) + (Math.sin(Math.toRadians(degreeM)) *radius /2)*1.20);
		int zeigerMy = (int) ((center) - (Math.cos(Math.toRadians(degreeM)) *radius /2)*1.20);
		clock2.drawLine(center, center, zeigerMx, zeigerMy);
		
		//Stundenzeiger rendern
		clock2.setColor(Color.BLACK);
		int zeigerHx = (int) ((center) + ((Math.sin(Math.toRadians(degreeH)) *radius /2))*1.20);
		int zeigerHy = (int) ((center) - ((Math.cos(Math.toRadians(degreeH)) *radius /2))*1.20);
		clock2.drawLine(center , center, zeigerHx, zeigerHy);
		
		//gerenderte Sachen auf dem Bildschirm zeichnen
		clock = getGraphics();
		clock.drawImage(screen , 0 , 0 ,null);
	}	
		
	//Dauerschleife, Uhr rendern => neue Positionen für die Uhr berechen => 20ms schlafen legen => von vorne
	//Clockpanel benutzen
	@Deprecated
	public void run() {
		while (true)
		{
			
			render(clock);
			calculatePointerPosition();
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
