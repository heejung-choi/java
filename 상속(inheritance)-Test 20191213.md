# 상속(inheritance)-Test 20191213.md

## Test 1-   ABCTest 

```java
package day9;

class A{
	A(){
		System.out.println("A클래스를 객체 생성합니다.");
	}
}
class B extends A{
	B(int num){//생성자 메서드 이름은 클래스와 같아야 한다.
		//B(int num)으로 하면 C에서 오류가 난다. 이럴 경우 super로 조상에 알맞는 생성자를 만들어줘야 한다.
		System.out.println("B클래스를 객체 생성합니다.");
	}
}
class C extends B{
	C(){
		super(100);
		System.out.println("C클래스를 객체 생성합니다.");
		//super(100); 첫번째로 안하고 마지막으로 하면 오류가 난다.
	}
}

public class ABCTest {

	public static void main(String[] args) {
	new C();

	}

}
```

## Test 2- BookTest

```java
package day9;

class Book{
	String title;
	String author;
	private int price;
	
	Book(){	
		this("자바의 정석","남궁성",-30000);
	}
	Book(String title, String autor, int price){
	this.title= title;
	this.author= autor;
	if(price<0)
		//오류 발생
		this.price= -price;	
	else
		this.price= price;	
	}
	void setPrice(int price) {
		if(price<0)
			//오류 발생
			this.price= -price;	
		else
			this.price= price;	
	}
	String getBookInfo() {
		return "책이름:"+title+" 책 저자:"+author+" 가격:"+price;
	}	
	}
public class BookTest {
	public static void main(String[] args) {
		Book book = new Book("자바의 정","남궁성",-333333);		
		book.setPrice(-300000);
		
		
		
		System.out.println(book.getBookInfo());
	}
}

```

## Test 3-  PointTest

```java
package day9;
public class PointTest {
	public static void main(String args[]) {
		Point3D p3 = new Point3D(1,2,3);	
		System.out.println(p3.getLocation());
	}
}
class Point {
	int x;	
	int y;
	Point(int x, int y) {//아규먼트 안받고 있는 애를 호출한다.
		this.x = x;
		this.y = y;
	}
	String getLocation() {
		return "x :" + x + ", y :"+ y;
	}
}
class Point3D extends Point {
	int z;
	Point3D(int x, int y, int z) {	
		super(x,y);
		//this.x = x;
		//this.y = y;
		this.z = z;
	}
	String getLocation() {	// 오버라이딩 :조상과 똑같은 시그니처를 가진 메소드를 생성했다.
		return super.getLocation() + ", z :" + z;
	}	
}
```

