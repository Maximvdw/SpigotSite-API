package be.maximvdw.spigotsite.api.resource;

import be.maximvdw.spigotsite.api.user.SpigotUser;

public interface SpigotResource {
	/**
	 * Get resource identifier
	 * 
	 * @return Resource identifier
	 */
	public int getResourceId();

	/**
	 * Get resource name
	 * 
	 * @return Resource name
	 */
	public String getResourceName();

	/**
	 * Get last resource version
	 * 
	 * @return Resource version
	 */
	public String getLastVersion();

	/**
	 * Get spigot author of resource
	 * 
	 * @return Spigot User
	 */
	public SpigotUser getAuthor();
}
