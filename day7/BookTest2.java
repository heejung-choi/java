package day7;

class Book2{
	String title;
	String author;
	int price;
	
	Book2(){
		/*title="�ڹ��� ����";
		author="���� ��";
		price= 30000;*/
		this("�ڹ��� ����","���ü�",30000);
	}
	Book2(String title, String autor, int price){
	this.title= title;//this�� java�� �����ϰ� �ִ� ���ͷ��̴�. �ڱ��ڽ��� �����ϴ� ���ͷ�
	//this�� ����� �ΰ��� �ִ�.
	this.author= autor;
	this.price= price;
	
	}
	String getBookInfo() {
		return "å�̸�:"+title+" å ����:"+author+" ����:"+price;
	}	
	}
public class BookTest2 {
	public static void main(String[] args) {
		Book2 p1 = new Book2();
		System.out.println(p1.getBookInfo());
		Book2 p2 = new Book2("R����", "������", 5000);
		System.out.println(p2.getBookInfo());
		Book2 p3 = new Book2("R��", "����", 50000);
		System.out.println(p3.getBookInfo());
		Book2 p4 = new Book2("��", "��", 500);
		System.out.println(p4.getBookInfo());
		Book2 p5 = new Book2("��2", "��2", 5200);
		System.out.println(p5.getBookInfo());
	}
}
