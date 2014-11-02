package be.maximvdw.spigotsite.api.resource;

import be.maximvdw.spigotsite.api.user.User;

public interface Resource {
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
	 * Set resource name
	 * 
	 * @param name
	 *            Resource name
	 */
	public void setResourceName(String name);

	/**
	 * Get last resource version
	 * 
	 * @return Resource version
	 */
	public String getLastVersion();

	/**
	 * Set last resource version
	 * 
	 * @param version
	 *            Resource version
	 */
	public void setLastVersion(String version);

	/**
	 * Get spigot author of resource
	 * 
	 * @return Spigot User
	 */
	public User getAuthor();
}
