package eu.telecomnancy.sensor;
/**
 * Cette classe abtraite est réalisé à l'aide du State Design Pattern
 * Elle représente l'interface definissant le comportement des états particuliers de StateTemperatureSensor
 * 
 * Pour conserver mon pattern observer tout en permettant de bien faire la différence entre les différents 
 * composants du State Deign Pattern, j'ai choisi de réaliser une classe abstraite jouant le rôle
 * d'interface State. 
 * @author Terry DERVAUX
 */
public abstract class IStateTemperatureSensorState extends ISensor{

	/*
	 * (non-Javadoc)
	 * @see eu.telecomnancy.sensor.ISensor#on()
	 */
	public abstract void on();

	/*
	 * (non-Javadoc)
	 * @see eu.telecomnancy.sensor.ISensor#off()
	 */
	public abstract void off();

	/*
	 * (non-Javadoc)
	 * @see eu.telecomnancy.sensor.ISensor#getStatus()
	 */
	public abstract boolean getStatus();

	/*
	 * (non-Javadoc)
	 * @see eu.telecomnancy.sensor.ISensor#update()
	 */
	public abstract void update() throws SensorNotActivatedException;

	/*
	 * (non-Javadoc)
	 * @see eu.telecomnancy.sensor.ISensor#getValue()
	 */
	public abstract double getValue() throws SensorNotActivatedException;
	
}
