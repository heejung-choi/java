package day3;

public class ForTest5 {

	public static void main(String[] args) {
		//1���� 10������ ���ڿ� ���Ͽ� �ش� ���ڰ��� �ش� ������ �������� ������� ����غ���.
		
		
		for(int n=10; n>=1; n--) 
		System.out.println(n+":"+n*n);
		System.out.println("------------------------");
		// 10���� 20������ ���ڿ� ���Ͽ� 3�� �����ϸ鼭 ���ڰ��� �ش� ������ �������� ������� ����غ���
		for(int n=10; n<=20; n+=3) //�ʱ�İ� �������� ���� ������ �ۼ��� �� �ִ�. 
			System.out.println(n+":"+n*n);
			System.out.println("------------------------");
		

	}

}
