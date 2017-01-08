package be.maximvdw.spigotsite.api.forum;

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
     */
    Forum getForumById(int id);
}
