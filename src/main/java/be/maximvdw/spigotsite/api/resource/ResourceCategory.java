package be.maximvdw.spigotsite.api.resource;

import java.util.List;

/**
 * Spigot Resource Category
 * 
 * @author Maxim Van de Wynckel
 */
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

	/**
	 * Get amount of resources
	 * 
	 * @return Resources count
	 */
	public int getResourceCount();
}
