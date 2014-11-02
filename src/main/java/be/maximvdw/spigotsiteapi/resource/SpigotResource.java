package be.maximvdw.spigotsiteapi.resource;

import be.maximvdw.spigotsiteapi.user.SpigotUser;

public interface SpigotResource {
	/**
	 * Get resource identifier
	 * 
	 * @return Resource identifier
	 */
	public int getResourceId();

	/**
	 * Get spigot author of resource
	 * 
	 * @return Spigot User
	 */
	public SpigotUser getAuthor();
}
