package day8;

public class CardTest{
	public static void main(String args[]) throws Exception{	
		System.out.println("CardTest ������ ���۾����ϴ�.");
		Thread.sleep(10000);//10000�� �ָ� ���α׷��� 10�ʰ� ����ض� ��� �ǹ��̴�.
		Card c1 = new Card();		
		c1.kind = "Heart";
		c1.number = 7;	
		System.out.println("ù ��° Card ��ü�� ������");
		Thread.sleep(10000);
		Card c2 = new Card();		
		c2.kind = "Spade";
		c2.number = 4;
		System.out.println("�� ��° Card ��ü�� ������");
		Thread.sleep(5000);
		System.out.println("c1�� " + c1.kind + ", " + c1.number 
				+ "�̸�, ũ��� (" + Card.width + ", " + Card.height + ")");
		System.out.println("c2�� " + c2.kind + ", " + c2.number
				+ "�̸�, ũ��� (" +Card.width + ", " + Card.height + ")");	
		Card.width = 50;
		Card.height = 80;
		System.out.println("c1�� " + c1.kind + ", " + c1.number 
				+ "�̸�, ũ��� (" + Card.width + ", " + Card.height + ")" );
		System.out.println("c2�� " + c2.kind + ", " + c2.number 
				+ "�̸�, ũ��� (" +Card.width + ", " +Card.height + ")" );
	}
}




