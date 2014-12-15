package eu.telecomnancy.sensor;

import java.sql.Date;
import java.text.DateFormat;
import java.util.Locale;

/**
 * Created with IntelliJ IDEA.
 * User: charoy
 * Date: 13/12/13
 * Time: 18:16
 */
public class SimpleSensorLogger implements SensorLogger {
    @Override
    public void log(LogLevel level, String message) {
        System.out.println(level.name() + " " + message);
    }

	/**
	 * Cette m�thode permet d'�crire dans le console de journal
	 * format : "log DATE : methode value
	 * @param methode repr�sente la m�thode
	 * @param value repr�sente la valeur retourn�e par la m�thode
	 */
	public void log(String methode, String value) {
		Locale locale = Locale.getDefault();
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, locale);
		Date current = new Date(System.currentTimeMillis());
		System.out.println("log "+dateFormat.format(current)+" : "+methode+" "+value);
		// TODO Auto-generated method stub
		
	}
}
