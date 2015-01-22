package be.maximvdw.spigotsite.api.resource;

import java.util.List;

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
	public double getPrice();

	/**
	 * Set resource price
	 * 
	 * @param price
	 *            Price
	 */
	public void setPrice(double price);

	/**
	 * Get resource price currency
	 * 
	 * @return Price currency
	 */
	public String getPriceCurrency();

	/**
	 * Set resource price currency
	 * 
	 * @param currency
	 *            Price currency
	 */
	public void setPriceCurrency(String currency);

	/**
	 * Get premium resource buyers
	 * 
	 * @return Resource buyers
	 */
	public List<User> getBuyers();

	/**
	 * Add a buyer to a spigot premium resource
	 * 
	 * @param user
	 *            The authenticated plugin author
	 * @param buyer
	 *            The buyer
	 */
	public void addBuyer(User user, User buyer);

	/**
	 * Add a buyer to a spigot premium resource
	 * 
	 * @param user
	 *            The authenticated plugin author
	 * @param userid
	 *            User identifier
	 */
	public void addBuyer(User user, int userid);

	/**
	 * Add a buyer to a spigot premium resource
	 * 
	 * @param user
	 *            The authenticated plugin author
	 * @param username
	 *            The text username
	 */
	public void addBuyer(User user, String username);

	/**
	 * Add a buyer to a spigot premium resource
	 * 
	 * @param user
	 *            The authenticated plugin author
	 * @param buyers
	 *            A list of buyers
	 */
	public void addBuyers(User user, List<User> buyers);

	/**
	 * Add a buyer to a spigot premium resource
	 * 
	 * @param user
	 *            The authenticated plugin author
	 * @param usernames
	 *            A list of usernames
	 */
	public void addBuyers(User user, String[] usernames);
}
