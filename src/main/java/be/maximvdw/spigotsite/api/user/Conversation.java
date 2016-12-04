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
	int getConverationId();

	/**
	 * Get the reply cout
	 * 
	 * @return Reply count
	 */
	int getRepliesCount();

	/**
	 * Get author of the conversation
	 * 
	 * @return Author user
	 */
	User getAuthor();

	/**
	 * Get a list of all the participants
	 * 
	 * @return List of participants
	 */
	List<User> getParticipants();

	/**
	 * Get conversation title
	 * 
	 * @return Title
	 */
	String getTitle();

	/**
	 * Get if the conversation us unread
	 *
	 * @return Unread status
	 */
	boolean isUnread();

	/**
	 * Set the unread status of a conversation
	 *
	 * @param user
	 *            Authenticated user
	 * @param unreadOrNot
	 *            True to set unread, false to set read
	 */
	public void markAsUnread(User user,
		 	boolean unreadOrNot) throws SpamWarningException;

	/**
	 * Get the last replier
	 *
	 * @return The last User to reply.
	 */
	User getLastReplier();

	/**
	 * Get the last reply date
	 *
	 * @return The date of the last reply.
	 */
	Date getLastReplyDate();

	/**
	 * Reply to the conversation
	 * 
	 * @param user
	 *            User that is replying
	 * @param bbCode
	 *            BB Code string
	 */
	void reply(User user, String bbCode) throws SpamWarningException;

	/**
	 * Leave the conversation
	 * 
	 * @param user
	 *            Authenticated user
	 */
	void leave(User user);
}
