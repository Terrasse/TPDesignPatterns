package eu.telecomnancy.sensor;
/**
 * Cette classe abtraite est réalisé à l'aide du Decorator Design Pattern
 * 
 * @author Terry DERVAUX
 */
public abstract class TemperatureSensorDecorator extends ISensor{
	protected ISensor tempTemperatureSensor;
	
	public TemperatureSensorDecorator(ISensor newTemperatureSensor){
		tempTemperatureSensor = newTemperatureSensor;
	}
	
	/*
	 * (non-Javadoc)
	 * @see eu.telecomnancy.sensor.ISensor#on()
	 */
    public  void on(){
    	tempTemperatureSensor.on();
    }

	/*
	 * (non-Javadoc)
	 * @see eu.telecomnancy.sensor.ISensor#off()
	 */
    public void off() {
    	tempTemperatureSensor.off();
    }

    /*
     * (non-Javadoc)
     * @see eu.telecomnancy.sensor.ISensor#getStatus()
     */
    public boolean getStatus(){
    	return tempTemperatureSensor.getStatus();
    }

    /*
     * (non-Javadoc)
     * @see eu.telecomnancy.sensor.ISensor#update()
     */
    public void update() throws SensorNotActivatedException{
    	tempTemperatureSensor.update();
    }


    /*
     * (non-Javadoc)
     * @see eu.telecomnancy.sensor.ISensor#getValue()
     */
    public double getValue() throws SensorNotActivatedException{
    	return tempTemperatureSensor.getValue();
    }
    
    /*
     * (non-Javadoc)
     * @see eu.telecomnancy.sensor.Observable#notifyObservers()
     */
	public void notifyObservers(){
		tempTemperatureSensor.notifyObservers();
	}
	
	public void addObserver(Observer o){
		tempTemperatureSensor.addObserver(o);
	}
	
	public void removeObserver(Observer o){
		tempTemperatureSensor.removeObserver(o);
	}
}
