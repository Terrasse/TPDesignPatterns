package eu.telecomnancy.sensor;
/**
 * Cette classe abtraite est réalisé à l'aide du command Design Pattern
 * 
 * @author Terry DERVAUX
 */
public class UpdateSensor implements Command {

	ISensor theSensor;

	public UpdateSensor(ISensor newSensor) {
		this.theSensor = newSensor;
	}

	/*
	 * (non-Javadoc)
	 * @see eu.telecomnancy.sensor.Command#execute()
	 */
	public void execute() {
		try {
			theSensor.update();
		}
		catch (SensorNotActivatedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
