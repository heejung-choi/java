package day6;

public class MethodTest3 {

	public static void main(String[] args) {
		System.out.println("main() 수행 시작");
		printMyName(1,'#');
		System.out.println("------------");
		printMyName(3,'*');
		System.out.println("------------");
		printMyName(2,'@');
		System.out.println("------------");
		//printMyName(1, '%', 10); 매개변수의 갯수와 메서드를 호출할때 하는 아규먼트의 갯수가 같아야 하고 타입도 호환이 되어야 한다.
		System.out.println("main() 수행종료");
	}
	static void printMyName(int num, char deco) {
		for(int i=1; i<=num; i++)
			System.out.println(deco+"유니코"+deco);
		return;
		
	}

}
