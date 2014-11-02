package be.maximvdw.spigotsiteapi;

public final class SpigotSite {
	/* Spigot Site API */
	private static SpigotSiteAPI api = null;

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
}
