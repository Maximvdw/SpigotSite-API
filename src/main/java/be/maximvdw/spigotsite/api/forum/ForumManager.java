package be.maximvdw.spigotsite.api.forum;

import be.maximvdw.spigotsite.api.exceptions.ConnectionFailedException;

/**
 * Spigot forum manager
 *
 * @author Maxim Van de Wynckel
 */
public interface ForumManager {
    /**
     * Get forum by identifier
     *
     * @param id Forum id
     * @return {@link be.maximvdw.spigotsite.api.forum.Forum}
     * @throws ConnectionFailedException Connection to Spigot failed
     */
    Forum getForumById(int id) throws ConnectionFailedException;
}
