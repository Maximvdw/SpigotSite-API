package be.maximvdw.spigotsite.api.user;

import java.util.List;

import be.maximvdw.spigotsite.api.resource.Resource;

/**
 * Spigot User
 * 
 * @author Maxim Van de Wynckel
 */
public interface User {
	/**
	 * Get spigot user identifier
	 * 
	 * @return Spigot user identifier
	 */
	public int getUserId();

	/**
	 * Get spigot username
	 * 
	 * @return Spigot username
	 */
	public String getUsername();

	/**
	 * Determine if the spigot user is authenticated and can be used to perform
	 * private actions.
	 * 
	 * @return is Authenticated
	 */
	public boolean isAuthenticated();

	/**
	 * Get purchased resources
	 * 
	 * @return List of {@link be.maximvdw.spigotsite.api.resource.Resource}
	 */
	public List<Resource> getPurchasedResources();

	/**
	 * Get created resources
	 * 
	 * @return List of {@link be.maximvdw.spigotsite.api.resource.Resource}
	 */
	public List<Resource> getCreatedResources();

	/**
	 * Get spigot user statistics
	 * 
	 * @return {@link be.maximvdw.spigotsite.api.user.UserStatistics}
	 */
	public UserStatistics getUserStatistics();

	/**
	 * Get spigot user private conversations
	 * 
	 * @return List of conversation
	 */
	public List<Conversation> getConversations();
}
