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
     * @throws ConnectionFailedException Connection to Spigot failed
     */
    Resource getResourceById(int resourceid) throws ConnectionFailedException;

    /**
     * Get a {@link be.maximvdw.spigotsite.api.resource.Resource} by identifier
     *
     * @param resourceid Resource identifier
     * @param user       Authenticated spigot user
     * @return Spigot Resource
     * @throws ConnectionFailedException Connection to Spigot failed
     */
    Resource getResourceById(int resourceid, User user) throws ConnectionFailedException;

    /**
     * Get a list of {@link be.maximvdw.spigotsite.api.resource.Resource} from a
     * {@link be.maximvdw.spigotsite.api.user.User}
     *
     * @param user {@link be.maximvdw.spigotsite.api.user.User}
     * @return List of {@link be.maximvdw.spigotsite.api.resource.Resource}
     * @throws ConnectionFailedException Connection to Spigot failed
     */
    List<Resource> getResourcesByUser(User user) throws ConnectionFailedException;

    /**
     * Get new resources since last resource id
     * @param lastResourceId last resource id
     * @return list of resources
     * @throws ConnectionFailedException
     */
    List<Resource> getNewResources(int lastResourceId) throws ConnectionFailedException;

    /**
     * Get a list of {@link be.maximvdw.spigotsite.api.resource.Resource} from a
     * {@link be.maximvdw.spigotsite.api.user.User}
     *
     * @param user         {@link be.maximvdw.spigotsite.api.user.User}
     * @param loggedInUser {@link be.maximvdw.spigotsite.api.user.User} used to get hidden plugins
     * @return List of {@link be.maximvdw.spigotsite.api.resource.Resource}
     * @throws ConnectionFailedException Connection to Spigot failed
     */
    List<Resource> getResourcesByUser(User user, User loggedInUser) throws ConnectionFailedException;

    /**
     * Get a list of {@link be.maximvdw.spigotsite.api.resource.Resource} from a
     * {@link be.maximvdw.spigotsite.api.user.User}
     *
     * @param id User identifier
     * @return List of {@link be.maximvdw.spigotsite.api.resource.Resource}
     * @throws ConnectionFailedException Connection to Spigot failed
     */
    List<Resource> getResourcesByUser(int id) throws ConnectionFailedException;

    /**
     * Get a list of {@link be.maximvdw.spigotsite.api.resource.Resource} from a
     * {@link be.maximvdw.spigotsite.api.user.User}
     *
     * @param id           User identifier
     * @param loggedInUser {@link be.maximvdw.spigotsite.api.user.User} used to get hidden plugins
     * @return List of {@link be.maximvdw.spigotsite.api.resource.Resource}
     * @throws ConnectionFailedException Connection to Spigot failed
     */
    List<Resource> getResourcesByUser(int id, User loggedInUser) throws ConnectionFailedException;

    /**
     * Get a list of {@link be.maximvdw.spigotsite.api.resource.Resource} bought
     * by a {@link be.maximvdw.spigotsite.api.user.User}
     *
     * @param user Authenticated {@link be.maximvdw.spigotsite.api.user.User}
     * @return List of {@link be.maximvdw.spigotsite.api.resource.Resource}
     * @throws ConnectionFailedException Connection to Spigot failed
     */
    List<Resource> getPurchasedResources(User user)
            throws ConnectionFailedException;

    /**
     * Get resource categories on spigot
     *
     * @return List of
     * {@link be.maximvdw.spigotsite.api.resource.ResourceCategory}
     * @throws ConnectionFailedException Connection to Spigot failed
     */
    List<ResourceCategory> getResourceCategories() throws ConnectionFailedException;

    /**
     * Get {@link be.maximvdw.spigotsite.api.resource.ResourceCategory} by
     * identifier
     *
     * @param id Resource Category identifier
     * @return Resource Category
     * @throws ConnectionFailedException Connection to Spigot failed
     */
    ResourceCategory getResourceCategoryById(int id) throws ConnectionFailedException;

    /**
     * Get all resources from a specific category
     *
     * @param category List of {@link be.maximvdw.spigotsite.api.resource.Resource}
     * @return
     * @throws ConnectionFailedException Connection to Spigot failed
     */
    List<Resource> getResourcesByCategory(ResourceCategory category) throws ConnectionFailedException;

    /**
     * Get the last version of a resource
     *
     * @param resourceid Resource identifier
     * @return Version string
     * @throws ConnectionFailedException Connection to Spigot failed
     */
    String getLastVersion(int resourceid) throws ConnectionFailedException;

    /**
     * Get premium resource buyers
     *
     * @param resource Premium resource
     * @param user     The authenticated author of the plugin
     * @return List of {@link be.maximvdw.spigotsite.api.resource.Buyer}
     * @throws ConnectionFailedException Connection to Spigot failed
     */
    List<Buyer> getPremiumResourceBuyers(PremiumResource resource,
                                        User user) throws ConnectionFailedException;

    /**
     * Add a buyer to a spigot premium resource
     *
     * @param resource Premium resource
     * @param user     The authenticated plugin author
     * @param buyer    The buyer
     * @throws ConnectionFailedException Connection to Spigot failed
     */
    void addBuyer(PremiumResource resource, User user, User buyer) throws ConnectionFailedException;

    /**
     * Add a buyer to a spigot premium resource
     *
     * @param resource Premium resource
     * @param user     The authenticated plugin author
     * @param userid   User identifier
     * @throws ConnectionFailedException Connection to Spigot failed
     */
    void addBuyer(PremiumResource resource, User user, int userid) throws ConnectionFailedException;

    /**
     * Add a buyer to a spigot premium resource
     *
     * @param resource Premium resource
     * @param user     The authenticated plugin author
     * @param username The text username
     * @throws ConnectionFailedException Connection to Spigot failed
     */
    void addBuyer(PremiumResource resource, User user, String username) throws ConnectionFailedException;

    /**
     * Add a buyer to a spigot premium resource
     *
     * @param resource Premium resource
     * @param user     The authenticated plugin author
     * @param buyers   A list of buyers
     * @throws ConnectionFailedException Connection to Spigot failed
     */
    void addBuyers(PremiumResource resource, User user, List<User> buyers) throws ConnectionFailedException;

    /**
     * Add a buyer to a spigot premium resource
     *
     * @param resource  Premium resource
     * @param user      The authenticated plugin author
     * @param usernames A list of usernames
     * @throws ConnectionFailedException Connection to Spigot failed
     */
    void addBuyers(PremiumResource resource, User user,
                   String[] usernames) throws ConnectionFailedException;

    /**
     * Remove a buyer from a spigot premium resource
     *
     * @param resource Premium resource
     * @param user     The authenticated plugin author
     * @param buyer    Buyer to remove
     * @throws ConnectionFailedException Connection to Spigot failed
     */
    void removeBuyer(PremiumResource resource, User user, int buyer) throws ConnectionFailedException;
}