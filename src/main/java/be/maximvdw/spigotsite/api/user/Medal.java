package be.maximvdw.spigotsite.api.user;

/**
 * Spigot donation medal
 * 
 * @author Maxim Van de Wynckel
 */
public interface Medal {
	/**
	 * Get medal identifier
	 * 
	 * @return Medal identifier
	 */
	int getMedalId();

	/**
	 * Get medal name
	 * 
	 * @return Name
	 */
	String getName();

	/**
	 * Get medal description
	 * 
	 * @return Medal description
	 */
	String getDescription();
}
