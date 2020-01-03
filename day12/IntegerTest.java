package day12;
public class IntegerTest {
	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("프로그램 아규먼트 2개를 숫자로 입력하세요");
		} else {
			System.out.println(Integer.parseInt(args[0])
					 +Integer.parseInt(args[1]));
		}
		String s1 = Integer.toBinaryString(12);//주어진 10진수를 2진수 문자열로 변환해준다.
		String s2 = Integer.toBinaryString(88);
	    
		System.out.printf("%s\n", s1);
		System.out.printf("%s\n", s2);
		
		int num1 = Integer.parseInt(s1 ,2);//두번째 아규먼트를 안주면 자동으로 10으로 설정된다. 2로 주면 2진수로 구성된 문자열로 알고 10진수로 출력해준다.
		int num2 = Integer.parseInt(s2, 2);
		
		System.out.printf("%d\n", num1);
		System.out.printf("%d\n", num2);
	}
}
