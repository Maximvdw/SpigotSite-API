package be.maximvdw.spigotsite.api.resource;

import java.util.List;

import be.maximvdw.spigotsite.api.user.User;

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
	 * @return List of {@link be.maximvdw.spigotsite.api.resoure.Resource}
	 */
	public List<Resource> getResourcesByUser(User user);

	/**
	 * Get a list of {@link be.maximvdw.spigotsite.api.resource.Resource} bought
	 * by a {@link be.maximvdw.spigotsite.api.user.User}
	 * 
	 * @param user
	 *            {@link be.maximvdw.spigotsite.api.user.User}
	 * @return List of {@link be.maximvdw.spigotsite.api.resoure.Resource}
	 */
	public List<Resource> getBoughtResources(User user);

	/**
	 * Get resource categories on spigot
	 * 
	 * @return List of
	 *         {@link be.maximvdw.spigotsite.api.resource.ResourceCategory}
	 */
	public List<ResourceCategory> getResourceCategories();
}
