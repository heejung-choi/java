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
