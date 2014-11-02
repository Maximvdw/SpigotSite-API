package be.maximvdw.spigotsite.api;

import be.maximvdw.spigotsite.api.user.SpigotUser;
import be.maximvdw.spigotsite.api.user.exceptions.AuthenticationFailureException;

public interface SpigotSiteAPI {
	/**
	 * Authenticate a spigot user
	 * 
	 * @param username
	 *            Username or Email address
	 * @param password
	 *            Password
	 * @return Authenticated Spigot user
	 */
	public SpigotUser authenticate(String username, String password)
			throws AuthenticationFailureException;

	/**
	 * Log off a spigot user
	 * 
	 * @param user
	 *            Authenticated Spigot user
	 */
	public void logOff(SpigotUser user);
}
