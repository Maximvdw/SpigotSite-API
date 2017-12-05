package be.maximvdw.spigotsite.api.resource;

import java.util.List;

import be.maximvdw.spigotsite.api.exceptions.ConnectionFailedException;
import be.maximvdw.spigotsite.api.user.User;

/**
 * Spigot Premium Resource
 *
 * @author Maxim Van de Wynckel
 */
public interface PremiumResource extends Resource {
    /**
     * Get resource price
     *
     * @return Price
     */
    double getPrice();

    /**
     * Set resource price
     *
     * @param price Price
     */
    void setPrice(double price);

    /**
     * Get resource price currency
     *
     * @return Price currency
     */
    String getPriceCurrency();

    /**
     * Set resource price currency
     *
     * @param currency Price currency
     */
    void setPriceCurrency(String currency);

    /**
     * Get premium resource buyers
     *
     * @return Resource buyers
     */
    List<Buyer> getBuyers();

    /**
     * Add a buyer to a spigot premium resource
     *
     * @param user  The authenticated plugin author
     * @param buyer The buyer
     */
    void addBuyer(User user, User buyer) throws ConnectionFailedException;

    /**
     * Add a buyer to a spigot premium resource
     *
     * @param user   The authenticated plugin author
     * @param userid User identifier
     */
    void addBuyer(User user, int userid) throws ConnectionFailedException;

    /**
     * Add a buyer to a spigot premium resource
     *
     * @param user     The authenticated plugin author
     * @param username The text username
     */
    void addBuyer(User user, String username) throws ConnectionFailedException;

    /**
     * Add a buyer to a spigot premium resource
     *
     * @param user   The authenticated plugin author
     * @param buyers A list of buyers
     */
    void addBuyers(User user, List<User> buyers) throws ConnectionFailedException;

    /**
     * Add a buyer to a spigot premium resource
     *
     * @param user      The authenticated plugin author
     * @param usernames A list of usernames
     */
    void addBuyers(User user, String[] usernames) throws ConnectionFailedException;

    /**
     * Check if a specific user is a buyer
     *
     * @param user User is buyer
     * @return is buyer
     */
    boolean isBuyer(User user);

    /**
     * Get buyer by name
     *
     * @param name buyer name
     * @return buyer
     */
    Buyer getBuyerByName(String name);

    /**
     * Get buyer by id
     *
     * @param id id
     * @return buyer
     */
    Buyer getBuyerByUserId(int id);
}
