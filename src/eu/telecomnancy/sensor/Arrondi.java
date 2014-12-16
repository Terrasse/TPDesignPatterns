package eu.telecomnancy.sensor;

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
