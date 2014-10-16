package Project;

import gui.Clock;

public class Values {
	// default value (bottom left)
	static int def = 225;
	
	//sets all clocks on default value
	public void setdefault(Clock[][] clocks)
	{
		for (int i = 0; i < clocks.length; i++)
		{
			for(int j = 0; j < clocks[0].length; j++)
			{
				clocks[i][j].setPointerDegree(def, def);
			}
		}
	}
	
	public void setall(int hours, int minutes, Clock[][] clocks)
	{
		for (int i = 0; i < clocks.length; i++)
		{
			for(int j = 0; j < clocks[0].length; j++)
			{
				clocks[i][j].setPointerDegree(hours, minutes);
			}
		}
	}
	// numbers 4x6
	public void displayCharacterhuge(char x, int startx, int starty,
			Clock[][] clocks) {
		switch(x) {
		case '1':
			//left
			clocks[startx][starty].setPointerDegree(def, def);
			clocks[startx][starty + 1].setPointerDegree(def, def);
			clocks[startx][starty + 2].setPointerDegree(def, def);
			clocks[startx][starty + 3].setPointerDegree(def, def);
			clocks[startx][starty + 4].setPointerDegree(def, def);
			clocks[startx][starty + 5].setPointerDegree(def, def);
			//middle left
			clocks[startx + 1][starty].setPointerDegree(180, 90);
			clocks[startx + 1][starty + 1].setPointerDegree(180, 0);
			clocks[startx + 1][starty + 2].setPointerDegree(180, 0);
			clocks[startx + 1][starty + 3].setPointerDegree(180, 0);
			clocks[startx + 1][starty + 4].setPointerDegree(180, 0);
			clocks[startx + 1][starty + 5].setPointerDegree(90, 0);
			//middle right
			clocks[startx + 2][starty].setPointerDegree(180, 270);
			clocks[startx + 2][starty + 1].setPointerDegree(180, 0);
			clocks[startx + 2][starty + 2].setPointerDegree(180, 0);
			clocks[startx + 2][starty + 3].setPointerDegree(180, 0);
			clocks[startx + 2][starty + 4].setPointerDegree(180, 0);
			clocks[startx + 2][starty + 5].setPointerDegree(270, 0);
			//right
			clocks[startx + 3][starty].setPointerDegree(def, def);
			clocks[startx + 3][starty + 1].setPointerDegree(def, def);
			clocks[startx + 3][starty + 2].setPointerDegree(def, def);
			clocks[startx + 3][starty + 3].setPointerDegree(def, def);
			clocks[startx + 3][starty + 4].setPointerDegree(def, def);
			clocks[startx + 3][starty + 5].setPointerDegree(def, def);
			break;
		case '2':
			//left
			clocks[startx][starty].setPointerDegree(180, 90);
			clocks[startx][starty + 1].setPointerDegree(90, 0);
			clocks[startx][starty + 2].setPointerDegree(180, 90);
			clocks[startx][starty + 3].setPointerDegree(180, 0);
			clocks[startx][starty + 4].setPointerDegree(180, 0);
			clocks[startx][starty + 5].setPointerDegree(90, 0);
			//middle left
			clocks[startx + 1][starty].setPointerDegree(270, 90);
			clocks[startx + 1][starty + 1].setPointerDegree(270, 90);
			clocks[startx + 1][starty + 2].setPointerDegree(270, 90);
			clocks[startx + 1][starty + 3].setPointerDegree(180, 90);
			clocks[startx + 1][starty + 4].setPointerDegree(90, 0);
			clocks[startx + 1][starty + 5].setPointerDegree(270, 90);
			//middle right
			clocks[startx + 2][starty].setPointerDegree(270, 90);
			clocks[startx + 2][starty + 1].setPointerDegree(180, 270);
			clocks[startx + 2][starty + 2].setPointerDegree(270, 0);
			clocks[startx + 2][starty + 3].setPointerDegree(270, 90);
			clocks[startx + 2][starty + 4].setPointerDegree(270, 90);
			clocks[startx + 2][starty + 5].setPointerDegree(270, 90);
			//right
			clocks[startx + 3][starty].setPointerDegree(180, 270);
			clocks[startx + 3][starty + 1].setPointerDegree(180, 0);
			clocks[startx + 3][starty + 2].setPointerDegree(180, 0);
			clocks[startx + 3][starty + 3].setPointerDegree(270, 0);
			clocks[startx + 3][starty + 4].setPointerDegree(180, 270);
			clocks[startx + 3][starty + 5].setPointerDegree(270, 0);
			break;
		case '3':
			//left
			clocks[startx][starty].setPointerDegree(180, 90);
			clocks[startx][starty + 1].setPointerDegree(90, 0);
			clocks[startx][starty + 2].setPointerDegree(180, 90);
			clocks[startx][starty + 3].setPointerDegree(90, 0);
			clocks[startx][starty + 4].setPointerDegree(180, 90);
			clocks[startx][starty + 5].setPointerDegree(90, 0);
			//middle left
			clocks[startx + 1][starty].setPointerDegree(270, 90);
			clocks[startx + 1][starty + 1].setPointerDegree(270, 90);
			clocks[startx + 1][starty + 2].setPointerDegree(270, 90);
			clocks[startx + 1][starty + 3].setPointerDegree(270, 90);
			clocks[startx + 1][starty + 4].setPointerDegree(270, 90);
			clocks[startx + 1][starty + 5].setPointerDegree(270, 90);
			//middle right
			clocks[startx + 2][starty].setPointerDegree(270, 90);
			clocks[startx + 2][starty + 1].setPointerDegree(180, 270);
			clocks[startx + 2][starty + 2].setPointerDegree(270, 0);
			clocks[startx + 2][starty + 3].setPointerDegree(180, 270);
			clocks[startx + 2][starty + 4].setPointerDegree(270, 0);
			clocks[startx + 2][starty + 5].setPointerDegree(270, 90);
			//right
			clocks[startx + 3][starty].setPointerDegree(180, 270);
			clocks[startx + 3][starty + 1].setPointerDegree(180, 0);
			clocks[startx + 3][starty + 2].setPointerDegree(180, 0);
			clocks[startx + 3][starty + 3].setPointerDegree(180, 0);
			clocks[startx + 3][starty + 4].setPointerDegree(180, 0);
			clocks[startx + 3][starty + 5].setPointerDegree(270, 0);
			break;
		case '4':
			//left
			clocks[startx][starty].setPointerDegree(180, 90);
			clocks[startx][starty + 1].setPointerDegree(180, 0);
			clocks[startx][starty + 2].setPointerDegree(180, 0);
			clocks[startx][starty + 3].setPointerDegree(90, 0);
			clocks[startx][starty + 4].setPointerDegree(def, def);
			clocks[startx][starty + 5].setPointerDegree(def, def);
			//middle left
			clocks[startx + 1][starty].setPointerDegree(180, 270);
			clocks[startx + 1][starty + 1].setPointerDegree(180, 0);
			clocks[startx + 1][starty + 2].setPointerDegree(90, 0);
			clocks[startx + 1][starty + 3].setPointerDegree(270, 90);
			clocks[startx + 1][starty + 4].setPointerDegree(def, def);
			clocks[startx + 1][starty + 5].setPointerDegree(def, def);
			//middle right
			clocks[startx + 2][starty].setPointerDegree(180, 90);
			clocks[startx + 2][starty + 1].setPointerDegree(180, 0);
			clocks[startx + 2][starty + 2].setPointerDegree(270, 0);
			clocks[startx + 2][starty + 3].setPointerDegree(180, 270);
			clocks[startx + 2][starty + 4].setPointerDegree(180, 0);
			clocks[startx + 2][starty + 5].setPointerDegree(90, 0);
			//right
			clocks[startx + 3][starty].setPointerDegree(180, 270);
			clocks[startx + 3][starty + 1].setPointerDegree(180, 0);
			clocks[startx + 3][starty + 2].setPointerDegree(180, 0);
			clocks[startx + 3][starty + 3].setPointerDegree(180, 0);
			clocks[startx + 3][starty + 4].setPointerDegree(180, 0);
			clocks[startx + 3][starty + 5].setPointerDegree(270, 0);
			break;
		case '5':
			//left
			clocks[startx][starty].setPointerDegree(180, 90);
			clocks[startx][starty + 1].setPointerDegree(180, 0);
			clocks[startx][starty + 2].setPointerDegree(180, 0);
			clocks[startx][starty + 3].setPointerDegree(90, 0);
			clocks[startx][starty + 4].setPointerDegree(180, 90);
			clocks[startx][starty + 5].setPointerDegree(90, 0);
			//middle left
			clocks[startx + 1][starty].setPointerDegree(270, 90);
			clocks[startx + 1][starty + 1].setPointerDegree(180, 90);
			clocks[startx + 1][starty + 2].setPointerDegree(90, 0);
			clocks[startx + 1][starty + 3].setPointerDegree(270, 90);
			clocks[startx + 1][starty + 4].setPointerDegree(270, 90);
			clocks[startx + 1][starty + 5].setPointerDegree(270, 90);
			//middle right
			clocks[startx + 2][starty].setPointerDegree(270, 90);
			clocks[startx + 2][starty + 1].setPointerDegree(270, 90);
			clocks[startx + 2][starty + 2].setPointerDegree(270, 90);
			clocks[startx + 2][starty + 3].setPointerDegree(180, 270);
			clocks[startx + 2][starty + 4].setPointerDegree(270, 0);
			clocks[startx + 2][starty + 5].setPointerDegree(270, 90);
			//right
			clocks[startx + 3][starty].setPointerDegree(180, 270);
			clocks[startx + 3][starty + 1].setPointerDegree(270, 0);
			clocks[startx + 3][starty + 2].setPointerDegree(180, 270);
			clocks[startx + 3][starty + 3].setPointerDegree(180, 0);
			clocks[startx + 3][starty + 4].setPointerDegree(180, 0);
			clocks[startx + 3][starty + 5].setPointerDegree(270, 0);
			break;
		case '6':
			//left
			clocks[startx][starty].setPointerDegree(180, 90);
			clocks[startx][starty + 1].setPointerDegree(180, 0);
			clocks[startx][starty + 2].setPointerDegree(180, 0);
			clocks[startx][starty + 3].setPointerDegree(180, 0);
			clocks[startx][starty + 4].setPointerDegree(180, 0);
			clocks[startx][starty + 5].setPointerDegree(90, 0);
			//middle left
			clocks[startx + 1][starty].setPointerDegree(270, 90);
			clocks[startx + 1][starty + 1].setPointerDegree(180, 90);
			clocks[startx + 1][starty + 2].setPointerDegree(90, 0);
			clocks[startx + 1][starty + 3].setPointerDegree(180, 90);
			clocks[startx + 1][starty + 4].setPointerDegree(90, 0);
			clocks[startx + 1][starty + 5].setPointerDegree(270, 90);
			//middle right
			clocks[startx + 2][starty].setPointerDegree(270, 90);
			clocks[startx + 2][starty + 1].setPointerDegree(270, 90);
			clocks[startx + 2][starty + 2].setPointerDegree(270, 90);
			clocks[startx + 2][starty + 3].setPointerDegree(180, 270);
			clocks[startx + 2][starty + 4].setPointerDegree(270, 0);
			clocks[startx + 2][starty + 5].setPointerDegree(270, 90);
			//right
			clocks[startx + 3][starty].setPointerDegree(180, 270);
			clocks[startx + 3][starty + 1].setPointerDegree(270, 0);
			clocks[startx + 3][starty + 2].setPointerDegree(180, 270);
			clocks[startx + 3][starty + 3].setPointerDegree(180, 0);
			clocks[startx + 3][starty + 4].setPointerDegree(180, 0);
			clocks[startx + 3][starty + 5].setPointerDegree(270, 0);
			break;
		case '7':
			//left
			clocks[startx][starty].setPointerDegree(180, 90);
			clocks[startx][starty + 1].setPointerDegree(90, 0);
			clocks[startx][starty + 2].setPointerDegree(def, def);
			clocks[startx][starty + 3].setPointerDegree(def, def);
			clocks[startx][starty + 4].setPointerDegree(def, def);
			clocks[startx][starty + 5].setPointerDegree(def, def);
			//middle left
			clocks[startx + 1][starty].setPointerDegree(270, 90);
			clocks[startx + 1][starty + 1].setPointerDegree(270, 90);
			clocks[startx + 1][starty + 2].setPointerDegree(def, def);
			clocks[startx + 1][starty + 3].setPointerDegree(def, def);
			clocks[startx + 1][starty + 4].setPointerDegree(def, def);
			clocks[startx + 1][starty + 5].setPointerDegree(def, def);
			//middle right
			clocks[startx + 2][starty].setPointerDegree(270, 90);
			clocks[startx + 2][starty + 1].setPointerDegree(180, 270);
			clocks[startx + 2][starty + 2].setPointerDegree(180, 0);
			clocks[startx + 2][starty + 3].setPointerDegree(180, 0);
			clocks[startx + 2][starty + 4].setPointerDegree(180, 0);
			clocks[startx + 2][starty + 5].setPointerDegree(90, 0);
			//right
			clocks[startx + 3][starty].setPointerDegree(180, 270);
			clocks[startx + 3][starty + 1].setPointerDegree(180, 0);
			clocks[startx + 3][starty + 2].setPointerDegree(180, 0);
			clocks[startx + 3][starty + 3].setPointerDegree(180, 0);
			clocks[startx + 3][starty + 4].setPointerDegree(180, 0);
			clocks[startx + 3][starty + 5].setPointerDegree(270, 0);
			break;
		case '8':
			//left
			clocks[startx][starty].setPointerDegree(180, 90);
			clocks[startx][starty + 1].setPointerDegree(180, 0);
			clocks[startx][starty + 2].setPointerDegree(180, 0);
			clocks[startx][starty + 3].setPointerDegree(180, 0);
			clocks[startx][starty + 4].setPointerDegree(180, 0);
			clocks[startx][starty + 5].setPointerDegree(90, 0);
			//middle left
			clocks[startx + 1][starty].setPointerDegree(270, 90);
			clocks[startx + 1][starty + 1].setPointerDegree(180, 90);
			clocks[startx + 1][starty + 2].setPointerDegree(90, 0);
			clocks[startx + 1][starty + 3].setPointerDegree(180, 90);
			clocks[startx + 1][starty + 4].setPointerDegree(90, 0);
			clocks[startx + 1][starty + 5].setPointerDegree(270, 90);
			//middle right
			clocks[startx + 2][starty].setPointerDegree(270, 90);
			clocks[startx + 2][starty + 1].setPointerDegree(180, 270);
			clocks[startx + 2][starty + 2].setPointerDegree(270, 0);
			clocks[startx + 2][starty + 3].setPointerDegree(180, 270);
			clocks[startx + 2][starty + 4].setPointerDegree(270, 0);
			clocks[startx + 2][starty + 5].setPointerDegree(270, 90);
			//right
			clocks[startx + 3][starty].setPointerDegree(180, 270);
			clocks[startx + 3][starty + 1].setPointerDegree(180, 0);
			clocks[startx + 3][starty + 2].setPointerDegree(180, 0);
			clocks[startx + 3][starty + 3].setPointerDegree(180, 0);
			clocks[startx + 3][starty + 4].setPointerDegree(180, 0);
			clocks[startx + 3][starty + 5].setPointerDegree(270, 0);
			break;
		case '9':
			//left
			clocks[startx][starty].setPointerDegree(180, 90);
			clocks[startx][starty + 1].setPointerDegree(180, 0);
			clocks[startx][starty + 2].setPointerDegree(180, 0);
			clocks[startx][starty + 3].setPointerDegree(90, 0);
			clocks[startx][starty + 4].setPointerDegree(180, 90);
			clocks[startx][starty + 5].setPointerDegree(90, 0);
			//middle left
			clocks[startx + 1][starty].setPointerDegree(270, 90);
			clocks[startx + 1][starty + 1].setPointerDegree(180, 90);
			clocks[startx + 1][starty + 2].setPointerDegree(90, 0);
			clocks[startx + 1][starty + 3].setPointerDegree(270, 90);
			clocks[startx + 1][starty + 4].setPointerDegree(270, 90);
			clocks[startx + 1][starty + 5].setPointerDegree(270, 90);
			//middle right
			clocks[startx + 2][starty].setPointerDegree(270, 90);
			clocks[startx + 2][starty + 1].setPointerDegree(180, 270);
			clocks[startx + 2][starty + 2].setPointerDegree(270, 0);
			clocks[startx + 2][starty + 3].setPointerDegree(180, 270);
			clocks[startx + 2][starty + 4].setPointerDegree(270, 0);
			clocks[startx + 2][starty + 5].setPointerDegree(270, 90);
			//right
			clocks[startx + 3][starty].setPointerDegree(180, 270);
			clocks[startx + 3][starty + 1].setPointerDegree(180, 0);
			clocks[startx + 3][starty + 2].setPointerDegree(180, 0);
			clocks[startx + 3][starty + 3].setPointerDegree(180, 0);
			clocks[startx + 3][starty + 4].setPointerDegree(180, 0);
			clocks[startx + 3][starty + 5].setPointerDegree(270, 0);
			break;
		case '0':
			//left
			clocks[startx][starty].setPointerDegree(180, 90);
			clocks[startx][starty + 1].setPointerDegree(180, 0);
			clocks[startx][starty + 2].setPointerDegree(180, 0);
			clocks[startx][starty + 3].setPointerDegree(180, 0);
			clocks[startx][starty + 4].setPointerDegree(180, 0);
			clocks[startx][starty + 5].setPointerDegree(90, 0);
			//middle left
			clocks[startx + 1][starty].setPointerDegree(270, 90);
			clocks[startx + 1][starty + 1].setPointerDegree(180, 90);
			clocks[startx + 1][starty + 2].setPointerDegree(180, 0);
			clocks[startx + 1][starty + 3].setPointerDegree(180, 0);
			clocks[startx + 1][starty + 4].setPointerDegree(90, 0);
			clocks[startx + 1][starty + 5].setPointerDegree(270, 90);
			//middle right
			clocks[startx + 2][starty].setPointerDegree(270, 90);
			clocks[startx + 2][starty + 1].setPointerDegree(180, 270);
			clocks[startx + 2][starty + 2].setPointerDegree(180, 0);
			clocks[startx + 2][starty + 3].setPointerDegree(180, 0);
			clocks[startx + 2][starty + 4].setPointerDegree(270, 0);
			clocks[startx + 2][starty + 5].setPointerDegree(270, 90);
			//right
			clocks[startx + 3][starty].setPointerDegree(180, 270);
			clocks[startx + 3][starty + 1].setPointerDegree(180, 0);
			clocks[startx + 3][starty + 2].setPointerDegree(180, 0);
			clocks[startx + 3][starty + 3].setPointerDegree(180, 0);
			clocks[startx + 3][starty + 4].setPointerDegree(180, 0);
			clocks[startx + 3][starty + 5].setPointerDegree(270, 0);
			break;
		case '°':
			clocks[startx][starty].setPointerDegree(180, 90);
			clocks[startx][starty+1].setPointerDegree(90, 0);
			clocks[startx+1][starty].setPointerDegree(180, 270);
			clocks[startx+1][starty+1].setPointerDegree(270, 0);
			break;
		case '%':
			clocks[startx][starty].setPointerDegree(180, 90);
			clocks[startx][starty+1].setPointerDegree(90, 0);
			clocks[startx][starty+3].setPointerDegree(180, 45);
			clocks[startx][starty+4].setPointerDegree(45, 0);
			
			clocks[startx+1][starty].setPointerDegree(180, 270);
			clocks[startx+1][starty+1].setPointerDegree(270, 0);
			clocks[startx+1][starty+2].setPointerDegree(def, 45);
			clocks[startx+1][starty+3].setPointerDegree(def, 45);
			
			clocks[startx+2][starty+1].setPointerDegree(def, 45);
			clocks[startx+2][starty+2].setPointerDegree(def, 45);
			clocks[startx+2][starty+3].setPointerDegree(180, 90);
			clocks[startx+2][starty+4].setPointerDegree(90, 0);
			
			clocks[startx+3][starty+0].setPointerDegree(180, def);
			clocks[startx+3][starty+1].setPointerDegree(def, 0);
			clocks[startx+3][starty+3].setPointerDegree(180, 270);
			clocks[startx+3][starty+4].setPointerDegree(270, 0);
			break;
		case 'C':
			//left
			clocks[startx][starty].setPointerDegree(180, 90);
			clocks[startx][starty + 1].setPointerDegree(180, 0);
			clocks[startx][starty + 2].setPointerDegree(180, 0);
			clocks[startx][starty + 3].setPointerDegree(180, 0);
			clocks[startx][starty + 4].setPointerDegree(180, 0);
			clocks[startx][starty + 5].setPointerDegree(90, 0);
			//middle left
			clocks[startx + 1][starty].setPointerDegree(270, 90);
			clocks[startx + 1][starty + 1].setPointerDegree(180, 90);
			clocks[startx + 1][starty + 2].setPointerDegree(180, 0);
			clocks[startx + 1][starty + 3].setPointerDegree(180, 0);
			clocks[startx + 1][starty + 4].setPointerDegree(90, 0);
			clocks[startx + 1][starty + 5].setPointerDegree(270, 90);
			//middle right
			clocks[startx + 2][starty].setPointerDegree(270, 90);
			clocks[startx + 2][starty + 1].setPointerDegree(270, 90);
			clocks[startx + 2][starty + 2].setPointerDegree(def, def);
			clocks[startx + 2][starty + 3].setPointerDegree(def, def);
			clocks[startx + 2][starty + 4].setPointerDegree(270, 90);
			clocks[startx + 2][starty + 5].setPointerDegree(270, 90);
			//right
			clocks[startx + 3][starty].setPointerDegree(180, 270);
			clocks[startx + 3][starty + 1].setPointerDegree(270, 0);
			clocks[startx + 3][starty + 2].setPointerDegree(def, def);
			clocks[startx + 3][starty + 3].setPointerDegree(def, def);
			clocks[startx + 3][starty + 4].setPointerDegree(270, 180);
			clocks[startx + 3][starty + 5].setPointerDegree(270, 0);
			break;
		}
	}

