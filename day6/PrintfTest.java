package day6;
public class PrintfTest {
	public static void main(String[] args) {// /n�� ����ó�� %n�� ����ó��
		System.out.printf("�׽�Ʈ�Դϴ�\n");		// %n
		System.out.printf("%d %x %o %c\n", 100, 100, 100, 100); 
		//%�� �����ϴ°��� ���˹���(%d:10���� / %x:16���� %o:8���� %c:���ڵ�����
		System.out.printf("%#x %#X %#o\n", 100, 100, 100);
		// x�� �빮�ڷ� ��Ÿ���� ������ �빮��, �ҹ��ڷ� ��Ÿ���� ������ �ҹ��ڷ�
		System.out.printf("%c %c %c %c\n", '��', 'A', '!', '3' );
		System.out.printf("%b\n", true);
		// boolean�� %b
		System.out.printf("%f %e\n", 100.0, 100.0);
		// %f�� �Ҽ��� 6�ڸ�����, %e �������·� ��Ÿ���ش�. 
		System.out.printf("%.2f\n", 123.5678);
		System.out.printf("|%s|\n", "�ڹ�");
		// %s�� �������� ���̿� ���� �˾Ƽ� ����Ѵ�.
		System.out.printf("|%10s|\n", "�ڹ�");
		// �տ� ��ĭ
		System.out.printf("|%-10s|\n", "�ڹ�");
		// �ڿ� ��ĭ
		System.out.printf("%,d��\n", 1000000);
		// 1000�������� �ĸ��� �־�� ��� �ǹ�
		System.out.printf("%s%s%s\n", "java", "C#", "c++");
		System.out.printf("%s %s %s\n", "java", "C#", "c++");
		//��ũ�� �ָ� ��ũ �ظ�ŭ �������. 
		System.out.printf("%10s%s%s\n", "java", "C#", "c++");
	}
}








