package day14;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StandardInputTest {	
	public static void main(String[] args) throws Exception {
		System.out.print("�Է� : ");
	//	int input = System.in.read();	// �ѱ��ڸ� �о� ����.	, read�� byte ��Ʈ�� ��ü���� 1����Ʈ�� ���� ���̶� �ѱ��� �� �д´�.
	//	int input = new InputStreamReader(System.in).read();	// ---> ��� �ѱ۵� �� �д´�.����
	//	System.out.println("��� : " + (char)input);
		
		String input = new BufferedReader(
				new InputStreamReader(System.in)).readLine();	// ---> �̷��� �ϸ� ���ڿ��� �� �аԵȴ�.
		System.out.println("��� : " + input);
	}
}
