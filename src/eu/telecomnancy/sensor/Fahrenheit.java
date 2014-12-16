package eu.telecomnancy.sensor;
/**
 * Cette classe abtraite est réalisé à l'aide du Decorator Design Pattern
 * 
 * @author Terry DERVAUX
 */
public class Fahrenheit extends TemperatureSensorDecorator{

	public Fahrenheit(ISensor newTemperatureSensor) {
		super(newTemperatureSensor);
		System.out.println("L'unité du TemperatureSensor sera le Fahrenheit");
	}
	
    /*
     * (non-Javadoc)
     * @see eu.telecomnancy.sensor.ISensor#getValue()
     */
    public double getValue() throws SensorNotActivatedException{
    	return tempTemperatureSensor.getValue()*1.8;    
    }
    

}