	// character 2x3
	public void displayCharacter(char x, int startx, int starty,
			Clock[][] clocks) {
		switch (x) {
		case '-':
			clocks[startx][starty+1].setPointerDegree(90, 90);
			clocks[startx+1][starty+1].setPointerDegree(270, 270);
			break;
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
			clocks[startx + 1][starty + 1].setPointerDegree(180, 0);
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
			clocks[startx + 1][starty].setPointerDegree(180, 225);
			clocks[startx + 1][starty + 1].setPointerDegree(180, 0);
			clocks[startx + 1][starty + 2].setPointerDegree(0, 0);
			break;
		case 'n':
			// left
			clocks[startx][starty].setPointerDegree(180, 90);
			clocks[startx][starty + 1].setPointerDegree(180, 0);
			clocks[startx][starty + 2].setPointerDegree(0, 0);
			// right
			clocks[startx + 1][starty].setPointerDegree(180, 270);
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
			break;
		case 'x':
			// left
			clocks[startx][starty].setPointerDegree(135, 135);
			clocks[startx][starty + 1].setPointerDegree(def, def);
			clocks[startx][starty + 2].setPointerDegree(45, 45);
			// right
			clocks[startx + 1][starty].setPointerDegree(def, def);
			clocks[startx + 1][starty + 1].setPointerDegree(def, def);
			clocks[startx + 1][starty + 2].setPointerDegree(315, 315);
			break;
		case 'y':
			// left
			clocks[startx][starty].setPointerDegree(180, 180);
			clocks[startx][starty + 1].setPointerDegree(135, 0);
			clocks[startx][starty + 2].setPointerDegree(45, 45);
			// right
			clocks[startx + 1][starty].setPointerDegree(180, 180);
			clocks[startx + 1][starty + 1].setPointerDegree(225, 0);
			clocks[startx + 1][starty + 2].setPointerDegree(def, def);
			break;
		case 'z':
			// left
			clocks[startx][starty].setPointerDegree(90, 90);
			clocks[startx][starty + 1].setPointerDegree(90, 90);
			clocks[startx][starty + 2].setPointerDegree(90, 45);
			// right
			clocks[startx + 1][starty].setPointerDegree(180, 270);
			clocks[startx + 1][starty + 1].setPointerDegree(225, 0);
			clocks[startx + 1][starty + 2].setPointerDegree(270, 270);
			break;
		}
	}

