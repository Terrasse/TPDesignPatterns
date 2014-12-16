package eu.telecomnancy.sensor;

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
    	System.out.println(tempTemperatureSensor.getValue()+"°C");
    	return tempTemperatureSensor.getValue()*1.8;    
    }
    

}
