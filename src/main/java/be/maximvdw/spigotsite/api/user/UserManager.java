package be.maximvdw.spigotsite.api.user;

import java.util.List;

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
     */
    User getUserById(int userid);

    /**
     * Get a list of users by their name
     *
     * @param name Name
     * @return List of users
     */
    List<String> getUsernamesByName(String name);

    /**
     * Get user by name
     *
     * @param name username
     * @return User instance
     */
    User getUserByName(String name);

    /**
     * Get {@link be.maximvdw.spigotsite.api.user.User} by identifier
     *
     * @param userid User identifier
     * @param user   Authenticated {@link be.maximvdw.spigotsite.api.user.User}
     * @return {@link be.maximvdw.spigotsite.api.user.User}
     */
    User getUserById(int userid, User user);

    /**
     * Authenticate a spigot user
     *
     * @param username Username or Email address
     * @param password Password
     * @return Authenticated Spigot user
     */
    User authenticate(String username, String password)
            throws InvalidCredentialsException, TwoFactorAuthenticationException;

    /**
     * Authenticate a spigot user
     *
     * @param username                      Username or Email address
     * @param password                      Password
     * @param twoFactorAuthenticationSecret Two factory authentication BASE 64 secret
     * @return Authenticated Spigot user
     */
    User authenticate(String username, String password, String twoFactorAuthenticationSecret)
            throws InvalidCredentialsException, TwoFactorAuthenticationException;

    /**
     * Log off a spigot user
     *
     * @param user Authenticated Spigot user
     */
    void logOff(User user);

    /**
     * Check if the user is logged in
     *
     * @param user User to check
     * @return logged in boolean
     */
    boolean isLoggedIn(User user);

    /**
     * Get user ranks
     *
     * @return List of {@link be.maximvdw.spigotsite.api.user.UserRank}
     */
    List<UserRank> getUserRanks();

    /**
     * Get users by rank
     *
     * @param rank
     * @return List of {@link be.maximvdw.spigotsite.api.user.User}
     */
    List<User> getUsersByRank(UserRank rank);

    /**
     * Get online members
     *
     * @return List of members
     */
    List<User> getOnlineUsers();
}
