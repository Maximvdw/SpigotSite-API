package be.maximvdw.spigotsite.api.user;

import java.util.List;

import be.maximvdw.spigotsite.api.exceptions.ConnectionFailedException;
import be.maximvdw.spigotsite.api.exceptions.PermissionException;
import be.maximvdw.spigotsite.api.forum.ProfilePost;
import be.maximvdw.spigotsite.api.user.exceptions.InvalidCredentialsException;
import be.maximvdw.spigotsite.api.user.exceptions.TwoFactorAuthenticationException;

/**
 * Spigot User Manager
 *
 * @author Maxim Van de Wynckel
 */
public interface UserManager {
    /**
     * Get {@link be.maximvdw.spigotsite.api.user.User} by identifier
     *
     * @param userid User identifier
     * @return {@link be.maximvdw.spigotsite.api.user.User}
     * @throws ConnectionFailedException Connection to Spigot failed
     */
    User getUserById(int userid) throws ConnectionFailedException, PermissionException;

    /**
     * Get a list of users by their name
     *
     * @param name Name
     * @return List of users
     * @throws ConnectionFailedException Connection to Spigot failed
     */
    List<String> getUsernamesByName(String name) throws ConnectionFailedException;

    /**
     * Get user by name
     *
     * @param name username
     * @return User instance
     * @throws ConnectionFailedException Connection to Spigot failed
     */
    User getUserByName(String name) throws ConnectionFailedException;

    /**
     * Get {@link be.maximvdw.spigotsite.api.user.User} by identifier
     *
     * @param userid User identifier
     * @param user   Authenticated {@link be.maximvdw.spigotsite.api.user.User}
     * @return {@link be.maximvdw.spigotsite.api.user.User}
     * @throws ConnectionFailedException Connection to Spigot failed
     */
    User getUserById(int userid, User user) throws ConnectionFailedException, PermissionException;

    /**
     * Authenticate a spigot user
     *
     * @param username Username or Email address
     * @param password Password
     * @return Authenticated Spigot user
     * @throws ConnectionFailedException Connection to Spigot failed
     */
    User authenticate(String username, String password)
            throws InvalidCredentialsException, TwoFactorAuthenticationException, ConnectionFailedException;

    /**
     * Authenticate a spigot user
     *
     * @param username                      Username or Email address
     * @param password                      Password
     * @param twoFactorAuthenticationSecret Two factory authentication BASE 64 secret
     * @return Authenticated Spigot user
     * @throws ConnectionFailedException Connection to Spigot failed
     */
    User authenticate(String username, String password, String twoFactorAuthenticationSecret)
            throws InvalidCredentialsException, TwoFactorAuthenticationException, ConnectionFailedException;

    /**
     * Authenticate a spigot user
     *
     * @param username Username or Email address
     * @param password Password
     * @param user     Logged off user with cookies
     * @return Authenticated Spigot user
     * @throws ConnectionFailedException Connection to Spigot failed
     */
    User authenticate(String username, String password, User user)
            throws InvalidCredentialsException, TwoFactorAuthenticationException, ConnectionFailedException;


    /**
     * Log off a spigot user
     *
     * @param user Authenticated Spigot user
     * @throws ConnectionFailedException Connection to Spigot failed
     */
    void logOff(User user) throws ConnectionFailedException;

    /**
     * Log off a spigot user
     *
     * @param force Force clear the cookies
     * @param user  Authenticated Spigot user
     * @throws ConnectionFailedException Connection to Spigot failed
     */
    void logOff(User user, boolean force) throws ConnectionFailedException;

    /**
     * Check if the user is logged in
     *
     * @param user User to check
     * @return logged in boolean
     * @throws ConnectionFailedException Connection to Spigot failed
     */
    boolean isLoggedIn(User user) throws ConnectionFailedException;

    /**
     * Get user ranks
     *
     * @return List of {@link be.maximvdw.spigotsite.api.user.UserRank}
     * @throws ConnectionFailedException Connection to Spigot failed
     */
    List<UserRank> getUserRanks() throws ConnectionFailedException;

    /**
     * Get users by rank
     *
     * @param rank
     * @return List of {@link be.maximvdw.spigotsite.api.user.User}
     * @throws ConnectionFailedException Connection to Spigot failed
     */
    List<User> getUsersByRank(UserRank rank) throws ConnectionFailedException;

    /**
     * Get online members
     *
     * @return List of members
     * @throws ConnectionFailedException Connection to Spigot failed
     */
    List<User> getOnlineUsers() throws ConnectionFailedException;

    /**
     * Get a list of profile posts
     *
     * @param user    The logged in user (required for hidden profiles)
     * @param profile The profile you want to get the posts from
     * @param count   amount of posts to fetch
     * @return list of profile posts
     * @throws ConnectionFailedException
     */
    List<ProfilePost> getProfilePosts(User user, User profile, int count) throws ConnectionFailedException , PermissionException;
}
