package be.maximvdw.spigotsite.api.forum;

import be.maximvdw.spigotsite.api.user.User;

/**
 * Forum thread reply
 * 
 * @author Maxim Van de Wynckel
 */
public interface Post {
	/**
	 * Get the author of the reply
	 * 
	 * @return Spigot User
	 */
	public User getAuthor();
}
