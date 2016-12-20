package be.maximvdw.spigotsite.api.resource;

import java.util.List;

import be.maximvdw.spigotsite.api.exceptions.ConnectionFailedException;
import be.maximvdw.spigotsite.api.user.User;

/**
 * Spigot Resource Manager
 *
 * @author Maxim Van de Wynckel
 */
public interface ResourceManager {
    /**
     * Get a {@link be.maximvdw.spigotsite.api.resource.Resource} by identifier
     *
     * @param resourceid Resource identifier
     * @return Spigot Resource
     */
    Resource getResourceById(int resourceid);

    /**
     * Get a {@link be.maximvdw.spigotsite.api.resource.Resource} by identifier
     *
     * @param resourceid Resource identifier
     * @param user       Authenticated spigot user
     * @return Spigot Resource
     */
    Resource getResourceById(int resourceid, User user);

    /**
     * Get a list of {@link be.maximvdw.spigotsite.api.resource.Resource} from a
     * {@link be.maximvdw.spigotsite.api.user.User}
     *
     * @param user {@link be.maximvdw.spigotsite.api.user.User}
     * @return List of {@link be.maximvdw.spigotsite.api.resource.Resource}
     */
    List<Resource> getResourcesByUser(User user);

    /**
     * Get a list of {@link be.maximvdw.spigotsite.api.resource.Resource} from a
     * {@link be.maximvdw.spigotsite.api.user.User}
     *
     * @param user         {@link be.maximvdw.spigotsite.api.user.User}
     * @param loggedInUser {@link be.maximvdw.spigotsite.api.user.User} used to get hidden plugins
     * @return List of {@link be.maximvdw.spigotsite.api.resource.Resource}
     */
    List<Resource> getResourcesByUser(User user, User loggedInUser);

    /**
     * Get a list of {@link be.maximvdw.spigotsite.api.resource.Resource} from a
     * {@link be.maximvdw.spigotsite.api.user.User}
     *
     * @param id User identifier
     * @return List of {@link be.maximvdw.spigotsite.api.resource.Resource}
     */
    List<Resource> getResourcesByUser(int id);

    /**
     * Get a list of {@link be.maximvdw.spigotsite.api.resource.Resource} from a
     * {@link be.maximvdw.spigotsite.api.user.User}
     *
     * @param id           User identifier
     * @param loggedInUser {@link be.maximvdw.spigotsite.api.user.User} used to get hidden plugins
     * @return List of {@link be.maximvdw.spigotsite.api.resource.Resource}
     */
    List<Resource> getResourcesByUser(int id, User loggedInUser);

    /**
     * Get a list of {@link be.maximvdw.spigotsite.api.resource.Resource} bought
     * by a {@link be.maximvdw.spigotsite.api.user.User}
     *
     * @param user Authenticated {@link be.maximvdw.spigotsite.api.user.User}
     * @return List of {@link be.maximvdw.spigotsite.api.resource.Resource}
     */
    List<Resource> getPurchasedResources(User user)
            throws ConnectionFailedException;

    /**
     * Get resource categories on spigot
     *
     * @return List of
     * {@link be.maximvdw.spigotsite.api.resource.ResourceCategory}
     */
    List<ResourceCategory> getResourceCategories();

    /**
     * Get {@link be.maximvdw.spigotsite.api.resource.ResourceCategory} by
     * identifier
     *
     * @param id Resource Category identifier
     * @return Resource Category
     */
    ResourceCategory getResourceCategoryById(int id);

    /**
     * Get all resources from a specific category
     *
     * @param category List of {@link be.maximvdw.spigotsite.api.resource.Resource}
     * @return
     */
    List<Resource> getResourcesByCategory(ResourceCategory category);

    /**
     * Get the last version of a resource
     *
     * @param resourceid Resource identifier
     * @return Version string
     */
    String getLastVersion(int resourceid);

    /**
     * Get premium resource buyers
     *
     * @param resource Premium resource
     * @param user     The authenticated author of the plugin
     * @return List of {@link be.maximvdw.spigotsite.api.user.User}
     */
    List<User> getPremiumResourceBuyers(PremiumResource resource,
                                        User user) throws ConnectionFailedException;

    /**
     * Add a buyer to a spigot premium resource
     *
     * @param resource Premium resource
     * @param user     The authenticated plugin author
     * @param buyer    The buyer
     */
    void addBuyer(PremiumResource resource, User user, User buyer);

    /**
     * Add a buyer to a spigot premium resource
     *
     * @param resource Premium resource
     * @param user     The authenticated plugin author
     * @param userid   User identifier
     */
    void addBuyer(PremiumResource resource, User user, int userid);

    /**
     * Add a buyer to a spigot premium resource
     *
     * @param resource Premium resource
     * @param user     The authenticated plugin author
     * @param username The text username
     */
    void addBuyer(PremiumResource resource, User user, String username);

    /**
     * Add a buyer to a spigot premium resource
     *
     * @param resource Premium resource
     * @param user     The authenticated plugin author
     * @param buyers   A list of buyers
     */
    void addBuyers(PremiumResource resource, User user, List<User> buyers);

    /**
     * Add a buyer to a spigot premium resource
     *
     * @param resource  Premium resource
     * @param user      The authenticated plugin author
     * @param usernames A list of usernames
     */
    void addBuyers(PremiumResource resource, User user,
                   String[] usernames);

    /**
     * Remove a buyer from a spigot premium resource
     *
     * @param resource Premium resource
     * @param user     The authenticated plugin author
     * @param buyer     Buyer to remove
     */
    void removeBuyer(PremiumResource resource, User user, int buyer);
}