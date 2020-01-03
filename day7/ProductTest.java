package day7;

class Product {
	String name;
	int balance;
	int price;

	Product() {
		this("��ũ����", 5, 10000);
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
		p[1] = new Product("����ġ", 35, 15000);
		p[2] = new Product("���̾�", 10, 50000);
		p[3] = new Product("Ǫ��", 15, 9000);
		p[4] = new Product("������", 25, 7000);

		for (int i = 0; i < p.length; i++)
			// System.out.println("��ǰ��:"+p[i].getName()+" ���:"+p[i].getBalance()+"
			// ����:"+p[i].getPrice());
			System.out.printf("��ǰ�� : %s, ��� : %d, ���� : %d \n", p[i].getName(), p[i].getBalance(), p[i].getPrice());
	}
}
