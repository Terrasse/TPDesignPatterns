package eu.telecomnancy;

import eu.telecomnancy.sensor.ISensor;
import eu.telecomnancy.sensor.SensorProxy;
import eu.telecomnancy.sensor.SimpleSensorLogger;
import eu.telecomnancy.sensor.StateTemperatureSensor;
import eu.telecomnancy.sensor.TemperatureSensor;
import eu.telecomnancy.ui.ConsoleUI;
import eu.telecomnancy.ui.MainWindow;

/**
 * Created with IntelliJ IDEA.
 * User: charoy
 * Date: 13/12/13
 * Time: 18:18
 */
public class AppProxy {
    public static void main(String[] args) {
        ISensor sensor = new SensorProxy(new StateTemperatureSensor(), new SimpleSensorLogger());
        new MainWindow(sensor);
    }
}
