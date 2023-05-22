import org.json.JSONObject;

import java.net.URL;
import java.net.URLConnection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Class that implements the calculations after given the data
 * from the web.
 */
public class HTMLScanning {
    public static void main(String[] args) throws ParseException {
        HTMLScanning sca = new HTMLScanning();
        sca.weatherData(10514);
    }

    /**
     * Gets the JSON file given the zipcode. Need to still parse through data...
     *
     * @param zipcode of area
     * @return a condensed map with all relevant data after parsing
     * @throws ParseException //
     */
    public HashMap<String, Double> weatherData(int zipcode) throws ParseException {
        String content = null;
        URLConnection connection = null;
        //Finds tomorrow's date and sets time to 8am
        String dateAndTime = "" + java.time.LocalDate.now();
        String increment = addOneDayCalendar(dateAndTime);
        increment += "T08:00:00";
        try {
            connection = new URL("https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/" + zipcode + "/" + increment + "?key=MWW42ANL8BBNXBMNXMCSHB842").openConnection();
            Scanner sc = new Scanner(connection.getInputStream());
            sc.useDelimiter("\\Z");
            content = sc.next();
            sc.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        assert content != null;
        JSONObject x = new JSONObject(content);
        var get = x.getJSONArray("days").getJSONObject(0);
        HashMap<String, Double> map = new HashMap<>() {
        };
        map.put("snowdepth", get.getDouble("snowdepth"));
        map.put("snow", get.getDouble("snow"));
        map.put("tempmin", get.getDouble("tempmin"));
        map.put("temp", get.getDouble("temp"));
        map.put("precip", get.getDouble("precip"));

        return map;
    }

    /**
     * Helper Method to increment a day. Need this because
     * when checking for a snow day you find the weather of the next
     * morning.
     *
     * @param date before incrementation
     * @return the String with one day added
     * @throws ParseException //
     */
    public static String addOneDayCalendar(String date)
            throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        c.setTime(sdf.parse(date));
        c.add(Calendar.DATE, 1);
        return sdf.format(c.getTime());
    }
}
