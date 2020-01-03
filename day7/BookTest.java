package day7;

class Book {
	String title = "자바의 정석";
	String author = "남궁성";
	int price = 30000;
}

public class BookTest {
	public static void main(String[] args) {
		Book p1 = new Book();
		Book p2 = new Book();
		Book p3 = new Book();

		System.out.println("책이름:" + p1.title + ", 책저자:" + p2.author + ", 가격:" + p3.price);
		p1.title = "R정복";
		p2.author = "양현준";
		p3.price = 50000;
		;
		System.out.println("책이름:" + p1.title + ", 책저자:" + p2.author + ", 가격:" + p3.price);
		p1.title = "SQL의 활용";
		p2.author = "김남규";
		p3.price = 10000;
		;
		System.out.println("책이름:" + p1.title + ", 책저자:" + p2.author + ", 가격:" + p3.price);
		p1.title = "open api란?";
		p2.author = "김정현";
		p3.price = 70000;
		;
		System.out.println("책이름:" + p1.title + ", 책저자:" + p2.author + ", 가격:" + p3.price);
		p1.title = "프로젝트 관리론";
		p2.author = "이춘열";
		p3.price = 20000;
		;
		System.out.println("책이름:" + p1.title + ", 책저자:" + p2.author + ", 가격:" + p3.price);
	}
}
