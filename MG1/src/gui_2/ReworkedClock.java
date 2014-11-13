package gui_2;

import java.awt.Graphics;
import java.awt.Image;

import gui.Clock;

public class ReworkedClock extends Clock{

	public ReworkedClock(int size, Image image) {
		super(size);
		this.screen = image;
	}

}
