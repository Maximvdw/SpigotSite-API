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
	public int getMedalId();

	/**
	 * Get medal name
	 * 
	 * @return Name
	 */
	public String getName();

	/**
	 * Get medal description
	 * 
	 * @return Medal description
	 */
	public String getDescription();
}
