package be.maximvdw.spigotsite.api.user;

import java.util.Date;
import java.util.List;

import be.maximvdw.spigotsite.api.exceptions.SpamWarningException;

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
	 * Get the reply cout
	 * 
	 * @return Reply count
	 */
	public int getRepliesCount();

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

	/**
	 * Get if the conversation us unread
	 *
	 * @return Unread status
	 */
	public boolean isUnread();

	/**
	 * Get the last replier
	 *
	 * @return The last User to reply.
	 */
	public User getLastReplier();

	/**
	 * Get the last reply date
	 *
	 * @return The date of the last reply.
	 */
	public Date getLastReplyDate();

	/**
	 * Reply to the conversation
	 * 
	 * @param user
	 *            User that is replying
	 * @param bbCode
	 *            BB Code string
	 */
	public void reply(User user, String bbCode) throws SpamWarningException;

	/**
	 * Leave the conversation
	 * 
	 * @param user
	 *            Authenticated user
	 */
	public void leave(User user);
}
