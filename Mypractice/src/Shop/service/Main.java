package Shop.service;

public class Main {
	public static void main(String[] args) {
		Shopservice obj1 = Shopservice.getInstance();
		Shopservice obj2 = Shopservice.getInstance();
		
		if(obj1==obj2) {
			System.out.println("같은 ShopService 객체입니다.");
		}else {
			System.out.println("다른 ShopService 객체입니다.");
		}
	}

}
