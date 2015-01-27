package be.maximvdw.spigotsite.api.user;

import java.util.List;

/**
 * Spigot Conversation
 * 
 * @author Maxim Van de Wynckel
 */
public interface Conversation {

	/**
	 * Get the conversation ID
	 * 
	 * @return ID
	 */
	public int getConverationId();

	/**
	 * Get author of the conversation
	 * 
	 * @return Author user
	 */
	public User getAuthor();

	/**
	 * Get a list of all the participants
	 * 
	 * @return List of participants
	 */
	public List<User> getParticipants();

	/**
	 * Get conversation title
	 * 
	 * @return Title
	 */
	public String getTitle();
}
