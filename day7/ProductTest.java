package day7;

class Product {
	String name;
	int balance;
	int price;

	Product() {
		this("듀크인형", 5, 10000);
	}

	Product(String name, int balance, int price) {
		this.name = name;
		this.balance = balance;
		this.price = price;
	}
	String getName() {
		return name;
	}
	int getBalance() {
		return balance;
	}
	int getPrice() {
		return price;
	}
}

public class ProductTest {
	public static void main(String[] args) {
		Product[] p = new Product[5];
		p[0] = new Product();
		p[1] = new Product("어피치", 35, 15000);
		p[2] = new Product("라이언", 10, 50000);
		p[3] = new Product("푸들", 15, 9000);
		p[4] = new Product("스피츠", 25, 7000);

		for (int i = 0; i < p.length; i++)
			// System.out.println("상품명:"+p[i].getName()+" 재고량:"+p[i].getBalance()+"
			// 가격:"+p[i].getPrice());
			System.out.printf("상품명 : %s, 재고량 : %d, 가격 : %d \n", p[i].getName(), p[i].getBalance(), p[i].getPrice());
	}
}
