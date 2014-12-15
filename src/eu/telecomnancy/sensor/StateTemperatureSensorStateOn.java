package eu.telecomnancy.sensor;

import java.util.Random;

/**
 * Cette classe a été réalisé à l'aide du State Design Pattern
 * Elle représente l' etat concret : ON, pris par l'objet StateTemperatureSensor
 * @author Terry DERVAUX
 *
 */
public class StateTemperatureSensorStateOn extends IStateTemperatureSensorState{

	// l'attribut représente le StateTemperatureSensor que représente cet état
	StateTemperatureSensor stateTemperatureSensor;
	
	public StateTemperatureSensorStateOn(StateTemperatureSensor stateTemperatureSensor){
		this.stateTemperatureSensor=stateTemperatureSensor;
	}

	/*
	 * (non-Javadoc)
	 * @see eu.telecomnancy.sensor.IStateTemperatureSensorState#on()
	 */
	public void on() {
		// la méthode n'est sensé rien faire lorsque le StateTemperatureSensor est déjà eteint
		// j'ai cependant rajouté un message dans la console pour verifier le passage dans cette
		// méthode 
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
