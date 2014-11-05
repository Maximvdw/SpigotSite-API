package be.maximvdw.spigotsite.api.forum;

import java.util.List;

/**
 * Spigot forum
 * 
 * @author Maxim Van de Wynckel
 */
public interface Forum {
	/**
	 * Get sub forums
	 * 
	 * @return List of {{@link be.maximvdw.spigotsite.api.forum.Forum}
	 */
	public List<Forum> getSubForums();
}
