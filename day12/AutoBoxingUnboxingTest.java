package day12;
public class AutoBoxingUnboxingTest {
	public static void main(String[] args) {
		Integer obj = new Integer(10);
		obj = 100;  // �⺻ --> ��ü - ����ڽ�
		int result = obj + 10; // ��ü --> �⺻ - �����ڽ�
		System.out.println(result);
	}
}
