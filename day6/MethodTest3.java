package day6;

public class MethodTest3 {

	public static void main(String[] args) {
		System.out.println("main() ���� ����");
		printMyName(1,'#');
		System.out.println("------------");
		printMyName(3,'*');
		System.out.println("------------");
		printMyName(2,'@');
		System.out.println("------------");
		//printMyName(1, '%', 10); �Ű������� ������ �޼��带 ȣ���Ҷ� �ϴ� �ƱԸ�Ʈ�� ������ ���ƾ� �ϰ� Ÿ�Ե� ȣȯ�� �Ǿ�� �Ѵ�.
		System.out.println("main() ��������");
	}
	static void printMyName(int num, char deco) {
		for(int i=1; i<=num; i++)
			System.out.println(deco+"������"+deco);
		return;
		
	}

}
