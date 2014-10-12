package gui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Shape;
import java.awt.Stroke;

import javax.swing.JPanel;

public class ClockPanel extends JPanel implements Runnable{
	
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
	

	//Setzt die Zielposition der Zeiger. true bei Erfolg false bei Misserfolg
	public boolean setPointerDegree(int hour, int minute)
	{
		
		if (isMoving)
		{
			//Die Zielposition der Zeiger kann nicht geändert werden während die Uhr am laufen ist
			return false;
		}
		//Wenn die Uhr nicht läuft werden die Werte eingespeichert
		else
		{
			targetDegreeH = hour;
			targetDegreeM = minute;
			
			return true;
		}
	}
	//Konstruktor einer Uhr. Setzt den Durchmesser, das Zentrum der Uhr und die Startgradzahlen der Zeiger (180)
	public ClockPanel(int size)
	{
		diameter = size;
		center = diameter/2;
		degreeH = 180;
		degreeM = 180;
		
	}
	
	private void initClock()
	{
		screen = createVolatileImage(diameter, diameter);
		screen = createImage(diameter, diameter);
		
	}
	//Startet die Uhr (Rendern und Bewegung)
	public void start()
	{
		initClock();
		
		isMoving = true;
		Thread th = new Thread(this);
		th.start();
	}
	
	private void render(Graphics g)
	{
		// rendern der Uhr
		clock = screen.getGraphics();
		
		int radius = diameter - 80;
		
		//Hintergrundfarbe des Panels auf weiß setzen
		clock.setColor(Color.WHITE);
		clock.fillRect(0, 0, diameter, diameter);
		
		//Großen (gefüllten) schwarzen Kreis malen
		clock.setColor(Color.BLACK);
		clock.fillOval(20 ,20, diameter-40 ,  diameter-40);
		
		//Weißen Kreis im schwarzen Zeichnen. So bleibt nur noch ein schwarzer Rand übrig
		clock.setColor(Color.WHITE);
		clock.fillOval(30, 30, diameter-60, diameter-60);
		
		//Mitte der Uhr mit einem roten Kreis füllen
		
	//	clock.fillOval(center -5 , center -5, 20 ,20);
		
		
		

		
		//Objekte des Typs "Graphics" besitzen nicht die Möglichkeit die Dicke (Stroke) zu ändern. Daher wird das Objekt clock auf ein Objekt vom Typ Grahics2D gecastet
		Graphics2D clock2 = (Graphics2D) clock;
		clock2.setStroke(new BasicStroke(10));
		
		
		//Minutenzeiger rendern
		clock2.setColor(Color.BLACK);
		int zeigerMx = (int) ((center) + (Math.sin(Math.toRadians(degreeM)) *radius /2));
		int zeigerMy = (int) ((center) - (Math.cos(Math.toRadians(degreeM)) *radius /2));
		clock2.drawLine(center, center, zeigerMx, zeigerMy);
		
		//Stundenzeiger rendern
		clock2.setColor(Color.RED);
		int zeigerHx = (int) ((center) + ((Math.sin(Math.toRadians(degreeH)) *radius /2))*0.75);
		int zeigerHy = (int) ((center) - ((Math.cos(Math.toRadians(degreeH)) *radius /2))*0.75);
		clock2.drawLine(center , center, zeigerHx, zeigerHy);
		
		//gerenderte Sachen auf dem Bildschirm zeichnen
		clock = getGraphics();
		clock.drawImage(screen , 0 , 0 ,null);
	}	
		
	private void calculatePointerPosition()
	{
		
		//Wenn die Zeiger ihre Positionen erreicht haben wird die Bewegung der Uhren beendet
		if (((targetDegreeH == degreeH) && (targetDegreeM == degreeM))) 
		{
			
			isMoving = false;
			return;
			
		}
		//Wenn der Stundenzeiger seine Zielosition noch nicht erreicht wird er um ein Grad verschoben
		if (!(targetDegreeH == degreeH ))
		{
			degreeH++;
			degreeH=degreeH%360;
			
			
		}
		//Selbes für Minutenzeiger
		if (!(targetDegreeM == degreeM))
		{
			degreeM++;
			degreeM=degreeM%360;
		}
		
		
		
	}
	
	//Dauerschleife, Uhr rendern => neue Positionen für die Uhr berechen => 20ms schlafen legen => von vorne
	@Override
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
