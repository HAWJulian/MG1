package gui_2;

import gui.Clock;

public class ReworkedValues {
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
	
	public void setRowToDefault(Clock[][] clocks, int row)
	{
		for (int i=0; i<clocks.length; i++)
		{
			clocks[i][row].setPointerDegree(def, def);
		}
	}
	
	
	public void rotateover360(int degreeH, int degreeM, boolean dirH, boolean dirM, Clock[][] clocks)
	{
		for (int i = 0; i < clocks.length; i++)
		{
			for(int j = 0; j < clocks[0].length; j++)
			{
				clocks[i][j].rotateForMoreThan360Degrees(degreeH, degreeM, dirH, dirM);
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
	//number 4x6 for display animation -> clock
	public void displayAnimationCharacter(int x, int column, Clock[][] clocks)
	{
		switch(x)
		{
		case 1:
			switch(column%4)
			{
			case 0:
			clocks[column][1].forceRotation(def, def, clocks[column][1].getDirectionH(), clocks[column][1].getDirectionM());
			clocks[column][2].forceRotation(def, def, clocks[column][2].getDirectionH(), clocks[column][2].getDirectionM());
			clocks[column][3].forceRotation(def, def, clocks[column][3].getDirectionH(), clocks[column][3].getDirectionM());
			clocks[column][4].forceRotation(def, def, clocks[column][4].getDirectionH(), clocks[column][4].getDirectionM());
			clocks[column][5].forceRotation(def, def, clocks[column][5].getDirectionH(), clocks[column][5].getDirectionM());
			clocks[column][6].forceRotation(def, def, clocks[column][6].getDirectionH(), clocks[column][6].getDirectionM());
			break;
			case 1:
			clocks[column][1].forceRotation(180, 90, clocks[column][1].getDirectionH(), clocks[column][1].getDirectionM());
			clocks[column][2].forceRotation(180, 0, clocks[column][2].getDirectionH(), clocks[column][2].getDirectionM());
			clocks[column][3].forceRotation(180, 0, clocks[column][3].getDirectionH(), clocks[column][3].getDirectionM());
			clocks[column][4].forceRotation(180, 0, clocks[column][4].getDirectionH(), clocks[column][4].getDirectionM());
			clocks[column][5].forceRotation(180, 0, clocks[column][5].getDirectionH(), clocks[column][5].getDirectionM());
			clocks[column][6].forceRotation(90, 0, clocks[column][6].getDirectionH(), clocks[column][6].getDirectionM());	
			break;
			case 2:
			clocks[column][1].forceRotation(180, 270, clocks[column][1].getDirectionH(), clocks[column][1].getDirectionM());
			clocks[column][2].forceRotation(180, 0, clocks[column][2].getDirectionH(), clocks[column][2].getDirectionM());
			clocks[column][3].forceRotation(180, 0, clocks[column][3].getDirectionH(), clocks[column][3].getDirectionM());
			clocks[column][4].forceRotation(180, 0, clocks[column][4].getDirectionH(), clocks[column][4].getDirectionM());
			clocks[column][5].forceRotation(180, 0, clocks[column][5].getDirectionH(), clocks[column][5].getDirectionM());
			clocks[column][6].forceRotation(270, 0, clocks[column][6].getDirectionH(), clocks[column][6].getDirectionM());
			break;
			case 3:
			clocks[column][1].forceRotation(def, def, clocks[column][1].getDirectionH(), clocks[column][1].getDirectionM());
			clocks[column][2].forceRotation(def, def, clocks[column][2].getDirectionH(), clocks[column][2].getDirectionM());
			clocks[column][3].forceRotation(def, def, clocks[column][3].getDirectionH(), clocks[column][3].getDirectionM());
			clocks[column][4].forceRotation(def, def, clocks[column][4].getDirectionH(), clocks[column][4].getDirectionM());
			clocks[column][5].forceRotation(def, def, clocks[column][5].getDirectionH(), clocks[column][5].getDirectionM());
			clocks[column][6].forceRotation(def, def, clocks[column][6].getDirectionH(), clocks[column][6].getDirectionM());
			break;
			}
		break;
		case 2:
			switch(column%4)
			{
			case 0:
			clocks[column][1].forceRotation(180, 90, clocks[column][1].getDirectionH(), clocks[column][1].getDirectionM());
			clocks[column][2].forceRotation(90, 0, clocks[column][2].getDirectionH(), clocks[column][2].getDirectionM());
			clocks[column][3].forceRotation(180, 90, clocks[column][3].getDirectionH(), clocks[column][3].getDirectionM());
			clocks[column][4].forceRotation(180, 0, clocks[column][4].getDirectionH(), clocks[column][4].getDirectionM());
			clocks[column][5].forceRotation(180, 0, clocks[column][5].getDirectionH(), clocks[column][5].getDirectionM());
			clocks[column][6].forceRotation(90, 0, clocks[column][6].getDirectionH(), clocks[column][6].getDirectionM());
			break;
			case 1:
			clocks[column][1].forceRotation(270, 90, clocks[column][1].getDirectionH(), clocks[column][1].getDirectionM());
			clocks[column][2].forceRotation(270, 90, clocks[column][2].getDirectionH(), clocks[column][2].getDirectionM());
			clocks[column][3].forceRotation(270, 90, clocks[column][3].getDirectionH(), clocks[column][3].getDirectionM());
			clocks[column][4].forceRotation(180, 90, clocks[column][4].getDirectionH(), clocks[column][4].getDirectionM());
			clocks[column][5].forceRotation(90, 0, clocks[column][5].getDirectionH(), clocks[column][5].getDirectionM());
			clocks[column][6].forceRotation(270, 90, clocks[column][6].getDirectionH(), clocks[column][6].getDirectionM());	
			break;
			case 2:
			clocks[column][1].forceRotation(270, 90, clocks[column][1].getDirectionH(), clocks[column][1].getDirectionM());
			clocks[column][2].forceRotation(180, 270, clocks[column][2].getDirectionH(), clocks[column][2].getDirectionM());
			clocks[column][3].forceRotation(270, 0, clocks[column][3].getDirectionH(), clocks[column][3].getDirectionM());
			clocks[column][4].forceRotation(270, 90, clocks[column][4].getDirectionH(), clocks[column][4].getDirectionM());
			clocks[column][5].forceRotation(270, 90, clocks[column][5].getDirectionH(), clocks[column][5].getDirectionM());
			clocks[column][6].forceRotation(270, 90, clocks[column][6].getDirectionH(), clocks[column][6].getDirectionM());
			break;
			case 3:
			clocks[column][1].forceRotation(180, 270, clocks[column][1].getDirectionH(), clocks[column][1].getDirectionM());
			clocks[column][2].forceRotation(180, 0, clocks[column][2].getDirectionH(), clocks[column][2].getDirectionM());
			clocks[column][3].forceRotation(180, 0, clocks[column][3].getDirectionH(), clocks[column][3].getDirectionM());
			clocks[column][4].forceRotation(270, 0, clocks[column][4].getDirectionH(), clocks[column][4].getDirectionM());
			clocks[column][5].forceRotation(180, 270, clocks[column][5].getDirectionH(), clocks[column][5].getDirectionM());
			clocks[column][6].forceRotation(270, 0, clocks[column][6].getDirectionH(), clocks[column][6].getDirectionM());
			break;
			}	
		break;
		case 3:
			
			switch(column%4)
			{
			case 0:
			clocks[column][1].forceRotation(180, 90, clocks[column][1].getDirectionH(), clocks[column][1].getDirectionM());
			clocks[column][2].forceRotation(90, 0, clocks[column][2].getDirectionH(), clocks[column][2].getDirectionM());
			clocks[column][3].forceRotation(180, 90, clocks[column][3].getDirectionH(), clocks[column][3].getDirectionM());
			clocks[column][4].forceRotation(90, 0, clocks[column][4].getDirectionH(), clocks[column][4].getDirectionM());
			clocks[column][5].forceRotation(180, 90, clocks[column][5].getDirectionH(), clocks[column][5].getDirectionM());
			clocks[column][6].forceRotation(90, 0, clocks[column][6].getDirectionH(), clocks[column][6].getDirectionM());
			break;
			case 1:
			clocks[column][1].forceRotation(270, 90, clocks[column][1].getDirectionH(), clocks[column][1].getDirectionM());
			clocks[column][2].forceRotation(270, 90, clocks[column][2].getDirectionH(), clocks[column][2].getDirectionM());
			clocks[column][3].forceRotation(270, 90, clocks[column][3].getDirectionH(), clocks[column][3].getDirectionM());
			clocks[column][4].forceRotation(270, 90, clocks[column][4].getDirectionH(), clocks[column][4].getDirectionM());
			clocks[column][5].forceRotation(270, 90, clocks[column][5].getDirectionH(), clocks[column][5].getDirectionM());
			clocks[column][6].forceRotation(270, 90, clocks[column][6].getDirectionH(), clocks[column][6].getDirectionM());	
			break;
			case 2:
			clocks[column][1].forceRotation(270, 90, clocks[column][1].getDirectionH(), clocks[column][1].getDirectionM());
			clocks[column][2].forceRotation(180, 270, clocks[column][2].getDirectionH(), clocks[column][2].getDirectionM());
			clocks[column][3].forceRotation(270, 0, clocks[column][3].getDirectionH(), clocks[column][3].getDirectionM());
			clocks[column][4].forceRotation(180, 270, clocks[column][4].getDirectionH(), clocks[column][4].getDirectionM());
			clocks[column][5].forceRotation(270, 0, clocks[column][5].getDirectionH(), clocks[column][5].getDirectionM());
			clocks[column][6].forceRotation(270, 90, clocks[column][6].getDirectionH(), clocks[column][6].getDirectionM());
			break;
			case 3:
			clocks[column][1].forceRotation(180, 270, clocks[column][1].getDirectionH(), clocks[column][1].getDirectionM());
			clocks[column][2].forceRotation(180, 0, clocks[column][2].getDirectionH(), clocks[column][2].getDirectionM());
			clocks[column][3].forceRotation(180, 0, clocks[column][3].getDirectionH(), clocks[column][3].getDirectionM());
			clocks[column][4].forceRotation(180, 0, clocks[column][4].getDirectionH(), clocks[column][4].getDirectionM());
			clocks[column][5].forceRotation(180, 0, clocks[column][5].getDirectionH(), clocks[column][5].getDirectionM());
			clocks[column][6].forceRotation(270, 0, clocks[column][6].getDirectionH(), clocks[column][6].getDirectionM());
			break;
			}	
		break;

		case 4:
			switch(column%4)
			{
			case 0:
			clocks[column][1].forceRotation(180, 90, clocks[column][1].getDirectionH(), clocks[column][1].getDirectionM());
			clocks[column][2].forceRotation(180, 0, clocks[column][2].getDirectionH(), clocks[column][2].getDirectionM());
			clocks[column][3].forceRotation(180, 0, clocks[column][3].getDirectionH(), clocks[column][3].getDirectionM());
			clocks[column][4].forceRotation(90, 0, clocks[column][4].getDirectionH(), clocks[column][4].getDirectionM());
			clocks[column][5].forceRotation(def, def, clocks[column][5].getDirectionH(), clocks[column][5].getDirectionM());
			clocks[column][6].forceRotation(def, def, clocks[column][6].getDirectionH(), clocks[column][6].getDirectionM());
			break;
			case 1:
			clocks[column][1].forceRotation(180, 270, clocks[column][1].getDirectionH(), clocks[column][1].getDirectionM());
			clocks[column][2].forceRotation(180, 0, clocks[column][2].getDirectionH(), clocks[column][2].getDirectionM());
			clocks[column][3].forceRotation(90, 0, clocks[column][3].getDirectionH(), clocks[column][3].getDirectionM());
			clocks[column][4].forceRotation(270, 90, clocks[column][4].getDirectionH(), clocks[column][4].getDirectionM());
			clocks[column][5].forceRotation(def, def, clocks[column][5].getDirectionH(), clocks[column][5].getDirectionM());
			clocks[column][6].forceRotation(def, def, clocks[column][6].getDirectionH(), clocks[column][6].getDirectionM());	
			break;			
			case 2:
			clocks[column][1].forceRotation(180, 90, clocks[column][1].getDirectionH(), clocks[column][1].getDirectionM());
			clocks[column][2].forceRotation(180, 0, clocks[column][2].getDirectionH(), clocks[column][2].getDirectionM());
			clocks[column][3].forceRotation(270, 0, clocks[column][3].getDirectionH(), clocks[column][3].getDirectionM());
			clocks[column][4].forceRotation(180, 270, clocks[column][4].getDirectionH(), clocks[column][4].getDirectionM());
			clocks[column][5].forceRotation(180, 0, clocks[column][5].getDirectionH(), clocks[column][5].getDirectionM());
			clocks[column][6].forceRotation(90, 0, clocks[column][6].getDirectionH(), clocks[column][6].getDirectionM());
			break;
			case 3:
			clocks[column][1].forceRotation(180, 270, clocks[column][1].getDirectionH(), clocks[column][1].getDirectionM());
			clocks[column][2].forceRotation(180, 0, clocks[column][2].getDirectionH(), clocks[column][2].getDirectionM());
			clocks[column][3].forceRotation(180, 0, clocks[column][3].getDirectionH(), clocks[column][3].getDirectionM());
			clocks[column][4].forceRotation(180, 0, clocks[column][4].getDirectionH(), clocks[column][4].getDirectionM());
			clocks[column][5].forceRotation(180, 0, clocks[column][5].getDirectionH(), clocks[column][5].getDirectionM());
			clocks[column][6].forceRotation(270, 0, clocks[column][6].getDirectionH(), clocks[column][6].getDirectionM());
			break;
			}	
		break;
		case 5:
			switch(column%4)
			{
			case 0:
			clocks[column][1].forceRotation(180, 90, clocks[column][1].getDirectionH(), clocks[column][1].getDirectionM());
			clocks[column][2].forceRotation(180, 0, clocks[column][2].getDirectionH(), clocks[column][2].getDirectionM());
			clocks[column][3].forceRotation(180, 0, clocks[column][3].getDirectionH(), clocks[column][3].getDirectionM());
			clocks[column][4].forceRotation(90, 0, clocks[column][4].getDirectionH(), clocks[column][4].getDirectionM());
			clocks[column][5].forceRotation(180, 90, clocks[column][5].getDirectionH(), clocks[column][5].getDirectionM());
			clocks[column][6].forceRotation(90, 0, clocks[column][6].getDirectionH(), clocks[column][6].getDirectionM());
			break;
			case 1:
			clocks[column][1].forceRotation(270, 90, clocks[column][1].getDirectionH(), clocks[column][1].getDirectionM());
			clocks[column][2].forceRotation(180, 90, clocks[column][2].getDirectionH(), clocks[column][2].getDirectionM());
			clocks[column][3].forceRotation(90, 0, clocks[column][3].getDirectionH(), clocks[column][3].getDirectionM());
			clocks[column][4].forceRotation(270, 90, clocks[column][4].getDirectionH(), clocks[column][4].getDirectionM());
			clocks[column][5].forceRotation(270, 90, clocks[column][5].getDirectionH(), clocks[column][5].getDirectionM());
			clocks[column][6].forceRotation(270, 90, clocks[column][6].getDirectionH(), clocks[column][6].getDirectionM());	
			break;
			case 2:
			clocks[column][1].forceRotation(270, 90, clocks[column][1].getDirectionH(), clocks[column][1].getDirectionM());
			clocks[column][2].forceRotation(270, 90, clocks[column][2].getDirectionH(), clocks[column][2].getDirectionM());
			clocks[column][3].forceRotation(270, 90, clocks[column][3].getDirectionH(), clocks[column][3].getDirectionM());
			clocks[column][4].forceRotation(180, 270, clocks[column][4].getDirectionH(), clocks[column][4].getDirectionM());
			clocks[column][5].forceRotation(270, 0, clocks[column][5].getDirectionH(), clocks[column][5].getDirectionM());
			clocks[column][6].forceRotation(270, 90, clocks[column][6].getDirectionH(), clocks[column][6].getDirectionM());
			break;
			case 3:
			clocks[column][1].forceRotation(180, 270, clocks[column][1].getDirectionH(), clocks[column][1].getDirectionM());
			clocks[column][2].forceRotation(270, 0, clocks[column][2].getDirectionH(), clocks[column][2].getDirectionM());
			clocks[column][3].forceRotation(180, 270, clocks[column][3].getDirectionH(), clocks[column][3].getDirectionM());
			clocks[column][4].forceRotation(180, 0, clocks[column][4].getDirectionH(), clocks[column][4].getDirectionM());
			clocks[column][5].forceRotation(180, 0, clocks[column][5].getDirectionH(), clocks[column][5].getDirectionM());
			clocks[column][6].forceRotation(270, 0, clocks[column][6].getDirectionH(), clocks[column][6].getDirectionM());
			break;
			}	
		break;
		case 6:
			switch(column%4)
			{
			case 0:
			clocks[column][1].forceRotation(180, 90, clocks[column][1].getDirectionH(), clocks[column][1].getDirectionM());
			clocks[column][2].forceRotation(180, 0, clocks[column][2].getDirectionH(), clocks[column][2].getDirectionM());
			clocks[column][3].forceRotation(180, 0, clocks[column][3].getDirectionH(), clocks[column][3].getDirectionM());
			clocks[column][4].forceRotation(180, 0, clocks[column][4].getDirectionH(), clocks[column][4].getDirectionM());
			clocks[column][5].forceRotation(180, 0, clocks[column][5].getDirectionH(), clocks[column][5].getDirectionM());
			clocks[column][6].forceRotation(90, 0, clocks[column][6].getDirectionH(), clocks[column][6].getDirectionM());
			break;
			case 1:
			clocks[column][1].forceRotation(270, 90, clocks[column][1].getDirectionH(), clocks[column][1].getDirectionM());
			clocks[column][2].forceRotation(180, 90, clocks[column][2].getDirectionH(), clocks[column][2].getDirectionM());
			clocks[column][3].forceRotation(90, 0, clocks[column][3].getDirectionH(), clocks[column][3].getDirectionM());
			clocks[column][4].forceRotation(180, 90, clocks[column][4].getDirectionH(), clocks[column][4].getDirectionM());
			clocks[column][5].forceRotation(90, 0, clocks[column][5].getDirectionH(), clocks[column][5].getDirectionM());
			clocks[column][6].forceRotation(270, 90, clocks[column][6].getDirectionH(), clocks[column][6].getDirectionM());	
			break;
			case 2:
			clocks[column][1].forceRotation(270, 90, clocks[column][1].getDirectionH(), clocks[column][1].getDirectionM());
			clocks[column][2].forceRotation(270, 90, clocks[column][2].getDirectionH(), clocks[column][2].getDirectionM());
			clocks[column][3].forceRotation(270, 90, clocks[column][3].getDirectionH(), clocks[column][3].getDirectionM());
			clocks[column][4].forceRotation(180, 270, clocks[column][4].getDirectionH(), clocks[column][4].getDirectionM());
			clocks[column][5].forceRotation(270, 0, clocks[column][5].getDirectionH(), clocks[column][5].getDirectionM());
			clocks[column][6].forceRotation(270, 90, clocks[column][6].getDirectionH(), clocks[column][6].getDirectionM());
			break;
			case 3:
			clocks[column][1].forceRotation(180, 270, clocks[column][1].getDirectionH(), clocks[column][1].getDirectionM());
			clocks[column][2].forceRotation(270, 0, clocks[column][2].getDirectionH(), clocks[column][2].getDirectionM());
			clocks[column][3].forceRotation(180, 270, clocks[column][3].getDirectionH(), clocks[column][3].getDirectionM());
			clocks[column][4].forceRotation(180, 0, clocks[column][4].getDirectionH(), clocks[column][4].getDirectionM());
			clocks[column][5].forceRotation(180, 0, clocks[column][5].getDirectionH(), clocks[column][5].getDirectionM());
			clocks[column][6].forceRotation(270, 0, clocks[column][6].getDirectionH(), clocks[column][6].getDirectionM());
			break;
			}
		break;
		case 7:
			switch(column%4)
			{
			case 0:
			clocks[column][1].forceRotation(180, 90, clocks[column][1].getDirectionH(), clocks[column][1].getDirectionM());
			clocks[column][2].forceRotation(90, 0, clocks[column][2].getDirectionH(), clocks[column][2].getDirectionM());
			clocks[column][3].forceRotation(def, def, clocks[column][3].getDirectionH(), clocks[column][3].getDirectionM());
			clocks[column][4].forceRotation(def, def, clocks[column][4].getDirectionH(), clocks[column][4].getDirectionM());
			clocks[column][5].forceRotation(def, def, clocks[column][5].getDirectionH(), clocks[column][5].getDirectionM());
			clocks[column][6].forceRotation(def, def, clocks[column][6].getDirectionH(), clocks[column][6].getDirectionM());
			break;
			case 1:
			clocks[column][1].forceRotation(270, 90, clocks[column][1].getDirectionH(), clocks[column][1].getDirectionM());
			clocks[column][2].forceRotation(270, 90, clocks[column][2].getDirectionH(), clocks[column][2].getDirectionM());
			clocks[column][3].forceRotation(def, def, clocks[column][3].getDirectionH(), clocks[column][3].getDirectionM());
			clocks[column][4].forceRotation(def, def, clocks[column][4].getDirectionH(), clocks[column][4].getDirectionM());
			clocks[column][5].forceRotation(def, def, clocks[column][5].getDirectionH(), clocks[column][5].getDirectionM());
			clocks[column][6].forceRotation(def, def, clocks[column][6].getDirectionH(), clocks[column][6].getDirectionM());	
			break;
			case 2:
			clocks[column][1].forceRotation(270, 90, clocks[column][1].getDirectionH(), clocks[column][1].getDirectionM());
			clocks[column][2].forceRotation(180, 270, clocks[column][2].getDirectionH(), clocks[column][2].getDirectionM());
			clocks[column][3].forceRotation(180, 0, clocks[column][3].getDirectionH(), clocks[column][3].getDirectionM());
			clocks[column][4].forceRotation(180, 0, clocks[column][4].getDirectionH(), clocks[column][4].getDirectionM());
			clocks[column][5].forceRotation(180, 0, clocks[column][5].getDirectionH(), clocks[column][5].getDirectionM());
			clocks[column][6].forceRotation(90, 0, clocks[column][6].getDirectionH(), clocks[column][6].getDirectionM());
			break;
			case 3:
			clocks[column][1].forceRotation(180, 270, clocks[column][1].getDirectionH(), clocks[column][1].getDirectionM());
			clocks[column][2].forceRotation(180, 0, clocks[column][2].getDirectionH(), clocks[column][2].getDirectionM());
			clocks[column][3].forceRotation(180, 0, clocks[column][3].getDirectionH(), clocks[column][3].getDirectionM());
			clocks[column][4].forceRotation(180, 0, clocks[column][4].getDirectionH(), clocks[column][4].getDirectionM());
			clocks[column][5].forceRotation(180, 0, clocks[column][5].getDirectionH(), clocks[column][5].getDirectionM());
			clocks[column][6].forceRotation(270, 0, clocks[column][6].getDirectionH(), clocks[column][6].getDirectionM());
			break;
			}
		break;
		case 8:
			switch(column%4)
			{
			case 0:
			clocks[column][1].forceRotation(180, 90, clocks[column][1].getDirectionH(), clocks[column][1].getDirectionM());
			clocks[column][2].forceRotation(180, 0, clocks[column][2].getDirectionH(), clocks[column][2].getDirectionM());
			clocks[column][3].forceRotation(180, 0, clocks[column][3].getDirectionH(), clocks[column][3].getDirectionM());
			clocks[column][4].forceRotation(180, 0, clocks[column][4].getDirectionH(), clocks[column][4].getDirectionM());
			clocks[column][5].forceRotation(180, 0, clocks[column][5].getDirectionH(), clocks[column][5].getDirectionM());
			clocks[column][6].forceRotation(90, 0, clocks[column][6].getDirectionH(), clocks[column][6].getDirectionM());
			break;
			case 1:
			clocks[column][1].forceRotation(270, 90, clocks[column][1].getDirectionH(), clocks[column][1].getDirectionM());
			clocks[column][2].forceRotation(180, 90, clocks[column][2].getDirectionH(), clocks[column][2].getDirectionM());
			clocks[column][3].forceRotation(90, 0, clocks[column][3].getDirectionH(), clocks[column][3].getDirectionM());
			clocks[column][4].forceRotation(180, 90, clocks[column][4].getDirectionH(), clocks[column][4].getDirectionM());
			clocks[column][5].forceRotation(90, 0, clocks[column][5].getDirectionH(), clocks[column][5].getDirectionM());
			clocks[column][6].forceRotation(270, 90, clocks[column][6].getDirectionH(), clocks[column][6].getDirectionM());	
			break;
			case 2:
			clocks[column][1].forceRotation(270, 90, clocks[column][1].getDirectionH(), clocks[column][1].getDirectionM());
			clocks[column][2].forceRotation(180, 270, clocks[column][2].getDirectionH(), clocks[column][2].getDirectionM());
			clocks[column][3].forceRotation(270, 0, clocks[column][3].getDirectionH(), clocks[column][3].getDirectionM());
			clocks[column][4].forceRotation(180, 270, clocks[column][4].getDirectionH(), clocks[column][4].getDirectionM());
			clocks[column][5].forceRotation(270, 0, clocks[column][5].getDirectionH(), clocks[column][5].getDirectionM());
			clocks[column][6].forceRotation(270, 90, clocks[column][6].getDirectionH(), clocks[column][6].getDirectionM());
			break;
			case 3:
			clocks[column][1].forceRotation(180, 270, clocks[column][1].getDirectionH(), clocks[column][1].getDirectionM());
			clocks[column][2].forceRotation(180, 0, clocks[column][2].getDirectionH(), clocks[column][2].getDirectionM());
			clocks[column][3].forceRotation(180, 0, clocks[column][3].getDirectionH(), clocks[column][3].getDirectionM());
			clocks[column][4].forceRotation(180, 0, clocks[column][4].getDirectionH(), clocks[column][4].getDirectionM());
			clocks[column][5].forceRotation(180, 0, clocks[column][5].getDirectionH(), clocks[column][5].getDirectionM());
			clocks[column][6].forceRotation(270, 0, clocks[column][6].getDirectionH(), clocks[column][6].getDirectionM());
			break;
			}
		break;
		case 9:
			switch(column%4)
			{
			case 0:
			clocks[column][1].forceRotation(180, 90, clocks[column][1].getDirectionH(), clocks[column][1].getDirectionM());
			clocks[column][2].forceRotation(180, 0, clocks[column][2].getDirectionH(), clocks[column][2].getDirectionM());
			clocks[column][3].forceRotation(180, 0, clocks[column][3].getDirectionH(), clocks[column][3].getDirectionM());
			clocks[column][4].forceRotation(90, 0, clocks[column][4].getDirectionH(), clocks[column][4].getDirectionM());
			clocks[column][5].forceRotation(180, 90, clocks[column][5].getDirectionH(), clocks[column][5].getDirectionM());
			clocks[column][6].forceRotation(90, 0, clocks[column][6].getDirectionH(), clocks[column][6].getDirectionM());
			break;
			case 1:
			clocks[column][1].forceRotation(270, 90, clocks[column][1].getDirectionH(), clocks[column][1].getDirectionM());
			clocks[column][2].forceRotation(180, 90, clocks[column][2].getDirectionH(), clocks[column][2].getDirectionM());
			clocks[column][3].forceRotation(90, 0, clocks[column][3].getDirectionH(), clocks[column][3].getDirectionM());
			clocks[column][4].forceRotation(270, 90, clocks[column][4].getDirectionH(), clocks[column][4].getDirectionM());
			clocks[column][5].forceRotation(270, 90, clocks[column][5].getDirectionH(), clocks[column][5].getDirectionM());
			clocks[column][6].forceRotation(270, 90, clocks[column][6].getDirectionH(), clocks[column][6].getDirectionM());	
			break;
			case 2:
			clocks[column][1].forceRotation(270, 90, clocks[column][1].getDirectionH(), clocks[column][1].getDirectionM());
			clocks[column][2].forceRotation(180, 270, clocks[column][2].getDirectionH(), clocks[column][2].getDirectionM());
			clocks[column][3].forceRotation(270, 0, clocks[column][3].getDirectionH(), clocks[column][3].getDirectionM());
			clocks[column][4].forceRotation(180, 270, clocks[column][4].getDirectionH(), clocks[column][4].getDirectionM());
			clocks[column][5].forceRotation(270, 0, clocks[column][5].getDirectionH(), clocks[column][5].getDirectionM());
			clocks[column][6].forceRotation(270, 90, clocks[column][6].getDirectionH(), clocks[column][6].getDirectionM());
			break;
			case 3:
			clocks[column][1].forceRotation(180, 270, clocks[column][1].getDirectionH(), clocks[column][1].getDirectionM());
			clocks[column][2].forceRotation(180, 0, clocks[column][2].getDirectionH(), clocks[column][2].getDirectionM());
			clocks[column][3].forceRotation(180, 0, clocks[column][3].getDirectionH(), clocks[column][3].getDirectionM());
			clocks[column][4].forceRotation(180, 0, clocks[column][4].getDirectionH(), clocks[column][4].getDirectionM());
			clocks[column][5].forceRotation(180, 0, clocks[column][5].getDirectionH(), clocks[column][5].getDirectionM());
			clocks[column][6].forceRotation(270, 0, clocks[column][6].getDirectionH(), clocks[column][6].getDirectionM());
			break;
			}
		break;
		case 0:
			switch(column%4)
			{
			case 0:
			clocks[column][1].forceRotation(180, 90, clocks[column][1].getDirectionH(), clocks[column][1].getDirectionM());
			clocks[column][2].forceRotation(180, 0, clocks[column][2].getDirectionH(), clocks[column][2].getDirectionM());
			clocks[column][3].forceRotation(180, 0, clocks[column][3].getDirectionH(), clocks[column][3].getDirectionM());
			clocks[column][4].forceRotation(180, 0, clocks[column][4].getDirectionH(), clocks[column][4].getDirectionM());
			clocks[column][5].forceRotation(180, 0, clocks[column][5].getDirectionH(), clocks[column][5].getDirectionM());
			clocks[column][6].forceRotation(90, 0, clocks[column][6].getDirectionH(), clocks[column][6].getDirectionM());
			break;
			case 1:
			clocks[column][1].forceRotation(270, 90, clocks[column][1].getDirectionH(), clocks[column][1].getDirectionM());
			clocks[column][2].forceRotation(180, 90, clocks[column][2].getDirectionH(), clocks[column][2].getDirectionM());
			clocks[column][3].forceRotation(180, 0, clocks[column][3].getDirectionH(), clocks[column][3].getDirectionM());
			clocks[column][4].forceRotation(180, 0, clocks[column][4].getDirectionH(), clocks[column][4].getDirectionM());
			clocks[column][5].forceRotation(90, 0, clocks[column][5].getDirectionH(), clocks[column][5].getDirectionM());
			clocks[column][6].forceRotation(270, 90, clocks[column][6].getDirectionH(), clocks[column][6].getDirectionM());	
			break;
			case 2:
			clocks[column][1].forceRotation(270, 90, clocks[column][1].getDirectionH(), clocks[column][1].getDirectionM());
			clocks[column][2].forceRotation(180, 270, clocks[column][2].getDirectionH(), clocks[column][2].getDirectionM());
			clocks[column][3].forceRotation(180, 0, clocks[column][3].getDirectionH(), clocks[column][3].getDirectionM());
			clocks[column][4].forceRotation(180, 0, clocks[column][4].getDirectionH(), clocks[column][4].getDirectionM());
			clocks[column][5].forceRotation(270, 0, clocks[column][5].getDirectionH(), clocks[column][5].getDirectionM());
			clocks[column][6].forceRotation(270, 90, clocks[column][6].getDirectionH(), clocks[column][6].getDirectionM());
			break;
			case 3:
			clocks[column][1].forceRotation(180, 270, clocks[column][1].getDirectionH(), clocks[column][1].getDirectionM());
			clocks[column][2].forceRotation(180, 0, clocks[column][2].getDirectionH(), clocks[column][2].getDirectionM());
			clocks[column][3].forceRotation(180, 0, clocks[column][3].getDirectionH(), clocks[column][3].getDirectionM());
			clocks[column][4].forceRotation(180, 0, clocks[column][4].getDirectionH(), clocks[column][4].getDirectionM());
			clocks[column][5].forceRotation(180, 0, clocks[column][5].getDirectionH(), clocks[column][5].getDirectionM());
			clocks[column][6].forceRotation(270, 0, clocks[column][6].getDirectionH(), clocks[column][6].getDirectionM());
			break;
			}
		break;
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
			// new t
			// left
			clocks[startx][starty].setPointerDegree(270, 90);
			clocks[startx][starty + 1].setPointerDegree(180, 0);
			clocks[startx][starty + 2].setPointerDegree(0, 0);
			// right
			clocks[startx + 1][starty].setPointerDegree(270, 270);
			clocks[startx + 1][starty + 1].setPointerDegree(def, def);
			clocks[startx + 1][starty + 2].setPointerDegree(def, def);
			break;
			/*
			 * // left clocks[startx][starty].setPointerDegree(180, 180);
			 * clocks[startx][starty + 1].setPointerDegree(90, 0);
			 * clocks[startx][starty + 2].setPointerDegree(90, 0); // right
			 * clocks[startx + 1][starty].setPointerDegree(def, def);
			 * clocks[startx + 1][starty + 1].setPointerDegree(def, def);
			 * clocks[startx + 1][starty + 2].setPointerDegree(270, 270); break;
			 */
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
		// dichter nebel, schwacher dunst, leichter nebel
		// TODO implement pointer position
		switch (weather) {
		case "dichter nebel":
		case "schwacher dunst":
		case "leichter nebel":
			break;
		case "teils wolkig":
		case "bedeckt":
		case "wolkig":
			drawcloud(startx, starty, clocks);
			break;
		case "leichte regenschauer":
		case "leichter regen":
		case "leichtes nieseln":
		case "regen":
			drawcloud(startx, starty, clocks);
			drawrain(startx, starty, clocks);
			break;
		case "gewitter":
			drawcloud(startx, starty, clocks);
			drawrain(startx, starty, clocks);
			drawlightning(startx, starty, clocks);
			break;
		case "heiter":
		case "sonne":
			startanimation1(clocks[0].length, clocks.length,clocks);
			drawsun(startx, starty, clocks);
			break;
		default:
			setdefault(clocks);
			break;
		}
	}
	public void drawKMH(int startx, int starty, Clock[][] clocks)
	{
		displayCharacter('k', startx, starty-1, clocks);
		clocks[startx][starty+5].setPointerDegree(45, 45);
		displayCharacter('m', startx+2, starty-1, clocks);
		clocks[startx+1][starty+4].setPointerDegree(225, 45);
		clocks[startx+2][starty+3].setPointerDegree(225, 45);
		clocks[startx+3][starty+2].setPointerDegree(225, 225);
		displayCharacter('h', startx+2, starty+4, clocks);
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
	
	public void startanimation2(int rows, int columns, Clock[][] clocks)
	{
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				clocks[j][i].setPointerDegree(270, 90);
			}
		}
	}
	
	public void startanimation3(int rows, int columns, Clock[][] clocks)
	{
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < columns; j++)
			{
				if(i == 2)
				{
					if(j%2 == 0)
					{
						clocks[j][i].setPointerDegree(135, 90);
					}
					else
					{
						clocks[j][i].setPointerDegree(135, 270);
					}
				}
				else if(i == 3)
				{
					clocks[j][i].setPointerDegree(135, 315);
				}
				else if(i == 4)
				{
					clocks[j][i].setPointerDegree(225, 315);
				}
				else if(i == 5)
				{
					clocks[j][i].setPointerDegree(225, 45);
				}
				else if(i == 6)
				{
					if(j%2 == 0)
					{
						clocks[j][i].setPointerDegree(90, 45);
					}
					else
					{
						clocks[j][i].setPointerDegree(270, 45);
					}
				}
			}
		}
	}
	public void animation3(int rows, int columns, Clock[][] clocks, ReworkedPanel panel)
	{
		for(int x = 0; x < 100; x++)
		{
			for(int j = 0; j < columns; j++)
			{
				if(j%2 == 0)
				{
					clocks[j][2].setPointerDegree(135, 270);
				}
				else
				{
					clocks[j][2].setPointerDegree(135, 90);
				}
			}
			for(int j = 0; j < columns; j++)
			{
				if(j%2 == 0)
				{
					clocks[j][6].setPointerDegree(270, 45);
				}
				else
				{
					clocks[j][6].setPointerDegree(90, 45);
				}
			}
			
			panel.letClocksTick(500);
			for(int j = 0; j < columns; j++)
			{
				if(j%2 == 0)
				{
					clocks[j][2].setPointerDegree(135, 90);
				}
				else
				{
					clocks[j][2].setPointerDegree(135, 270);
				}
			}
			for(int j = 0; j < columns; j++)
			{
				if(j%2 == 0)
				{
					clocks[j][6].setPointerDegree(90, 45);
				}
				else
				{
					clocks[j][6].setPointerDegree(270, 45);
				}
			}
			panel.letClocksTick(500);
		}
	}
	public void rotateClocks(int rows, int columns, Clock[][] clocks)
	{
		for(int j = 0; j < columns; j++)
		{
			for (int i = 0; i < rows; i++)
			{
				clocks[j][i].rotateForMoreThan360Degrees(720, 720, true, true);
			}
			try
			{
				Thread.sleep(200);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
	}
	public void rotateClockCounter(int rows, int columns, Clock[][] clocks)
	{
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (i < (rows / 2)) {
					if (j < (columns / 2)) {
						// top left
						clocks[j][i].forceRotation(720, 720, true, false);
					} else {
						// top right
						clocks[j][i].forceRotation(720, 720, true, false);
					}
				} else {
					if (j < (columns / 2)) {
						// bottom left
						clocks[j][i].forceRotation(720, 720, true, false);
					} else {
						// bottom right
						clocks[j][i].forceRotation(720, 720, true, false);
					}
				}
			}
		}
	}
	
	//only implemented for clockpanel size 16x8
	public void startanimation4(int rows, int columns, Clock[][] clocks)
	{
		int y = 20;
		//ring#1
		clocks[7][3].setPointerDegree(def-y, 45+y);
		clocks[7][4].setPointerDegree(135-y, 315+y);
		clocks[8][3].setPointerDegree(315-y, 135+y);
		clocks[8][4].setPointerDegree(45-y, def+y);
		
		//ring#2
		
		clocks[6][3].setPointerDegree(180, 45);
		clocks[6][4].setPointerDegree(135, 0);
		clocks[7][2].setPointerDegree(def, 90);
		clocks[7][5].setPointerDegree(90, 315);
		clocks[8][2].setPointerDegree(270, 135);
		clocks[8][5].setPointerDegree(45, 270);
		clocks[9][3].setPointerDegree(315, 180);
		clocks[9][4].setPointerDegree(0, def);
		//ring#3
		
		clocks[6][2].setPointerDegree(def-y,  45+y);
		clocks[6][5].setPointerDegree(135-y,  315+y);
		clocks[9][2].setPointerDegree(315-y, 135+y);
		clocks[9][5].setPointerDegree(45-y, def+y);
		//ring#4
		
		clocks[5][3].setPointerDegree(180, 45-y/2);
		clocks[5][4].setPointerDegree(135+y/2, 0);
		clocks[7][1].setPointerDegree(def+y/2, 90);
		clocks[7][6].setPointerDegree(90, 315-y/2);
		clocks[8][1].setPointerDegree(270, 135-y/2);
		clocks[8][6].setPointerDegree(45+y/2, 270);
		clocks[10][3].setPointerDegree(315+y/2, 180);
		clocks[10][4].setPointerDegree(0, def-y/2);
		
		
		//ring#5
		clocks[5][2].setPointerDegree(225-y, 45);
		clocks[5][5].setPointerDegree(135, 315+y);
		clocks[6][1].setPointerDegree(def, 45+y);
		clocks[6][6].setPointerDegree(135-y, 315);
		clocks[9][1].setPointerDegree(315-y, 135);
		clocks[9][6].setPointerDegree(45, 225+y);
		clocks[10][2].setPointerDegree(315, 135+y);
		clocks[10][5].setPointerDegree(45-y, def);
		//ring#6
		clocks[4][3].setPointerDegree(180, 45-y);
		clocks[4][4].setPointerDegree(135+y, 0);
		clocks[7][0].setPointerDegree(225+y, 90);
		clocks[7][7].setPointerDegree(90, 315-y);
		clocks[8][0].setPointerDegree(270, 135-y);
		clocks[8][7].setPointerDegree(45+y, 270);
		clocks[11][3].setPointerDegree(315+y, 180);
		clocks[11][4].setPointerDegree(0, 225-y);
		clocks[5][1].setPointerDegree(def-y, 45+y);
		clocks[5][6].setPointerDegree(135-y, 315+y);
		clocks[10][1].setPointerDegree(315-y, 135+y);
		clocks[10][6].setPointerDegree(45-y, def+y);
		
		//ring#7
		clocks[6][7].setPointerDegree(135-y, 315);
		clocks[9][7].setPointerDegree(45, 225+y);
		clocks[11][5].setPointerDegree(45-y, def);
		clocks[11][2].setPointerDegree(315, 135+y);
		clocks[6][0].setPointerDegree(def, 45+y);
		clocks[9][0].setPointerDegree(315-y, 135);
		clocks[4][5].setPointerDegree(135, 315+y);
		clocks[4][2].setPointerDegree(225-y, 45);
		
		//ring#8
		clocks[5][7].setPointerDegree(135-y, 315);
		clocks[4][6].setPointerDegree(135, 315+y);
		clocks[3][3].setPointerDegree(180, 45-y);
		clocks[3][4].setPointerDegree(135+y, 0);
		clocks[4][1].setPointerDegree(225-y, 45);
		clocks[5][0].setPointerDegree(def, 45+y);
		clocks[10][7].setPointerDegree(45, 225+y);
		clocks[11][6].setPointerDegree(45-y, def);
		clocks[12][4].setPointerDegree(0, 225-y);
		clocks[12][3].setPointerDegree(315+y, 180);
		clocks[11][1].setPointerDegree(315, 135+y);
		clocks[10][0].setPointerDegree(315-y, 135);
		
		//ring#9
		clocks[11][0].setPointerDegree(305, 145);
		clocks[12][2].setPointerDegree(335, 165);
		clocks[12][5].setPointerDegree(15, 205);
		clocks[11][7].setPointerDegree(35, 235);
		clocks[4][7].setPointerDegree(125, 325);
		clocks[3][5].setPointerDegree(155, 345);
		clocks[3][2].setPointerDegree(195, 25);
		clocks[4][0].setPointerDegree(215, 55);
	} 

	public void animation4(int rows, int columns, Clock[][] clocks, ReworkedPanel panel)
	{
		// TODO Auto-generated method stub
		int degree = 2160;
		int duration = 300;
		clocks[1][1].rotateForMoreThan360Degrees(360, 360, true, true);
		
		clocks[7][3].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[7][4].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[8][3].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[8][4].rotateForMoreThan360Degrees(degree, degree, true, false);
		
		panel.letClocksTick(duration/10);
		
		clocks[6][3].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[6][4].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[7][2].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[7][5].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[8][2].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[8][5].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[9][3].rotateForMoreThan360Degrees(degree, degree, true, false);
		
		clocks[9][4].rotateForMoreThan360Degrees(degree, degree, true, false);
		
		panel.letClocksTick(duration/10);
		clocks[6][2].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[6][5].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[9][2].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[9][5].rotateForMoreThan360Degrees(degree, degree, true, false);
		
		panel.letClocksTick(duration/10);
		
		clocks[5][3].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[5][4].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[7][1].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[7][6].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[8][1].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[8][6].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[10][3].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[10][4].rotateForMoreThan360Degrees(degree, degree, true, false);
		
		panel.letClocksTick(duration/10);
		
		clocks[5][2].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[5][5].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[6][1].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[6][6].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[9][1].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[9][6].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[10][2].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[10][5].rotateForMoreThan360Degrees(degree, degree, true, false);
		
		panel.letClocksTick(duration/10);
		
		clocks[4][3].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[4][4].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[7][0].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[7][7].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[8][0].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[8][7].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[11][3].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[11][4].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[5][1].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[5][6].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[10][1].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[10][6].rotateForMoreThan360Degrees(degree, degree, true, false);
		
		panel.letClocksTick(duration/10);
		
		clocks[6][7].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[9][7].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[11][5].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[11][2].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[6][0].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[9][0].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[4][5].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[4][2].rotateForMoreThan360Degrees(degree, degree, true, false);
		
		panel.letClocksTick(duration/10);
		
		clocks[5][7].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[4][6].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[3][3].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[3][4].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[4][1].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[5][0].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[10][7].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[11][6].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[12][4].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[12][3].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[11][1].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[10][0].rotateForMoreThan360Degrees(degree, degree, true, false);
		
		panel.letClocksTick(duration/10);
		
		clocks[11][0].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[12][2].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[12][5].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[11][7].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[4][7].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[3][5].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[3][2].rotateForMoreThan360Degrees(degree, degree, true, false);
		clocks[4][0].rotateForMoreThan360Degrees(degree, degree, true, false);
	}
}
