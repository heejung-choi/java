package day7;

class Book {
	String title = "�ڹ��� ����";
	String author = "���ü�";
	int price = 30000;
}

public class BookTest {
	public static void main(String[] args) {
		Book p1 = new Book();
		Book p2 = new Book();
		Book p3 = new Book();

		System.out.println("å�̸�:" + p1.title + ", å����:" + p2.author + ", ����:" + p3.price);
		p1.title = "R����";
		p2.author = "������";
		p3.price = 50000;
		;
		System.out.println("å�̸�:" + p1.title + ", å����:" + p2.author + ", ����:" + p3.price);
		p1.title = "SQL�� Ȱ��";
		p2.author = "�賲��";
		p3.price = 10000;
		;
		System.out.println("å�̸�:" + p1.title + ", å����:" + p2.author + ", ����:" + p3.price);
		p1.title = "open api��?";
		p2.author = "������";
		p3.price = 70000;
		;
		System.out.println("å�̸�:" + p1.title + ", å����:" + p2.author + ", ����:" + p3.price);
		p1.title = "������Ʈ ������";
		p2.author = "���῭";
		p3.price = 20000;
		;
		System.out.println("å�̸�:" + p1.title + ", å����:" + p2.author + ", ����:" + p3.price);
	}
}
