package be.maximvdw.spigotsite.api.forum;

import java.util.List;

/**
 * Spigot forum category
 * 
 * @author Maxim Van de Wynckel
 */
public interface ForumCategory {
	/**
	 * Get forums inside category
	 * 
	 * @return List of {@link be.maximvdw.spigotsite.api.forum.Forum}
	 */
	List<Forum> getForums();
}
