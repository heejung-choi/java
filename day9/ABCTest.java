package day9;

class A{
	A(){
		System.out.println("AŬ������ ��ü �����մϴ�.");
	}
}
class B extends A{
	B(int num){//������ �޼��� �̸��� Ŭ������ ���ƾ� �Ѵ�.
		//B(int num)���� �ϸ� C���� ������ ����. �̷� ��� super�� ���� �˸´� �����ڸ� �������� �Ѵ�.
		System.out.println("BŬ������ ��ü �����մϴ�.");
	}
}
class C extends B{
	C(){
		super(100);
		System.out.println("CŬ������ ��ü �����մϴ�.");
		//super(100); ù��°�� ���ϰ� ���������� �ϸ� ������ ����.
	}
}

public class ABCTest {

	public static void main(String[] args) {
	new C();

	}

}

