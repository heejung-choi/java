package day4;

public class CharacterTest1 {
	public static void main(String[] args) {
	char v1 = 65;
	char v2 = 'A'; //ASCII
	//�����Ϸ��� �˰��ִ°��� ������� �Ѵ�. �׷��� 'A'��� ���ϰ� A��� �ϸ� ������ ����.
	char v3 = 0x41;//��(��)����
	char v4 = '\u0041';//�����ڵ�
	System.out.println(v1);
	System.out.println(v2);
	System.out.println(v3);
	System.out.println(v4);
	int v5 = 65;
	int v6 = 'A';
	int v7 = 0x41;
	int v8 = '\u0041'; 
	System.out.println(v5);
	System.out.println(v6);
	System.out.println(v7);
	System.out.println(v8);
	
	System.out.println((char)(v1+1)); // Ÿ�Ը�
	System.out.println((char)(v2+1));
	System.out.println((char)(v3+1));
	System.out.println((char)(v4+1));
	
	System.out.println(++v1); //++�� Ÿ���� �״�� �����Ѵ�.
	System.out.println(++v2);
	System.out.println(++v3);
	System.out.println(++v4);
	
	System.out.println(v1+=10);
	}
}
