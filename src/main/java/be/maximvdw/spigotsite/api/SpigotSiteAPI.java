package be.maximvdw.spigotsite.api;

import be.maximvdw.spigotsite.api.forum.ForumManager;
import be.maximvdw.spigotsite.api.resource.ResourceManager;
import be.maximvdw.spigotsite.api.user.ConversationManager;
import be.maximvdw.spigotsite.api.user.UserManager;

/**
 * Spigot Site Application Programmable Interface
 * 
 * @author Maxim Van de Wynckel
 */
public interface SpigotSiteAPI {
	/**
	 * Get spigot user manager
	 * 
	 * @return {@link be.maximvdw.spigotsite.api.user.UserManager}
	 */
	UserManager getUserManager();

	/**
	 * Get spigot resource manager
	 * 
	 * @return {@link be.maximvdw.spigotsite.api.resource.ResourceManager}
	 */
	ResourceManager getResourceManager();

	/**
	 * Get spigot forum manager
	 *
	 * @return {@link be.maximvdw.spigotsite.api.forum.ForumManager}
	 */
	ForumManager getForumManager();

	/**
	 * Get spigot conversation manager
	 * 
	 * @return {@link be.maximvdw.spigotsite.api.user.ConversationManager}
	 */
	ConversationManager getConversationManager();
}
