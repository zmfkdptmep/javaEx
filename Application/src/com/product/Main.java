package com.product;

public class Main {
	public static void main(String[] args) {
		
		Product p1 = new Product("ssgnote9","갤럭시 노트9","경기도 수원",960000,10.0);
		Product p2 = new Product("lgnote5","LG스마트폰5","경기도 평택",780000,0.7);
		Product p3 = new Product("ktsnote3","KT스마트폰3","서울시 강남",250000,0.3);
		// 객체 3개 생성
		
		System.out.println(p1.information());
		System.out.println(p2.information());
		System.out.println(p3.information());
		System.out.println("==================");
		// 각 객체의 필드를 information 메소드를 통해 출력
		
		p1.setPrice(1200000);
		p1.setTax(0.05);
		p2.setPrice(1200000);
		p2.setTax(0.05);
		p3.setPrice(1200000);
		p3.setTax(0.05);
		// 각 객체의 set 메소드를 호출해
		// price = 1200000, tax = 0.05로 변경
		
		System.out.println(p1.information());
		System.out.println(p2.information());
		System.out.println(p3.information());
		System.out.println("==================");
		// 바뀐 객체의 필드를 출력
		
		p1.setPrice(p1.getPrice()+(int)(p1.getPrice()*p1.getTax()));
		p2.setPrice(p2.getPrice()+(int)(p2.getPrice()*p2.getTax()));
		p3.setPrice(p3.getPrice()+(int)(p3.getPrice()*p3.getTax()));
		// price+(price*tax)로 부가세 포함 실제 가격으로 변경 
		
		System.out.println("상품명 = "+p1.getName());
		System.out.println("부가세 포함 가격 = "+p1.getPrice());
		System.out.println("상품명 = "+p2.getName());
		System.out.println("부가세 포함 가격 = "+p2.getPrice());
		System.out.println("상품명 = "+p3.getName());
		System.out.println("부가세 포함 가격 = "+p3.getPrice());
		// 기기의 이름과 실제 가격 출력
	}

}
