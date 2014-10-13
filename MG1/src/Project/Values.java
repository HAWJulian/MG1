package Project;

import gui.ClockPanel;

public class Values {
	// default value (bottom left)
	static int def = 225;

	public void displayCharacter(char x, int startx, int starty,
			ClockPanel[][] clocks) {
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
			break;
		case 'a':
			// left
			clocks[startx][starty].setPointerDegree(180, 90);
			clocks[startx][starty + 1].setPointerDegree(90, 0);
			clocks[startx][starty + 2].setPointerDegree(0, 0);
			// right
			clocks[startx + 1][starty].setPointerDegree(180, 270);
			clocks[startx + 1][starty + 1].setPointerDegree(270, 0);
			clocks[startx + 1][starty + 2].setPointerDegree(0, 0);
			break;
		case 'b':
			// left
			clocks[startx][starty].setPointerDegree(180, 180);
			clocks[startx][starty + 1].setPointerDegree(180, 0);
			clocks[startx][starty + 2].setPointerDegree(90, 0);
			// right
			clocks[startx + 1][starty].setPointerDegree(def, def);
			clocks[startx + 1][starty + 1].setPointerDegree(180, 270);
			clocks[startx + 1][starty + 2].setPointerDegree(270, 0);
			break;
		case 'c':
			// left
			clocks[startx][starty].setPointerDegree(180, 90);
			clocks[startx][starty + 1].setPointerDegree(180, 0);
			clocks[startx][starty + 2].setPointerDegree(90, 0);
			// right
			clocks[startx + 1][starty].setPointerDegree(270, 270);
			clocks[startx + 1][starty + 1].setPointerDegree(def, def);
			clocks[startx + 1][starty + 2].setPointerDegree(270, 270);
			break;
		case 'd':
			// left
			clocks[startx][starty].setPointerDegree(def, def);
			clocks[startx][starty + 1].setPointerDegree(180, 90);
			clocks[startx][starty + 2].setPointerDegree(90, 0);
			// right
			clocks[startx + 1][starty].setPointerDegree(180, 180);
			clocks[startx + 1][starty + 1].setPointerDegree(180, 270);
			clocks[startx + 1][starty + 2].setPointerDegree(270, 0);
			break;
		case 'e':
			// left
			clocks[startx][starty].setPointerDegree(180, 90);
			clocks[startx][starty + 1].setPointerDegree(90, 0);
			clocks[startx][starty + 2].setPointerDegree(90, 0);
			// right
			clocks[startx + 1][starty].setPointerDegree(270, 270);
			clocks[startx + 1][starty + 1].setPointerDegree(270, 270);
			clocks[startx + 1][starty + 2].setPointerDegree(270, 270);
			break;
		case 'f':
			// left
			clocks[startx][starty].setPointerDegree(180, 90);
			clocks[startx][starty + 1].setPointerDegree(90, 0);
			clocks[startx][starty + 2].setPointerDegree(0, 0);
			// right
			clocks[startx + 1][starty].setPointerDegree(270, 270);
			clocks[startx + 1][starty + 1].setPointerDegree(270, 270);
			clocks[startx + 1][starty + 2].setPointerDegree(def, def);
			break;
		case 'g':
			// left
			clocks[startx][starty].setPointerDegree(180, 90);
			clocks[startx][starty + 1].setPointerDegree(180, 0);
			clocks[startx][starty + 2].setPointerDegree(90, 0);
			// right
			clocks[startx + 1][starty].setPointerDegree(270, 270);
			clocks[startx + 1][starty + 1].setPointerDegree(180, 270);
			clocks[startx + 1][starty + 2].setPointerDegree(270, 0);
			break;
		case 'h':
			// left
			clocks[startx][starty].setPointerDegree(180, 180);
			clocks[startx][starty + 1].setPointerDegree(90, 0);
			clocks[startx][starty + 2].setPointerDegree(0, 0);
			// right
			clocks[startx + 1][starty].setPointerDegree(180, 180);
			clocks[startx + 1][starty + 1].setPointerDegree(270, 0);
			clocks[startx + 1][starty + 2].setPointerDegree(0, 0);
			break;
		case 'i':
			// left
			clocks[startx][starty].setPointerDegree(def, def);
			clocks[startx][starty + 1].setPointerDegree(def, def);
			clocks[startx][starty + 2].setPointerDegree(def, def);
			// right
			clocks[startx + 1][starty].setPointerDegree(180, 180);
			clocks[startx + 1][starty + 1].setPointerDegree(180, 0);
			clocks[startx + 1][starty + 2].setPointerDegree(0, 0);
			break;
		case 'j':
			// left
			clocks[startx][starty].setPointerDegree(90, 90);
			clocks[startx][starty + 1].setPointerDegree(def, def);
			clocks[startx][starty + 2].setPointerDegree(90, 0);
			// right
			clocks[startx + 1][starty].setPointerDegree(180, 270);
			clocks[startx + 1][starty + 1].setPointerDegree(180, 0);
			clocks[startx + 1][starty + 2].setPointerDegree(270, 0);
			break;
		case 'k':
			// left
			clocks[startx][starty].setPointerDegree(180, 180);
			clocks[startx][starty + 1].setPointerDegree(180, 0);
			clocks[startx][starty + 2].setPointerDegree(0, 0);
			// right
			clocks[startx + 1][starty].setPointerDegree(def, def);
			clocks[startx + 1][starty + 1].setPointerDegree(def, def);
			clocks[startx + 1][starty + 2].setPointerDegree(315, 315);
			break;
		case 'l':
			// left
			clocks[startx][starty].setPointerDegree(180, 180);
			clocks[startx][starty + 1].setPointerDegree(180, 0);
			clocks[startx][starty + 2].setPointerDegree(90, 0);
			// right
			clocks[startx + 1][starty].setPointerDegree(def, def);
			clocks[startx + 1][starty + 1].setPointerDegree(def, def);
			clocks[startx + 1][starty + 2].setPointerDegree(270, 270);
			break;
		case 'm':
			// left
			clocks[startx][starty].setPointerDegree(180, 135);
			clocks[startx][starty + 1].setPointerDegree(180, 0);
			clocks[startx][starty + 2].setPointerDegree(0, 0);
			// right
			clocks[startx + 1][starty].setPointerDegree(180, 135);
			clocks[startx + 1][starty + 1].setPointerDegree(180, 0);
			clocks[startx + 1][starty + 2].setPointerDegree(0, 0);
			break;
		case 'n':
			// left
			clocks[startx][starty].setPointerDegree(180, 90);
			clocks[startx][starty + 1].setPointerDegree(180, 0);
			clocks[startx][starty + 2].setPointerDegree(0, 0);
			// right
			clocks[startx + 1][starty].setPointerDegree(180, 90);
			clocks[startx + 1][starty + 1].setPointerDegree(180, 0);
			clocks[startx + 1][starty + 2].setPointerDegree(0, 0);
			break;
		case 'o':
			// left
			clocks[startx][starty].setPointerDegree(180, 90);
			clocks[startx][starty + 1].setPointerDegree(180, 0);
			clocks[startx][starty + 2].setPointerDegree(90, 0);
			// right
			clocks[startx + 1][starty].setPointerDegree(180, 270);
			clocks[startx + 1][starty + 1].setPointerDegree(180, 0);
			clocks[startx + 1][starty + 2].setPointerDegree(270, 0);
			break;
		case 'p':
			// left
			clocks[startx][starty].setPointerDegree(180, 90);
			clocks[startx][starty + 1].setPointerDegree(180, 0);
			clocks[startx][starty + 2].setPointerDegree(0, 0);
			// right
			clocks[startx + 1][starty].setPointerDegree(180, 270);
			clocks[startx + 1][starty + 1].setPointerDegree(270, 0);
			clocks[startx + 1][starty + 2].setPointerDegree(def, def);
			break;
		case 'q':
			// left
			clocks[startx][starty].setPointerDegree(180, 90);
			clocks[startx][starty + 1].setPointerDegree(180, 0);
			clocks[startx][starty + 2].setPointerDegree(90, 0);
			// right
			clocks[startx + 1][starty].setPointerDegree(180, 270);
			clocks[startx + 1][starty + 1].setPointerDegree(180, 0);
			clocks[startx + 1][starty + 2].setPointerDegree(135, 135);
			break;
		case 'r':
			// left
			clocks[startx][starty].setPointerDegree(180, 90);
			clocks[startx][starty + 1].setPointerDegree(180, 0);
			clocks[startx][starty + 2].setPointerDegree(0, 0);
			// right
			clocks[startx + 1][starty].setPointerDegree(180, 270);
			clocks[startx + 1][starty + 1].setPointerDegree(270, 0);
			clocks[startx + 1][starty + 2].setPointerDegree(315, 315);
			break;
		case 's':
			// left
			clocks[startx][starty].setPointerDegree(180, 90);
			clocks[startx][starty + 1].setPointerDegree(90, 0);
			clocks[startx][starty + 2].setPointerDegree(90, 90);
			// right
			clocks[startx + 1][starty].setPointerDegree(270, 270);
			clocks[startx + 1][starty + 1].setPointerDegree(180, 270);
			clocks[startx + 1][starty + 2].setPointerDegree(270, 0);
			break;
		case 't':
			// left
			clocks[startx][starty].setPointerDegree(180, 180);
			clocks[startx][starty + 1].setPointerDegree(90, 0);
			clocks[startx][starty + 2].setPointerDegree(90, 0);
			// right
			clocks[startx + 1][starty].setPointerDegree(def, def);
			clocks[startx + 1][starty + 1].setPointerDegree(def, def);
			clocks[startx + 1][starty + 2].setPointerDegree(270, 270);
			break;
		case 'u':
			// left
			clocks[startx][starty].setPointerDegree(180, 180);
			clocks[startx][starty + 1].setPointerDegree(180, 0);
			clocks[startx][starty + 2].setPointerDegree(90, 0);
			// right
			clocks[startx + 1][starty].setPointerDegree(180, 180);
			clocks[startx + 1][starty + 1].setPointerDegree(180, 0);
			clocks[startx + 1][starty + 2].setPointerDegree(270, 0);
			break;
		case 'v':
			// left
			clocks[startx][starty].setPointerDegree(180, 180);
			clocks[startx][starty + 1].setPointerDegree(180, 0);
			clocks[startx][starty + 2].setPointerDegree(135, 0);
			// right
			clocks[startx + 1][starty].setPointerDegree(180, 180);
			clocks[startx + 1][starty + 1].setPointerDegree(180, 0);
			clocks[startx + 1][starty + 2].setPointerDegree(225, 0);
			break;
		case 'w':
			// left
			clocks[startx][starty].setPointerDegree(180, 180);
			clocks[startx][starty + 1].setPointerDegree(180, 0);
			clocks[startx][starty + 2].setPointerDegree(45, 0);
			// right
			clocks[startx + 1][starty].setPointerDegree(180, 180);
			clocks[startx + 1][starty + 1].setPointerDegree(180, 0);
			clocks[startx + 1][starty + 2].setPointerDegree(315, 0);
		case 'x':
			// left
			clocks[startx][starty].setPointerDegree(135, 135);
			clocks[startx][starty + 1].setPointerDegree(def, def);
			clocks[startx][starty + 2].setPointerDegree(def, def);
			// right
			clocks[startx + 1][starty].setPointerDegree(def, def);
			clocks[startx + 1][starty + 1].setPointerDegree(def, def);
			clocks[startx + 1][starty + 2].setPointerDegree(315, 315);
		case 'y':
			// left
			clocks[startx][starty].setPointerDegree(180, 180);
			clocks[startx][starty + 1].setPointerDegree(135, 0);
			clocks[startx][starty + 2].setPointerDegree(45, 45);
			// right
			clocks[startx + 1][starty].setPointerDegree(180, 180);
			clocks[startx + 1][starty + 1].setPointerDegree(225, 0);
			clocks[startx + 1][starty + 2].setPointerDegree(def, def);
		case 'z':
			// left
			clocks[startx][starty].setPointerDegree(90, 90);
			clocks[startx][starty + 1].setPointerDegree(90, 90);
			clocks[startx][starty + 2].setPointerDegree(90, 45);
			// right
			clocks[startx + 1][starty].setPointerDegree(180, 180);
			clocks[startx + 1][starty + 1].setPointerDegree(180, 0);
			clocks[startx + 1][starty + 2].setPointerDegree(225, 0);
		}
	}
}
