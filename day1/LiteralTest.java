package day1;
public class LiteralTest {
	public static void main(String[] args) {
		System.out.println(1+1);   //2  정수형
		System.out.println(1.0+1); //2.0 실수형 1.0+1.0->2.0
		System.out.println('1'+1); //50 문자형   1이라는 문자의 값		
		System.out.println("1"+1); //11 문자열형 "1"+1 -> "1"+"1"->"11"
		System.out.println("123"+4);
		System.out.println(7777777777777L); //대문자 L을 붙이면 long형으로 바꾸라는것이다. -> int형을 벗어남
	}
}
