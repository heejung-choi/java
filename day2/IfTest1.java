package day2;

public class IfTest1 {

	public static void main(String[] args) {
	
	int num = (int)(Math.random()*10);
	if(num % 2 == 0)
		// �񱳽� ��, �����϶� ������ ������ ����ϰ� ������ if���̶�� ����� ����Ѵ�.
		System.out.println(num + " : ¦��");
	else
		System.out.println(num + " : Ȧ��"); 

	}

}
