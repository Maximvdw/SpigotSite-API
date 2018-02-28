package be.maximvdw.spigotsite.api.forum;

import be.maximvdw.spigotsite.api.user.User;

import java.util.Date;

/**
 * ProfilePost
 * Created by Maxim on 28/02/2018.
 */
public interface ProfilePost {
    /**
     * Get the author of the post
     *
     * @return Spigot User
     */
    User getAuthor();

    /**
     * Get post date
     *
     * @return post date
     */
    Date getPostDate();

    /**
     * Get profile message
     *
     * @return profile message
     */
    String getMessage();
}
