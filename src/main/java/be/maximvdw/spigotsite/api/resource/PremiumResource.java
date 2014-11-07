package be.maximvdw.spigotsite.api.resource;

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
}
