# Object-Lab 20191211

## 1번 문제

![image-20191211173217297](C:\Users\student\AppData\Roaming\Typora\typora-user-images\image-20191211173217297.png)



## 1번 답안

```java
package day7;

class Member {
	String name;
	String account;
	String passwd;
	int birthyear;
	Member(String p1, String p2, String p3, int p4) {
		name = p1;
		account = p2;
		passwd = p3;
		birthyear = p4;
	}
	void ID(int num) {
		System.out.println("회원" + num + ": " + name + "(" + account + "," + passwd + "," + birthyear + ")");
	}
}
public class MemberTest {
	public static void main(String[] args) {
		Member st1 = new Member("최희정", "hj", "hj1008", 1995);
		st1.ID(1);
		Member st2 = new Member("최아람", "ar", "ar0330", 1994);
		st2.ID(2);
		Member st3 = new Member("최유정", "yj", "yj1008", 2001);
		st3.ID(3);
	}
}

```



## 2번 문제

![image-20191211173440568](C:\Users\student\AppData\Roaming\Typora\typora-user-images\image-20191211173440568.png)

## 2번 답안

```java
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

```

## 2번 모범답안

```java
package day7;

class Book2{
	String title;
	String author;
	int price;
	
	Book2(){
		/*title="자바의 정석";
		author="남궁 성";
		price= 30000;*/
		this("자바의 정석","남궁성",30000);
	}
	Book2(String title, String autor, int price){
	this.title= title;//this란 java가 내장하고 있는 리터럴이다. 자기자신을 참조하는 리터럴
	//this는 용법이 두가지 있다.
	this.author= autor;
	this.price= price;
	
	}
	String getBookInfo() {
		return "책이름:"+title+" 책 저자:"+author+" 가격:"+price;
	}	
	}
public class BookTest2 {
	public static void main(String[] args) {
		Book2 p1 = new Book2();
		System.out.println(p1.getBookInfo());
		Book2 p2 = new Book2("R정복", "양현준", 5000);
		System.out.println(p2.getBookInfo());
		Book2 p3 = new Book2("R복", "양준", 50000);
		System.out.println(p3.getBookInfo());
		Book2 p4 = new Book2("복", "준", 500);
		System.out.println(p4.getBookInfo());
		Book2 p5 = new Book2("복2", "준2", 5200);
		System.out.println(p5.getBookInfo());
	}
}

```

## 3번 문제

![image-20191211173538061](C:\Users\student\AppData\Roaming\Typora\typora-user-images\image-20191211173538061.png)

## 3번 답안

```java
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

```

