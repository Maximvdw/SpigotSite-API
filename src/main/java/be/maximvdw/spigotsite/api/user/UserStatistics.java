package be.maximvdw.spigotsite.api.user;

import java.util.Date;

public interface UserStatistics {
	/**
	 * Get join date on the site
	 * 
	 * @return Join date
	 */
	Date getJoinDate();

	/**
	 * Get forum post count
	 * 
	 * @return Post count
	 */
	int getPostCount();
}
