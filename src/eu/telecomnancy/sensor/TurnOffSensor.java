package eu.telecomnancy.sensor;
/**
 * Cette classe abtraite est réalisé à l'aide du command Design Pattern
 * 
 * @author Terry DERVAUX
 */
public class TurnOffSensor implements Command {

	ISensor theSensor;

	public TurnOffSensor(ISensor newSensor) {
		this.theSensor = newSensor;
	}

	/*
	 * (non-Javadoc)
	 * @see eu.telecomnancy.sensor.Command#execute()
	 */
	public void execute() {
		theSensor.off();
	}
}
