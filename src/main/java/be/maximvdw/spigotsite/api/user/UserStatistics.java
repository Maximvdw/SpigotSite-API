package be.maximvdw.spigotsite.api.user;

import java.util.Date;

public interface UserStatistics {
	/**
	 * Get join date on the site
	 * 
	 * @return Join date
	 */
	public Date getJoinDate();

	/**
	 * Get forum post count
	 * 
	 * @return Post count
	 */
	public int getPostCount();
}
