package Shop.service;

public class Main {
	public static void main(String[] args) {
		Shopservice obj1 = Shopservice.getInstance();
		Shopservice obj2 = Shopservice.getInstance();
		
		if(obj1==obj2) {
			System.out.println("���� ShopService ��ü�Դϴ�.");
		}else {
			System.out.println("�ٸ� ShopService ��ü�Դϴ�.");
		}
	}

}
