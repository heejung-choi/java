package day9;

class Book{
	String title;
	String author;
	private int price;
	
	Book(){	
		this("�ڹ��� ����","���ü�",-30000);
	}
	Book(String title, String autor, int price){
	this.title= title;
	this.author= autor;
	if(price<0)
		//���� �߻�
		this.price= -price;	
	else
		this.price= price;	
	}
	void setPrice(int price) {
		if(price<0)
			//���� �߻�
			this.price= -price;	
		else
			this.price= price;	
	}
	String getBookInfo() {
		return "å�̸�:"+title+" å ����:"+author+" ����:"+price;
	}	
	}
public class BookTest {
	public static void main(String[] args) {
		Book book = new Book("�ڹ��� ��","���ü�",-333333);		
		book.setPrice(-300000);
		
		
		
		System.out.println(book.getBookInfo());
	}
}
