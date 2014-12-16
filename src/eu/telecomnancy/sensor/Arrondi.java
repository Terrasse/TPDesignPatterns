package eu.telecomnancy.sensor;
/**
 * Cette classe abtraite est réalisé à l'aide du Decorator Design Pattern
 * 
 * @author Terry DERVAUX
 */
public class Arrondi extends TemperatureSensorDecorator{

	public Arrondi(ISensor newTemperatureSensor) {
		super(newTemperatureSensor);
		System.out.println("Le Temperature sensor aura sa valeur Arrondie");
	}
	
    /*
     * (non-Javadoc)
     * @see eu.telecomnancy.sensor.ISensor#getValue()
     */
    public double getValue() throws SensorNotActivatedException{
    	return Math.round(tempTemperatureSensor.getValue()*1.8);    
    }
	
}
