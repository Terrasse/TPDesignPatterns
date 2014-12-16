package eu.telecomnancy.sensor;

/**
 * Cette classe abtraite est réalisé à l'aide du Command Design Pattern
 * 
 * @author Terry DERVAUX
 */
public interface Command {
	/**
	 * Méthode permettant d'executer la commande explicité dans le nom de la classe
	 */
	public void execute();
}
