package Shop.service;

public class Shopservice {
	private static Shopservice s1 = new Shopservice();
	
	
	private Shopservice() {}
	
	
	public static Shopservice getInstance() {
		return s1;
	}

}
