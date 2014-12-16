package eu.telecomnancy.sensor;

/**
 * Cette classe abtraite est r�alis� � l'aide du Command Design Pattern
 * 
 * @author Terry DERVAUX
 */
public interface Command {
	/**
	 * M�thode permettant d'executer la commande explicit� dans le nom de la classe
	 */
	public void execute();
}
