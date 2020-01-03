package day6;

public class MethodTest8 {

	public static void main(String[] args) {
		System.out.println("main() 수행 시작");
		char[] returnvalue= getName(1);
		System.out.println(returnvalue);
		//다른배열이 아규먼트로 오면 참조값을 출력하지만 캐릭터형 배열만 값을 출력해준다.
		System.out.println("main() 수행종료");
	}
	static char[] getName(int type) {
		char ary[];
		if(type==1)
			ary = new char[] {'J','A','V','A'};
		else
			ary = new char[] {'P','Y','T','H','O','N'};
		return ary;	
	}

}
