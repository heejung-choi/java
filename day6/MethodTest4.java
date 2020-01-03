package day6;

public class MethodTest4 {

	public static void main(String[] args) {
		System.out.println("main() 수행 시작");
		printMyName(3,'*');
		printName("듀크",'$');//세번출력하고 싶으면 세번 호출 해야한다.
		printName("듀크",'$');
		printName("듀크",'$');
		printName("턱시",'!');		
		System.out.println("main() 수행종료");
	}
	static void printMyName(int num, char deco) {
		for(int i=1; i<=num; i++)
			System.out.println(deco+"유니코"+deco);// 유니코에 특화된 메서드
		return;
		
	}
	/*static void printMyName(int num, char deco) {
		for(int i=1; i<=num; i++)
			System.out.println(deco+"유니코"+deco);
		return;}
		Link all references for a local rename (does not change references in other  files)
		똑같은 이름으로 메서드를 정의하면 오류가 난다. 이름이 다른 메서드를 얼마든지 만들 수 있다.
		*/
	static void printName(String name, char deco) {
		System.out.println(deco+name+deco);
		return;
		
	}
	}

