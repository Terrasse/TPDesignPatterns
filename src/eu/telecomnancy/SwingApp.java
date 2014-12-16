package eu.telecomnancy;

import eu.telecomnancy.sensor.Arrondi;
import eu.telecomnancy.sensor.Fahrenheit;
import eu.telecomnancy.sensor.ISensor;
import eu.telecomnancy.sensor.SensorNotActivatedException;
import eu.telecomnancy.sensor.TemperatureSensor;
import eu.telecomnancy.ui.MainWindow;

public class SwingApp {

    public static void main(String[] args) throws SensorNotActivatedException {
        // test pour le design pattern decorateur 
    	ISensor sensor = new Arrondi(new Fahrenheit(new TemperatureSensor()));
        new MainWindow(sensor);
    }

}
