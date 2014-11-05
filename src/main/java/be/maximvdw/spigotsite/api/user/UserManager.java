package be.maximvdw.spigotsite.api.user;

import be.maximvdw.spigotsite.api.user.exceptions.InvalidCredentialsException;

/**
 * Spigot User Manager
 * 
 * @author Maxim Van de Wynckel
 */
public interface UserManager {
	/**
	 * Get {@link be.maximvdw.spigotsite.api.user.User} by identifier
	 * 
	 * @param userid
	 *            User identifier
	 * @return {@link be.maximvdw.spigotsite.api.user.User}
	 */
	public User getUserById(int userid);

	/**
	 * Get {@link be.maximvdw.spigotsite.api.user.User} by identifier
	 * 
	 * @param userid
	 *            User identifier
	 * @param user
	 *            Authenticated {@link be.maximvdw.spigotsite.api.user.User}
	 * @return {@link be.maximvdw.spigotsite.api.user.User}
	 */
	public User getUserById(int userid, User user);

	/**
	 * Authenticate a spigot user
	 * 
	 * @param username
	 *            Username or Email address
	 * @param password
	 *            Password
	 * @return Authenticated Spigot user
	 */
	public User authenticate(String username, String password)
			throws InvalidCredentialsException;

	/**
	 * Log off a spigot user
	 * 
	 * @param user
	 *            Authenticated Spigot user
	 */
	public void logOff(User user);
}