	// moves pointer for weather display
	public void showWeather(String weather, int startx, int starty,
			Clock[][] clocks) {
		// switch over weather
		// TODO fill in every type of possible weather we can get from api
		// wolkig, teils wolkig, bedeckt
		// heiter
		// regen, leichter regen, leichte regenschauer, leichter regen
		// dichter nebel, schwacher dunst
		// TODO implement pointer position
		setdefault(clocks);
		switch (weather) {
		case "teils wolkig":
		case "wolkig":
			drawcloud(startx, starty, clocks);
			break;
		case "leichter regen":
		case "regen":
			drawcloud(startx, starty, clocks);
			drawrain(startx, starty, clocks);
			break;
		case "gewitter":
			drawcloud(startx, starty, clocks);
			drawrain(startx, starty, clocks);
			drawlightning(startx, starty, clocks);
			break;
		case "sonne":
			startanimation1(clocks[0].length, clocks.length,clocks);
			drawsun(startx, starty, clocks);
		}
	}
	//draws sun
	private void drawsun(int startx, int starty, Clock[][] clocks)
	{
		for(int i = 0; i < 5; i++)
		{
			for(int j = 3; j < 5; j++)
			{
				clocks[i][j].setPointerDegree(270, 90);
			}
		}
		for(int i = 11; i < 16; i ++)
		{
			for(int j = 3; j < 5; j++)
			{
				clocks[i][j].setPointerDegree(270, 90);
			}
		}
		clocks[2][0].setPointerDegree(135, 315);
		clocks[2][7].setPointerDegree(225, 45);
		
		clocks[3][1].setPointerDegree(135, 315);
		clocks[3][6].setPointerDegree(225, 45);
		
		clocks[4][2].setPointerDegree(135, 315);
		clocks[4][5].setPointerDegree(225, 45);
		
		clocks[5][0].setPointerDegree(135, 315);
		clocks[5][3].setPointerDegree(180, 45);
		clocks[5][4].setPointerDegree(135, 0);
		clocks[5][7].setPointerDegree(225, 45);
		
		clocks[6][1].setPointerDegree(135, 315);
		clocks[6][2].setPointerDegree(225, 45);
		clocks[6][5].setPointerDegree(135, 315);
		clocks[6][6].setPointerDegree(225, 45);
		
		clocks[7][0].setPointerDegree(180, 0);
		clocks[7][1].setPointerDegree(225, 90);
		clocks[7][6].setPointerDegree(90, 315);
		clocks[7][7].setPointerDegree(180, 0);
		
		clocks[8][0].setPointerDegree(180, 0);
		clocks[8][1].setPointerDegree(135, 270);
		clocks[8][6].setPointerDegree(270, 45);
		clocks[8][7].setPointerDegree(180, 0);
		
		clocks[9][1].setPointerDegree(225, 45);
		clocks[9][2].setPointerDegree(135, 315);
		clocks[9][5].setPointerDegree(225, 45);
		clocks[9][6].setPointerDegree(135, 315);
		
		clocks[10][0].setPointerDegree(225, 45);
		clocks[10][2].setPointerDegree(225, 45);
		clocks[10][3].setPointerDegree(180, 315);
		clocks[10][4].setPointerDegree(225, 0);
		clocks[10][5].setPointerDegree(135, 315);
		clocks[10][7].setPointerDegree(135, 315);
		
		clocks[11][1].setPointerDegree(225, 45);
		clocks[11][6].setPointerDegree(135, 315);
		
		clocks[12][0].setPointerDegree(225, 45);
		clocks[12][7].setPointerDegree(135, 315);
	}
	//draws lightning
	private void drawlightning (int startx, int starty, Clock[][] clocks)
	{
		clocks[startx][starty+2].setPointerDegree(180, 180);
		clocks[startx][starty+3].setPointerDegree(90, 0);
		
		clocks[startx+1][starty+1].setPointerDegree(90, 45);
		clocks[startx+1][starty+2].setPointerDegree(225, 45);
		clocks[startx+1][starty+3].setPointerDegree(270, 270);

		clocks[startx+2][starty].setPointerDegree(225, 45);
		clocks[startx+2][starty+1].setPointerDegree(225, 270);
		
		clocks[startx+13][starty+2].setPointerDegree(180, 180);
		clocks[startx+13][starty+3].setPointerDegree(90, 0);
		
		clocks[startx+14][starty+1].setPointerDegree(90, 45);
		clocks[startx+14][starty+2].setPointerDegree(225, 45);
		clocks[startx+14][starty+3].setPointerDegree(270, 270);

		clocks[startx+15][starty].setPointerDegree(225, 45);
		clocks[startx+15][starty+1].setPointerDegree(225, 270);
	}
	//draws cloud
	private void drawcloud (int startx, int starty, Clock[][] clocks)
	{
		clocks[startx+1][starty+5].setPointerDegree(180, 45);
		clocks[startx+1][starty+6].setPointerDegree(90, 0);
		
		clocks[startx+2][starty+4].setPointerDegree(225, 90);
		clocks[startx+2][starty+6].setPointerDegree(270, 90);
		
		clocks[startx+3][starty+3].setPointerDegree(225, 45);
		clocks[startx+3][starty+4].setPointerDegree(135, 270);
		clocks[startx+3][starty+6].setPointerDegree(270, 90);
		
		clocks[startx+4][starty+2].setPointerDegree(225, 90);
		clocks[startx+4][starty+6].setPointerDegree(270, 90);
		
		clocks[startx+5][starty+2].setPointerDegree(135, 270);
		clocks[startx+5][starty+6].setPointerDegree(270, 90);
		
		clocks[startx+6][starty+1].setPointerDegree(225, 45);
		clocks[startx+6][starty+3].setPointerDegree(135, 315);
		clocks[startx+6][starty+6].setPointerDegree(270, 90);
		
		clocks[startx+7][starty].setPointerDegree(225, 90);
		clocks[startx+7][starty+6].setPointerDegree(270, 90);
		
		clocks[startx+8][starty].setPointerDegree(135, 270);
		clocks[startx+8][starty+6].setPointerDegree(270, 90);
		
		clocks[startx+9][starty+1].setPointerDegree(315, 135);
		clocks[startx+9][starty+3].setPointerDegree(225, 45);
		clocks[startx+9][starty+6].setPointerDegree(270, 90);
		
		clocks[startx+10][starty+2].setPointerDegree(225, 90);
		clocks[startx+10][starty+6].setPointerDegree(270, 90);
		
		clocks[startx+11][starty+2].setPointerDegree(135, 270);
		clocks[startx+11][starty+6].setPointerDegree(270, 90);
		
		clocks[startx+12][starty+3].setPointerDegree(135, 315);
		clocks[startx+12][starty+4].setPointerDegree(225, 90);
		clocks[startx+12][starty+6].setPointerDegree(270, 90);
		
		clocks[startx+13][starty+4].setPointerDegree(135, 270);
		clocks[startx+13][starty+6].setPointerDegree(270, 90);
		
		clocks[startx+14][starty+5].setPointerDegree(180, 315);
		clocks[startx+14][starty+6].setPointerDegree(270, 0);
	}
	//draws rain
	private void drawrain(int startx, int starty, Clock[][] clocks)
	{
		for(int i = startx+1; i < startx+14; i++)
		{
			clocks[i][starty+7].setPointerDegree(def, 45);
		}
	}
	// moves pointer into position for animation1
	public void startanimation1(int rows, int columns, Clock[][] clocks) {
		if (rows % 2 == 0 && columns % 2 == 0) {
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					if (i < (rows / 2)) {
						if (j < (columns / 2)) {
							// top left
							clocks[j][i].setPointerDegree(315, 315);
						} else {
							// top right
							clocks[j][i].setPointerDegree(45, 45);
						}
					} else {
						if (j < (columns / 2)) {
							// bottom left
							clocks[j][i].setPointerDegree(225, 225);
						} else {
							// bottom right
							clocks[j][i].setPointerDegree(135, 135);
						}
					}
				}
			}
		}
		// if rows or columns cant be devided by 2 with 0 rest, cant split
		// screen in 4 parts
		// => move every pointer of every clock in default position
		else {
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					clocks[j][i].setPointerDegree(def, def);
				}
			}
		}
	}
}
