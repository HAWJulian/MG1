package gui_2;

public class PresentationEvent {

	private int duration;
	private char selector;
	private int columns;
	private int rows;
	private int diameter;
	
	//Events while the presentation is running
	public PresentationEvent(int duration, char selector)
	{
		this.duration = duration;
		this.selector = selector;
	}
	
	public PresentationEvent(int rows, int columns, int diameter)
	{
		this.rows = rows;
		this.columns = columns;
		this.diameter = diameter;
	}
	
	public int getDuration()
	{
		return this.duration;
	}
	
	public char getSelector()
	{
		return selector;
	}
	
	public int getColumns()
	{
		return columns;
	}
	
	public int getRows()
	{
		return rows;
	}
	
	public int getDiameter()
	{
		return diameter;
	}
	
}
