package be.maximvdw.spigotsite.api.forum;

import java.util.List;

import be.maximvdw.spigotsite.api.user.User;

/**
 * Spigot forum thread
 * 
 * @author Maxim Van de Wynckel
 */
public interface Thread {
	/**
	 * Get thread replies
	 * 
	 * @return List of {@link be.maximvdw.spigotsite.api.forum.Reply}
	 */
	public List<Reply> getReplies();

	/**
	 * Get thread creator
	 * 
	 * @return Thread creator
	 */
	public User getCreator();
}
