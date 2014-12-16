package eu.telecomnancy.sensor;
/**
 * Cette classe abtraite est r�alis� � l'aide du Decorator Design Pattern
 * 
 * @author Terry DERVAUX
 */
public class Fahrenheit extends TemperatureSensorDecorator{

	public Fahrenheit(ISensor newTemperatureSensor) {
		super(newTemperatureSensor);
		System.out.println("L'unit� du TemperatureSensor sera le Fahrenheit");
	}
	
    /*
     * (non-Javadoc)
     * @see eu.telecomnancy.sensor.ISensor#getValue()
     */
    public double getValue() throws SensorNotActivatedException{
    	return tempTemperatureSensor.getValue()*1.8;    
    }
    

}
