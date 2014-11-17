package gui_2;

import java.awt.Image;

import gui.Clock;

//Überarbeitet Uhr. Einziger Unterschied ist, dass es nun einen Konstruktor gibt, welcher das Übergeben eines Bildes erlaubt
//auf dem gezeichnet werden kann. Für die neue Art des Frames MUSS dieser Konstruktor benutzt werden da die CLocks nicht
//in der Lage sind selber ein Bild zu malen, da sie in ein JPanel und einen Frame eingebettet sind
public class ReworkedClock extends Clock{

	public ReworkedClock(int size, Image image) {
		super(size);
		this.screen = image;
	}

}
