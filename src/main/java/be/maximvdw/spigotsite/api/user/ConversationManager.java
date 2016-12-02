package be.maximvdw.spigotsite.api.user;

import java.util.List;
import java.util.Set;

import be.maximvdw.spigotsite.api.exceptions.ConnectionFailedException;
import be.maximvdw.spigotsite.api.exceptions.SpamWarningException;

public interface ConversationManager {
	/**
	 * Get conversations of user
	 * 
	 * @param user
	 *            Authenticated {@link be.maximvdw.spigotsite.api.user.User}
	 * @param count
	 * @return List of {@link be.maximvdw.spigotsite.api.user.Conversation}
	 */
	List<Conversation> getConversations(User user, int count)
			throws ConnectionFailedException;

	/**
	 * Reply to a converation
	 * 
	 * @param conversation
	 *            Conversation
	 * @param user
	 *            Authenticated user
	 * @param reply
	 *            Reply BB Code
	 */
	void replyToConversation(Conversation conversation, User user,
							 String reply) throws SpamWarningException;

	/**
	 * Leave a conversation
	 * 
	 * @param conversation
	 *            Conversation
	 * @param user
	 *            Authenticated user
	 */
	void leaveConversation(Conversation conversation, User user);

	/**
	 * Create a new conversation
	 * 
	 * @param user
	 *            Authenticated user that sends the message
	 * @param recipents
	 *            Recipents string
	 * @param title
	 *            Title BB Code
	 * @param body
	 *            Body BB Code
	 * @param locked
	 *            Lock the conversation
	 * @param invite
	 *            Invite others to the conversation
	 * @param sticky
	 *            Set sticky
	 * @return Conversation
	 */
	Conversation createConversation(User user, Set<String> recipents,
									String title, String body, boolean locked, boolean invite,
									boolean sticky) throws SpamWarningException;
}
