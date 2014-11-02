package be.maximvdw.spigotsite.api.user;

public interface User{
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
