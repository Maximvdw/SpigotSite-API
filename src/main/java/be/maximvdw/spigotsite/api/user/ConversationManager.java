package be.maximvdw.spigotsite.api.user;

import java.util.List;
import java.util.Set;

import be.maximvdw.spigotsite.api.exceptions.ConnectionFailedException;
import be.maximvdw.spigotsite.api.exceptions.SpamWarningException;

public interface ConversationManager {
    /**
     * Get conversations of user
     *
     * @param user  Authenticated {@link be.maximvdw.spigotsite.api.user.User}
     * @param count
     * @return List of {@link be.maximvdw.spigotsite.api.user.Conversation}
     * @throws ConnectionFailedException Connection to Spigot failed
     */
    List<Conversation> getConversations(User user, int count)
            throws ConnectionFailedException;

    /**
     * Reply to a converation
     *
     * @param conversation Conversation
     * @param user         Authenticated user
     * @param reply        Reply BB Code
     * @throws ConnectionFailedException Connection to Spigot failed
     */
    void replyToConversation(Conversation conversation, User user,
                             String reply) throws SpamWarningException, ConnectionFailedException;

    /**
     * Leave a conversation
     *
     * @param conversation Conversation
     * @param user         Authenticated user
     * @throws ConnectionFailedException Connection to Spigot failed
     */
    void leaveConversation(Conversation conversation, User user) throws ConnectionFailedException;

    /**
     * Create a new conversation
     *
     * @param user      Authenticated user that sends the message
     * @param recipents Recipents string
     * @param title     Title BB Code
     * @param body      Body BB Code
     * @param locked    Lock the conversation
     * @param invite    Invite others to the conversation
     * @param sticky    Set sticky
     * @return Conversation
     * @throws ConnectionFailedException Connection to Spigot failed
     */
    Conversation createConversation(User user, Set<String> recipents,
                                    String title, String body, boolean locked, boolean invite,
                                    boolean sticky) throws SpamWarningException, ConnectionFailedException;

    /**
     * Create a new conversation
     *
     * @param user     Authenticated user that sends the message
     * @param recipent Username to send it to
     * @param title    Title BB Code
     * @param body     Body BB Code
     * @param locked   Lock the conversation
     * @param invite   Invite others to the conversation
     * @param sticky   Set sticky
     * @return Conversation
     * @throws ConnectionFailedException Connection to Spigot failed
     */
    Conversation createConversation(User user, String recipient,
                                    String title, String body, boolean locked, boolean invite,
                                    boolean sticky) throws SpamWarningException, ConnectionFailedException;

    /**
     * Create a new conversation
     *
     * @param user     Authenticated user that sends the message
     * @param recipent Username to send it to
     * @param title    Title BB Code
     * @param body     Body BB Code
     * @param locked   Lock the conversation
     * @param invite   Invite others to the conversation
     * @return Conversation
     * @throws ConnectionFailedException Connection to Spigot failed
     */
    Conversation createConversation(User user, String recipient,
                                    String title, String body, boolean locked, boolean invite) throws SpamWarningException, ConnectionFailedException;

    /**
     * Mark a conversation as read
     *
     * @param user         Authenticated user
     * @param conversation Conversation to mark as read
     * @throws ConnectionFailedException Connection to Spigot failed
     */
    void markConversationAsRead(User user, Conversation conversation) throws ConnectionFailedException;

    /**
     * Mark a conversation as unread
     *
     * @param user         Authenticated user
     * @param conversation Conversation to mark as unread
     * @throws ConnectionFailedException Connection to Spigot failed
     */
    void markConversationAsUnread(User user, Conversation conversation) throws ConnectionFailedException;
}
