package eu.telecomnancy.sensor;

/**
 * Cette classe est réalisé à l'aide du State Design Pattern
 * Elle représente l'objet qui est influancé par le context
 * @author Terry DERVAUX
 */
public class StateTemperatureSensor extends ISensor{
	// l'attribut représente la valeur du StateTemperatureSensor
    double value = 0;
    
    // l'attribut représente un état possible du StateTemperatureSensor
    StateTemperatureSensorStateOn stateTemperatureSensorStateOn;
    // l'attribut représente un état possible du StateTemperatureSensor
    StateTemperatureSensorStateOff stateTemperatureSensorStateOff;
    // l'attribut représente le context du State Design Pattern
    IStateTemperatureSensorState temperatureSensorState;

    public StateTemperatureSensor(){
    	stateTemperatureSensorStateOff = new StateTemperatureSensorStateOff(this);
    	stateTemperatureSensorStateOn = new StateTemperatureSensorStateOn(this);

    	temperatureSensorState=stateTemperatureSensorStateOff;
    }
    
    /*
     *  Cette méthode permet de change le context du StateTemperatureSensor (=changer l'état du StateTemperatureSensor)
     *  @param newTemperatureSensorState nouvelle état du StateTemperatureSensor
     */
    public void setTemperatureSensorState(IStateTemperatureSensorState newTemperatureSensorState){
    	this.temperatureSensorState = newTemperatureSensorState;
    }
    
    /**
     * Cette méthode permet de changer la valeur du StateTemperatureSensor
     * @param newValue nouvelle valeur de valeur de la température du StateTemperatureSensor
     */
    public void setValue(double newValue){
    	this.value=newValue;
    }

    /*
     *  Cette méthode permet de mettre en route le StateTemperatureSensor(non-Javadoc)
     * @see eu.telecomnancy.sensor.ISensor#on()
     */
	public void on() {
		this.temperatureSensorState.on();
	}

	/*
	 *  Cette méthode permet de mettre d'eteindre le StateTemperatureSensor(non-Javadoc)
	 * @see eu.telecomnancy.sensor.ISensor#off()
	 */
	public void off() {
		this.temperatureSensorState.off();
	}

	/*
	 *  Cette méthode permet de connaitre l'état du StateTemperatureSensor(non-Javadoc)
	 * @see eu.telecomnancy.sensor.ISensor#getStatus()
	 */
	public boolean getStatus() {
		return this.temperatureSensorState.getStatus();
	}
	
	/*
	 *  Cette méthode permet de mettre à jour la valeur du StateTemperatureSensor
	 * @see eu.telecomnancy.sensor.ISensor#getStatus()
	 */
	public void update() throws SensorNotActivatedException {
		this.temperatureSensorState.update();
	}

	/**
	 *  Cette méthode permet de récupérer la valeur du StateTemperatureSensor
	 */
	public double getValue() throws SensorNotActivatedException {
		return this.temperatureSensorState.getValue();
	}
}
