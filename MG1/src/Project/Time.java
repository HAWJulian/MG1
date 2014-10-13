package Project;
import java.text.SimpleDateFormat;
import java.util.*;

public class Time extends TimerTask{
	Scanner scan = new Scanner(System.in);
	int hours;
	int minutes;
	int seconds;
	int refhours;
	int refminutes;
	int refseconds;
	
	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	
	public void getCurrentTime()
	{
		Calendar cal = Calendar.getInstance();
		String currentTime = sdf.format(cal.getTime());
		System.out.println(currentTime);
		hours = Integer.parseInt(("" + currentTime.charAt(0) + "" + currentTime.charAt(1)));
		System.out.println(hours);
		minutes = Integer.parseInt(("" + currentTime.charAt(3) + "" + currentTime.charAt(4)));
		System.out.println(minutes);
		seconds = Integer.parseInt(("" + currentTime.charAt(6) + "" + currentTime.charAt(7)));
		System.out.println(seconds);	
	}
	
	private boolean refreshTime()
	{
		Calendar cal2 = Calendar.getInstance();
		String refTime = sdf.format(cal2.getTime());
		System.out.println(refTime);
		refhours = Integer.parseInt(("" + refTime.charAt(0) + "" + refTime.charAt(1)));
		refminutes = Integer.parseInt(("" + refTime.charAt(3) + "" + refTime.charAt(4)));
		refseconds = Integer.parseInt(("" + refTime.charAt(6) + "" + refTime.charAt(7)));
		System.out.println(refhours);
		System.out.println(refminutes);
		System.out.println(refseconds);
		if(refminutes != minutes)
		{
			hours = refhours;
			minutes = refminutes;
			//System.out.println("time refreshed");
			return true;
		}
		return false;
	}

	@Override
	public void run() 
	{
		//if refreshTime -> anzeige aktualisieren (todo)
		if(refreshTime())
		{
			System.out.println("minutes and/or hours changed");
		}
	}
}
