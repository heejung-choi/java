package day9;

class A{
	A(){
		System.out.println("A클래스를 객체 생성합니다.");
	}
}
class B extends A{
	B(int num){//생성자 메서드 이름은 클래스와 같아야 한다.
		//B(int num)으로 하면 C에서 오류가 난다. 이럴 경우 super로 조상에 알맞는 생성자를 만들어줘야 한다.
		System.out.println("B클래스를 객체 생성합니다.");
	}
}
class C extends B{
	C(){
		super(100);
		System.out.println("C클래스를 객체 생성합니다.");
		//super(100); 첫번째로 안하고 마지막으로 하면 오류가 난다.
	}
}

public class ABCTest {

	public static void main(String[] args) {
	new C();

	}

}

