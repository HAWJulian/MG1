package Project;

import gui.ClockPanel;

public class Values {
	// default value (bottom left)
	static int def = 225;

	public void displayCharacter(char x, int startx, int starty,
			ClockPanel[][] clocks) {
		// Ziffer 1
		switch (x) {
		case '1':
			// left
			clocks[startx][starty].setPointerDegree(def, def);
			clocks[startx][starty + 1].setPointerDegree(def, def);
			clocks[startx][starty + 2].setPointerDegree(def, def);
			// right
			clocks[startx + 1][starty].setPointerDegree(180, 180);
			clocks[startx + 1][starty + 1].setPointerDegree(180, 0);
			clocks[startx + 1][starty + 2].setPointerDegree(0, 0);
			break;
		// Ziffer 2
		case '2':
			// left
			clocks[startx][starty].setPointerDegree(90, 90);
			clocks[startx][starty + 1].setPointerDegree(180, 90);
			clocks[startx][starty + 2].setPointerDegree(90, 0);
			// right
			clocks[startx + 1][starty].setPointerDegree(180, 270);
			clocks[startx + 1][starty + 1].setPointerDegree(270, 0);
			clocks[startx + 1][starty + 2].setPointerDegree(270, 270);
			break;
		case '3':
			// left
			clocks[startx][starty].setPointerDegree(90, 90);
			clocks[startx][starty + 1].setPointerDegree(90, 90);
			clocks[startx][starty + 2].setPointerDegree(90, 90);
			// right
			clocks[startx + 1][starty].setPointerDegree(180, 270);
			clocks[startx + 1][starty + 1].setPointerDegree(270, 0);
			clocks[startx + 1][starty + 2].setPointerDegree(270, 0);
			break;
		case '4':
			// left
			clocks[startx][starty].setPointerDegree(180, 180);
			clocks[startx][starty + 1].setPointerDegree(90, 0);
			clocks[startx][starty + 2].setPointerDegree(def, def);
			// right
			clocks[startx + 1][starty].setPointerDegree(180, 180);
			clocks[startx + 1][starty + 1].setPointerDegree(180, 0);
			clocks[startx + 1][starty + 2].setPointerDegree(0, 0);
			break;
		case '5':
			// left
			clocks[startx][starty].setPointerDegree(180, 90);
			clocks[startx][starty + 1].setPointerDegree(90, 0);
			clocks[startx][starty + 2].setPointerDegree(90, 90);
			// right
			clocks[startx + 1][starty].setPointerDegree(270, 270);
			clocks[startx + 1][starty + 1].setPointerDegree(180, 270);
			clocks[startx + 1][starty + 2].setPointerDegree(270, 0);
			break;
		case '6':
			// left
			clocks[startx][starty].setPointerDegree(180, 90);
			clocks[startx][starty + 1].setPointerDegree(180, 0);
			clocks[startx][starty + 2].setPointerDegree(90, 0);
			// right
			clocks[startx + 1][starty].setPointerDegree(270, 270);
			clocks[startx + 1][starty + 1].setPointerDegree(180, 270);
			clocks[startx + 1][starty + 2].setPointerDegree(270, 0);
			break;
		case '7':
			// left
			clocks[startx][starty].setPointerDegree(90, 90);
			clocks[startx][starty + 1].setPointerDegree(def, def);
			clocks[startx][starty + 2].setPointerDegree(def, def);
			// right
			clocks[startx + 1][starty].setPointerDegree(180, 270);
			clocks[startx + 1][starty + 1].setPointerDegree(180, 0);
			clocks[startx + 1][starty + 2].setPointerDegree(0, 0);
			break;
		case '8':
			// left
			clocks[startx][starty].setPointerDegree(180, 90);
			clocks[startx][starty + 1].setPointerDegree(90, 0);
			clocks[startx][starty + 2].setPointerDegree(90, 0);
			// right
			clocks[startx + 1][starty].setPointerDegree(180, 270);
			clocks[startx + 1][starty + 1].setPointerDegree(270, 0);
			clocks[startx + 1][starty + 2].setPointerDegree(270, 0);
			break;
		case '9':
			// left
			clocks[startx][starty].setPointerDegree(180, 90);
			clocks[startx][starty + 1].setPointerDegree(90, 0);
			clocks[startx][starty + 2].setPointerDegree(90, 90);
			// right
			clocks[startx + 1][starty].setPointerDegree(180, 270);
			clocks[startx + 1][starty + 1].setPointerDegree(270, 0);
			clocks[startx + 1][starty + 2].setPointerDegree(270, 0);
			break;
		case '0':
			// left
			clocks[startx][starty].setPointerDegree(180, 90);
			clocks[startx][starty + 1].setPointerDegree(180, 0);
			clocks[startx][starty + 2].setPointerDegree(90, 0);
			// right
			clocks[startx + 1][starty].setPointerDegree(180, 270);
			clocks[startx + 1][starty + 1].setPointerDegree(180, 0);
			clocks[startx + 1][starty + 2].setPointerDegree(270, 0);
		}
	}

	// Ziffer 3
	// Ziffer 4
	// Ziffer 5
	// Ziffer 6
	// Ziffer 7
	// Ziffer 8
	// Ziffer 9
	// Ziffer 0
}
