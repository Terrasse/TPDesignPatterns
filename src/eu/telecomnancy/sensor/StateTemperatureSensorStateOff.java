package eu.telecomnancy.sensor;

/**
 * Cette classe a été réalisé à l'aide du State Design Pattern
 * Elle représente l'etat concret : OFF, pris par l'objet StateTemperatureSensor
 * @author Terry DERVAUX
 *
 */
public class StateTemperatureSensorStateOff extends IStateTemperatureSensorState{
	// l'attribut représente le StateTemperatureSensor que représente cet état
	StateTemperatureSensor stateTemperatureSensor;
	
	public StateTemperatureSensorStateOff(StateTemperatureSensor stateTemperatureSensor){
		this.stateTemperatureSensor=stateTemperatureSensor;
	}
	
	/*
	 * (non-Javadoc)
	 * @see eu.telecomnancy.sensor.ISensor#on()
	 */
	public void on() {
		stateTemperatureSensor.setTemperatureSensorState(stateTemperatureSensor.stateTemperatureSensorStateOn);
	}

	/*
	 * (non-Javadoc)
	 * @see eu.telecomnancy.sensor.ISensor#off()
	 */
	public void off() {
		// la méthode n'est sensé rien faire lorsque le StateTemperatureSensor est déjà eteint
		// j'ai cependant rajouté un message dans la console pour verifier le passage dans cette
		// méthode 
		System.out.println("StateTemperatureSensor is already turn off.");
	}

	/*
	 * (non-Javadoc)
	 * @see eu.telecomnancy.sensor.ISensor#getStatus()
	 */
	public boolean getStatus() {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * @see eu.telecomnancy.sensor.ISensor#update()
	 */
	public void update() throws SensorNotActivatedException {
		throw new SensorNotActivatedException("Sensor must be activated before acquiring new values.");
	}

	/*
	 * (non-Javadoc)
	 * @see eu.telecomnancy.sensor.ISensor#getValue()
	 */
	public double getValue() throws SensorNotActivatedException {
		throw new SensorNotActivatedException("Sensor must be activated to get its value.");
	}

}
