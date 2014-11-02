package be.maximvdw.spigotsite.api.user;

public interface UserManager {
	/**
	 * Get {@link be.maximvdw.spigotsite.api.user.User} by identifier
	 * 
	 * @param userid
	 *            User identifier
	 * @return {@link be.maximvdw.spigotsite.api.user.User}
	 */
	public User getUserById(int userid);
}
