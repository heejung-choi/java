package day1;

public class VariableTest {
	public static void main(String[] args) {
		System.out.println(1+2+3+4+5+10); //25
		System.out.println(1+2+3+4+5-10); //5
		System.out.println(1+2+3+4+5*10); //60
		System.out.println((1+2+3+4+5)*10); //���������ڰ� �켱�������� ��ȣ�� ���� �켱������ ������ �� �ִ�.
		System.out.println(1+2+3+4+5/10); //10 : 5������ 10�� ���� 0�̱� ������ 0
		
		System.out.println("-------");
		int result = 1+2+3+4+5; //result :������� �Ѵ�. 12345�� ���ͳ��̶�� �Ѵ�.
		System.out.println(result+10);
		System.out.println(result-10);
		System.out.println(result*10);
		System.out.println(result/10);
		
		char munja = 'A'; //0x41 //���ھտ� ox�� �پ������� 16���� 
		System.out.println(""+munja+ munja); //65+65=130 //"" �ι��ڿ�
	}
}
