package eu.telecomnancy.sensor;

import java.util.Random;

/**
 * Cette classe a �t� r�alis� � l'aide du State Design Pattern
 * Elle repr�sente l' etat concret : ON, pris par l'objet StateTemperatureSensor
 * @author Terry DERVAUX
 *
 */
public class StateTemperatureSensorStateOn extends IStateTemperatureSensorState{

	// l'attribut repr�sente le StateTemperatureSensor que repr�sente cet �tat
	StateTemperatureSensor stateTemperatureSensor;
	
	public StateTemperatureSensorStateOn(StateTemperatureSensor stateTemperatureSensor){
		this.stateTemperatureSensor=stateTemperatureSensor;
	}

	/*
	 * (non-Javadoc)
	 * @see eu.telecomnancy.sensor.IStateTemperatureSensorState#on()
	 */
	public void on() {
		// la m�thode n'est sens� rien faire lorsque le StateTemperatureSensor est d�j� eteint
		// j'ai cependant rajout� un message dans la console pour verifier le passage dans cette
		// m�thode 
		System.out.println("StateTemperatureSensor is already turn on.");
	}

	/*
	 * (non-Javadoc)
	 * @see eu.telecomnancy.sensor.IStateTemperatureSensorState#off()
	 */
	public void off() {
		this.stateTemperatureSensor.setTemperatureSensorState(this.stateTemperatureSensor.stateTemperatureSensorStateOff);
	}

	/*
	 * (non-Javadoc)
	 * @see eu.telecomnancy.sensor.IStateTemperatureSensorState#getStatus()
	 */
	public boolean getStatus() {
		return true;
	}

	/*
	 * (non-Javadoc)
	 * @see eu.telecomnancy.sensor.IStateTemperatureSensorState#update()
	 */
	public void update() throws SensorNotActivatedException {
		this.stateTemperatureSensor.setValue((new Random()).nextDouble() * 100);
		this.stateTemperatureSensor.notifyObservers();
	}

	/*
	 * (non-Javadoc)
	 * @see eu.telecomnancy.sensor.IStateTemperatureSensorState#getValue()
	 */
	public double getValue() throws SensorNotActivatedException {
		return this.stateTemperatureSensor.value;
	}

}
