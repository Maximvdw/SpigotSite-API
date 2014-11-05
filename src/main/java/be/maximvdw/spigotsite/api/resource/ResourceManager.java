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
}
