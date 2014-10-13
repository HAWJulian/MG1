package Project;
import java.text.SimpleDateFormat;
import java.util.*;

public class Time extends TimerTask{
	Scanner scan = new Scanner(System.in);
	int hours0;
	int hours1;
	int minutes0;
	int minutes1;
	int seconds;
	
	int refhours0;
	int refhours1;
	int refminutes0;
	int refminutes1;
	int refseconds;
	
	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	
	public Time()
	{
		getCurrentTime();
	}
	
	public void getCurrentTime()
	{
		Calendar cal = Calendar.getInstance();
		String currentTime = sdf.format(cal.getTime());
		System.out.println(currentTime);
		hours0 = Integer.parseInt(("" + currentTime.charAt(0)));
		hours1 = Integer.parseInt(("" + currentTime.charAt(1)));
		System.out.println(hours0 + "" + hours1);
		minutes0 = Integer.parseInt(("" + currentTime.charAt(3)));
		minutes1 = Integer.parseInt(("" + currentTime.charAt(4)));
		System.out.println(minutes0 + "" + minutes1);
		seconds = Integer.parseInt(("" + currentTime.charAt(6) + "" + currentTime.charAt(7)));
		System.out.println(seconds);	
	}
	
	public boolean refreshTime()
	{
		Calendar cal2 = Calendar.getInstance();
		String refTime = sdf.format(cal2.getTime());
		//System.out.println(refTime);
		refhours0 = Integer.parseInt(("" + refTime.charAt(0)));
		refhours1 = Integer.parseInt(("" + refTime.charAt(1)));
		refminutes0 = Integer.parseInt(("" + refTime.charAt(3)));
		refminutes1 = Integer.parseInt(("" + refTime.charAt(4)));
		refseconds = Integer.parseInt(("" + refTime.charAt(6) + "" + refTime.charAt(7)));
		/*
		System.out.println(refhours0);
		System.out.println(refhours1);
		System.out.println(refminutes0);
		System.out.println(refminutes1);
		*/
		//System.out.println(refseconds);
		if(refminutes1 != minutes1)
		{
			hours0 = refhours0;
			hours1 = refhours1;
			minutes0 = refminutes0;
			minutes1 = refminutes1;
			//System.out.println("time refreshed");
			return true;
		}
		return false;
	}
	
	public int getHours0()
	{
		return hours0;
	}
	public int getHours1()
	{
		return hours1;
	}
	public int getMinutes0()
	{
		return minutes0;
	}
	public int getMinutes1()
	{
		return minutes1;
	}
	@Override
	public void run() 
	{
		//if refreshTime -> anzeige aktualisieren (todo)
		if(refreshTime())
		{
			//System.out.println("minutes and/or hours changed");
		}
	}
}
