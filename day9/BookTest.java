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
