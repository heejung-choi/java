package day6;

public class MethodTest4 {

	public static void main(String[] args) {
		System.out.println("main() ���� ����");
		printMyName(3,'*');
		printName("��ũ",'$');//��������ϰ� ������ ���� ȣ�� �ؾ��Ѵ�.
		printName("��ũ",'$');
		printName("��ũ",'$');
		printName("�ν�",'!');		
		System.out.println("main() ��������");
	}
	static void printMyName(int num, char deco) {
		for(int i=1; i<=num; i++)
			System.out.println(deco+"������"+deco);// �����ڿ� Ưȭ�� �޼���
		return;
		
	}
	/*static void printMyName(int num, char deco) {
		for(int i=1; i<=num; i++)
			System.out.println(deco+"������"+deco);
		return;}
		Link all references for a local rename (does not change references in other  files)
		�Ȱ��� �̸����� �޼��带 �����ϸ� ������ ����. �̸��� �ٸ� �޼��带 �󸶵��� ���� �� �ִ�.
		*/
	static void printName(String name, char deco) {
		System.out.println(deco+name+deco);
		return;
		
	}
	}

