

package day6;

public class MethodTest7 {

	public static void main(String[] args) {
		//args는 프로그램 아규먼트를 받는 변수이다.
		// 아규먼트는 프로그램을 수행시킬 때 전달하는 데이터 이다.
		System.out.println("main() 수행 시작");
		System.out.println(args.length);//메인메소드 호출 length값은 0
		System.out.println(args[0]+args[1]+args[2]);
		System.out.println("main() 수행종료");
	}


}
