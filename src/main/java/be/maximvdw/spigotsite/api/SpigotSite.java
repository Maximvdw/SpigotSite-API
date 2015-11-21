package be.maximvdw.spigotsite.api;

public final class SpigotSite {
	/* Spigot Site API */
	private static SpigotSiteAPI api = null;
	/* Spigot Site API Version */
	private static String version = "0.0.4-SNAPSHOT";

	/**
	 * Get spigot site API
	 * 
	 * @return Spigot site API
	 */
	public static SpigotSiteAPI getAPI() {
		return api;
	}

	/**
	 * Set spigot site API
	 * 
	 * @param api
	 *            Spigot site API
	 */
	public static void setAPI(SpigotSiteAPI api) {
		SpigotSite.api = api;
	}

	/**
	 * Get spigot site API version
	 * 
	 * @return API version
	 */
	public static String getVersion() {
		return version;
	}
}
