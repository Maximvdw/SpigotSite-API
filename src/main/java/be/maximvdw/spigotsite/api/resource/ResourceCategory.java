package be.maximvdw.spigotsite.api.resource;

import java.util.List;

public interface ResourceCategory {
	/**
	 * Get resource category identifier
	 * 
	 * @return Category Id
	 */
	public int getCategoryId();

	/**
	 * Get spigot resource category name
	 * 
	 * @return Category name
	 */
	public String getCategoryName();

	/**
	 * Get a list of {@link be.maximvdw.spigotsite.api.resource.Resource}
	 * 
	 * @return List of {@link be.maximvdw.spigotsite.api.resource.Resource}
	 */
	public List<Resource> getResources();
}
