package be.maximvdw.spigotsite.api.user;

import java.util.List;

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
	public int getUserId();

	/**
	 * Get spigot username
	 * 
	 * @return Spigot username
	 */
	public String getUsername();

	/**
	 * Get purchased resources
	 * 
	 * @return List of {@link be.maximvdw.spigotsite.api.resource.Resource}
	 */
	public List<Resource> getPurchasedResources();

	/**
	 * Get created resources
	 * 
	 * @return List of {@link be.maximvdw.spigotsite.api.resource.Resource}
	 */
	public List<Resource> getCreatedResources();
}
