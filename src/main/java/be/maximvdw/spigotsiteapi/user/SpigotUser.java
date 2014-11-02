package be.maximvdw.spigotsiteapi.user;

public interface SpigotUser{
	/**
	 * Get spigot user identifier
	 * 
	 * @return Spigot user identifier
	 */
	public int getUserId();

	/**
	 * Get spigot username
	 * 
	 * @return Spigot username
	 */
	public String getUsername();
}
