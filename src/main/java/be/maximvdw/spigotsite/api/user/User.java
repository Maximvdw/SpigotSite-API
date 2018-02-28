package be.maximvdw.spigotsite.api.user;

import java.util.List;

import be.maximvdw.spigotsite.api.exceptions.ConnectionFailedException;
import be.maximvdw.spigotsite.api.forum.ProfilePost;
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
    int getUserId();

    /**
     * Get spigot username
     *
     * @return Spigot username
     */
    String getUsername();

    /**
     * Determine if the spigot user is authenticated and can be used to perform
     * private actions.
     *
     * @return is Authenticated
     */
    boolean isAuthenticated();

    /**
     * Get purchased resources
     *
     * @return List of {@link be.maximvdw.spigotsite.api.resource.Resource}
     * @throws ConnectionFailedException internet connection failed
     */
    List<Resource> getPurchasedResources()
            throws ConnectionFailedException;

    /**
     * Get created resources
     *
     * @return List of {@link be.maximvdw.spigotsite.api.resource.Resource}
     */
    List<Resource> getCreatedResources() throws ConnectionFailedException;

    /**
     * Get spigot user statistics
     *
     * @return {@link be.maximvdw.spigotsite.api.user.UserStatistics}
     */
    UserStatistics getUserStatistics() throws ConnectionFailedException;

    /**
     * Get spigot user private conversations
     *
     * @return List of conversation
     */
    List<Conversation> getConversations() throws ConnectionFailedException;

    /**
     * Get users last activity
     *
     * @return Last activity string
     */
    String getLastActivity();

    /**
     * Check if the user has two factory authentication
     *
     * @return two factor auth
     */
    boolean hasTwoFactorAuthentication();

    /**
     * Get a list of profile posts
     *
     * @param user    The logged in user (required for hidden profiles)
     * @param profile The profile you want to get the posts from
     * @param count   amount of posts to fetch
     * @return list of profile posts
     * @throws ConnectionFailedException
     */
    List<ProfilePost> getProfilePosts(User user, User profile, int count) throws ConnectionFailedException;
}
