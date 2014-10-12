package Project;

import gui.ClockPanel;

public class Values 
{
	//default value (bottom left)
	static float def = 225f;
	public void displayCharacter(char x, int startx, int starty, ClockPanel[][] clocks)
	{
		//Ziffer 1
		//left
		clocks[startx][starty].setTargetDegreeH(def);
		clocks[startx][starty].setTargetDegreeM(def);
		clocks[startx][starty+1].setTargetDegreeH(def);
		clocks[startx][starty+1].setTargetDegreeM(def);
		clocks[startx][starty+2].setTargetDegreeH(def);
		clocks[startx][starty+2].setTargetDegreeM(def);
		//right
		clocks[startx+1][starty].setTargetDegreeH(180);
		clocks[startx+1][starty].setTargetDegreeM(180);
		clocks[startx+1][starty+1].setTargetDegreeH(180);
		clocks[startx+1][starty+1].setTargetDegreeM(0);
		clocks[startx+1][starty+2].setTargetDegreeH(0);
		clocks[startx+1][starty+2].setTargetDegreeM(0);
	}
	
	//Ziffer 2
	//Ziffer 3
	//Ziffer 4
	//Ziffer 5
	//Ziffer 6
	//Ziffer 7
	//Ziffer 8
	//Ziffer 9
	//Ziffer 0
}
