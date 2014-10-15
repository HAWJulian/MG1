package Project;

import java.io.*;
import java.net.*;
import java.util.*;
import java.text.*;

//Test
public class Weather {
	// weather api allows up to 300 calls/day
	// with holding a variable which counts down from 300
	// and substracts 1 per call we keep track of the remaining calls
	// we can do.
	// IMPORTANT! insert counter--; after every url call on api
	static int counter = 300;
	// current weather variables
	String weather = "";
	String city = "";
	String country = "";
	String temp = "";
	String calltime = "";
	String humidity = "";
	String winddir = "";
	String winddegrees = "";
	String windspeed = "";
	// current date as string and date
	String currentTime = "";
	Date currentDate;

	public String getWeather() {
		return weather;
	}

	public String getTemp() {
		return temp;
	}

	public String getHumidity() {
		return humidity;
	}

	public String getWinddir() {
		return winddir;
	}

	public String getWinddegrees() {
		return winddegrees;
	}

	public String getWindspeed() {
		return windspeed;
	}

	public static void main(String[] args) {
		// Weather w = new Weather();
		// test call
		 //w.currentWeather("Hamburg");
	}

	public void currentWeather(String citychoice) {
		Calendar cal = Calendar.getInstance();
		currentTime = cal.getTime().toString();
		currentDate = cal.getTime();
		System.out.println(currentTime);
		// TODO: if all calls on this day are used throw error
		if (counter == 0) {
			return;
		} else {
			// throw error if connection was not possibru
			try {
				// api url;
				// wunderground/api/<key>/<what>(currentweather)/<language>(german)/q/<location>(hamburg).<responseformat>(xml/json)
				String uri = "http://api.wunderground.com/api/5648c04dcac0d5db/conditions/lang:DL/q/Germany/"
						+ citychoice + ".xml";
				URL url = new URL(uri);
				// connect to url
				HttpURLConnection connection = (HttpURLConnection) url
						.openConnection();
				counter--;
				// get xml
				connection.setRequestMethod("GET");
				connection.setRequestProperty("Accept", "application/xml");
				// read xml with inputstream
				InputStream xml = connection.getInputStream();
				// build string to parse
				StringBuilder out = new StringBuilder();
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(xml));
				String line;
				// buffer as long as lines are left
				while ((line = reader.readLine()) != null) {
					out.append(line);
				}
				String output = out.toString();

				// get weather
				int wetterbegin = output.indexOf("<weather>");
				int wetterend = output.indexOf("</weather>");
				weather = output.substring(wetterbegin + 9, wetterend);

				// get location
				int citybegin = output.indexOf("<city>");
				int cityend = output.indexOf("</city>");
				city = output.substring(citybegin + 6, cityend);

				// get country
				int countrybegin = output.indexOf("<state_name>");
				int countryend = output.indexOf("</state_name>");
				country = output.substring(countrybegin + 12, countryend);

				// get temeperatur
				int tempbegin = output.indexOf("<temp_c>");
				int tempend = output.indexOf("</temp_c");
				temp = output.substring(tempbegin + 8, tempend);

				// get call time
				int calltimebegin = output.indexOf("<local_time_rfc822>");
				int calltimeend = output.indexOf("</local_time_rfc822>");
				calltime = output.substring(calltimebegin + 19, calltimeend);

				// get humidity
				int humiditybegin = output.indexOf("<relative_humidity>");
				int humidityend = output.indexOf("</relative_humidity>");
				humidity = output.substring(humiditybegin + 19, humidityend);

				// wind direction
				int winddirbegin = output.indexOf("<wind_dir>");
				int winddirend = output.indexOf("</wind_dir>");
				winddir = output.substring(winddirbegin + 10, winddirend);

				// wind degrees
				int winddegreesbegin = output.indexOf("<wind_degrees>");
				int winddegreesend = output.indexOf("</wind_degrees>");
				winddegrees = output.substring(winddegreesbegin + 14,
						winddegreesend);

				// wind speed
				int windspeedbegin = output.indexOf("<wind_kph>");
				int windspeedend = output.indexOf("</wind_kph>");
				windspeed = output.substring(windspeedbegin + 10, windspeedend);

				System.out.println("Wetter in " + city + ", " + country
						+ " ist zur Zeit: " + weather + " bei " + temp
						+ "°C Luftemperatur und " + humidity + " "
						+ "Luftfeuchtigkeit. Der Wind kommt aus " + winddir
						+ "(" + winddegrees + "°) mit " + windspeed + "km/h.");
				// Prints the string content read from input stream
				System.out.println(output);
				// close reader
				reader.close();

			} catch (Exception e) {
				System.out
						.println("An error has occured. Possible mistakes: Wrong spelling of city, no internet connection ...");
			}
		}
	}
	// TODO implement weatherforecast??
	private void weatherforecast() {
		try {

			// String forecast =
			// "http://api.wunderground.com/api/5648c04dcac0d5db/forecast/lang:DL/q/Germany/
		} catch (Exception e) {
			System.out
					.println("An error has occured. (wrong spelling/connection issues etc.)");
		}
	}
}
