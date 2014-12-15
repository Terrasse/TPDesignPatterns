package eu.telecomnancy.sensor;

/**
 * Cette classe est r�alis� � l'aide du State Design Pattern
 * Elle repr�sente l'objet qui est influanc� par le context
 * @author Terry DERVAUX
 */
public class StateTemperatureSensor extends ISensor{
	// l'attribut repr�sente la valeur du StateTemperatureSensor
    double value = 0;
    
    // l'attribut repr�sente un �tat possible du StateTemperatureSensor
    StateTemperatureSensorStateOn stateTemperatureSensorStateOn;
    // l'attribut repr�sente un �tat possible du StateTemperatureSensor
    StateTemperatureSensorStateOff stateTemperatureSensorStateOff;
    // l'attribut repr�sente le context du State Design Pattern
    IStateTemperatureSensorState temperatureSensorState;

    public StateTemperatureSensor(){
    	stateTemperatureSensorStateOff = new StateTemperatureSensorStateOff(this);
    	stateTemperatureSensorStateOn = new StateTemperatureSensorStateOn(this);

    	temperatureSensorState=stateTemperatureSensorStateOff;
    }
    
    /*
     *  Cette m�thode permet de change le context du StateTemperatureSensor (=changer l'�tat du StateTemperatureSensor)
     *  @param newTemperatureSensorState nouvelle �tat du StateTemperatureSensor
     */
    public void setTemperatureSensorState(IStateTemperatureSensorState newTemperatureSensorState){
    	this.temperatureSensorState = newTemperatureSensorState;
    }
    
    /**
     * Cette m�thode permet de changer la valeur du StateTemperatureSensor
     * @param newValue nouvelle valeur de valeur de la temp�rature du StateTemperatureSensor
     */
    public void setValue(double newValue){
    	this.value=newValue;
    }

    /*
     *  Cette m�thode permet de mettre en route le StateTemperatureSensor(non-Javadoc)
     * @see eu.telecomnancy.sensor.ISensor#on()
     */
	public void on() {
		this.temperatureSensorState.on();
	}

	/*
	 *  Cette m�thode permet de mettre d'eteindre le StateTemperatureSensor(non-Javadoc)
	 * @see eu.telecomnancy.sensor.ISensor#off()
	 */
	public void off() {
		this.temperatureSensorState.off();
	}

	/*
	 *  Cette m�thode permet de connaitre l'�tat du StateTemperatureSensor(non-Javadoc)
	 * @see eu.telecomnancy.sensor.ISensor#getStatus()
	 */
	public boolean getStatus() {
		return this.temperatureSensorState.getStatus();
	}
	
	/*
	 *  Cette m�thode permet de mettre � jour la valeur du StateTemperatureSensor
	 * @see eu.telecomnancy.sensor.ISensor#getStatus()
	 */
	public void update() throws SensorNotActivatedException {
		this.temperatureSensorState.update();
	}

	/**
	 *  Cette m�thode permet de r�cup�rer la valeur du StateTemperatureSensor
	 */
	public double getValue() throws SensorNotActivatedException {
		return this.temperatureSensorState.getValue();
	}
}
