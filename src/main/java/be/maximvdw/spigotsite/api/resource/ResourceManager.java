package be.maximvdw.spigotsite.api.resource;

import java.util.List;

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
	 * @param resourceid
	 *            Resource identifier
	 * @return Spigot Resource
	 */
	public Resource getResourceById(int resourceid);

	/**
	 * Get a list of {@link be.maximvdw.spigotsite.api.resource.Resource} from a
	 * {@link be.maximvdw.spigotsite.api.user.User}
	 * 
	 * @param user
	 *            {@link be.maximvdw.spigotsite.api.user.User}
	 * @return List of {@link be.maximvdw.spigotsite.api.resource.Resource}
	 */
	public List<Resource> getResourcesByUser(User user);

	/**
	 * Get a list of {@link be.maximvdw.spigotsite.api.resource.Resource} from a
	 * {@link be.maximvdw.spigotsite.api.user.User}
	 * 
	 * @param id
	 *            User identifier
	 * @return List of {@link be.maximvdw.spigotsite.api.resource.Resource}
	 */
	public List<Resource> getResourcesByUser(int id);

	/**
	 * Get a list of {@link be.maximvdw.spigotsite.api.resource.Resource} bought
	 * by a {@link be.maximvdw.spigotsite.api.user.User}
	 * 
	 * @param user
	 *            Authenticated {@link be.maximvdw.spigotsite.api.user.User}
	 * @return List of {@link be.maximvdw.spigotsite.api.resource.Resource}
	 */
	public List<Resource> getPurchasedResources(User user);

	/**
	 * Get resource categories on spigot
	 * 
	 * @return List of
	 *         {@link be.maximvdw.spigotsite.api.resource.ResourceCategory}
	 */
	public List<ResourceCategory> getResourceCategories();

	/**
	 * Get {@link be.maximvdw.spigotsite.api.resource.ResourceCategory} by
	 * identifier
	 * 
	 * @param id
	 *            Resource Category identifier
	 * @return Resource Category
	 */
	public ResourceCategory getResourceCategoryById(int id);

	/**
	 * Get all resources from a specific category
	 * 
	 * @param category
	 *            List of {@link be.maximvdw.spigotsite.api.resource.Resource}
	 * @return
	 */
	public List<Resource> getResourcesByCategory(ResourceCategory category);

	/**
	 * Get the last version of a resource
	 * 
	 * @param resourceid
	 *            Resource identifier
	 * @return Version string
	 */
	public String getLastVersion(int resourceid);

	/**
	 * Get premium resource buyers
	 * 
	 * @param resource
	 *            Premium resource
	 * @param user
	 *            The authenticated author of the plugin
	 * @return List of {@link be.maximvdw.spigotsite.api.user.User}
	 */
	public List<User> getPremiumResourceBuyers(PremiumResource resource,
			User user);

	/**
	 * Add a buyer to a spigot premium resource
	 * 
	 * @param resource
	 *            Premium resource
	 * @param user
	 *            The authenticated plugin author
	 * @param buyer
	 *            The buyer
	 */
	public void addBuyer(PremiumResource resource, User user, User buyer);

	/**
	 * Add a buyer to a spigot premium resource
	 * 
	 * @param resource
	 *            Premium resource
	 * @param user
	 *            The authenticated plugin author
	 * @param userid
	 *            User identifier
	 */
	public void addBuyer(PremiumResource resource, User user, int userid);

	/**
	 * Add a buyer to a spigot premium resource
	 * 
	 * @param resource
	 *            Premium resource
	 * @param user
	 *            The authenticated plugin author
	 * @param username
	 *            The text username
	 */
	public void addBuyer(PremiumResource resource, User user, String username);

	/**
	 * Add a buyer to a spigot premium resource
	 * 
	 * @param resource
	 *            Premium resource
	 * @param user
	 *            The authenticated plugin author
	 * @param buyers
	 *            A list of buyers
	 */
	public void addBuyers(PremiumResource resource, User user, List<User> buyers);

	/**
	 * Add a buyer to a spigot premium resource
	 * 
	 * @param resource
	 *            Premium resource
	 * @param user
	 *            The authenticated plugin author
	 * @param usernames
	 *            A list of usernames
	 */
	public void addBuyers(PremiumResource resource, User user,
			String[] usernames);
}
