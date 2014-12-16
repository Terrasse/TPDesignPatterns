package eu.telecomnancy.sensor;
/**
 * Cette classe abtraite est réalisé à l'aide du Command Design Pattern
 * 
 * @author Terry DERVAUX
 */
public class SensorButton {

	Command theCommand;

	public SensorButton(Command newCommand) {
		this.theCommand = newCommand;
	}
	
	public void press(){
		theCommand.execute();
	}
}
