package day6;

public class MethodTest5 {

	public static void main(String[] args) {
		System.out.println("main() 수행 시작");
		int result = operate(10,20);
		System.out.println("호출결과1:"+result);
		System.out.println("호출결과2:"+operate(100,200));
		int result2 =operate(11,22)%2;
		if (result2 == 0 )
		System.out.println("호출결과3:짝수 ");
		else
			System.out.println("호출결과3:홀수 ");
		System.out.println("호출결과4:"+operate(100,200,300));
		System.out.println(getName());//매게변수가 없기 때문에 아규먼트를 주면 안된다.
		System.out.println("*"+getName()+"*");
		System.out.println("main() 수행종료");
	}
	static int operate(int num1, int num2) {// 메서드 오버로딩 -> 몇개까지 오버로딩 할 수 있는가? 제한 없다.
		
	return num1+num2;	
	}
	static int operate(int num1, int num2, int num3) {
		
	return num1+num2+num3;	
	}
	static String getName() {//메소드 이름 get: 받아와라, set: 선정해라 라는 의미로 많이 쓰인다.
		return "최희정";
	
		
	}

}
