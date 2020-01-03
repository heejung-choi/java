package day6;
public class PrintfTest {
	public static void main(String[] args) {// /n은 개행처리 %n도 개행처리
		System.out.printf("테스트입니당\n");		// %n
		System.out.printf("%d %x %o %c\n", 100, 100, 100, 100); 
		//%로 시작하는것은 포맷문자(%d:10진수 / %x:16진수 %o:8진수 %c:문자데이터
		System.out.printf("%#x %#X %#o\n", 100, 100, 100);
		// x를 대문자로 나타내고 싶으면 대문자, 소문자로 나타내고 싶으면 소문자로
		System.out.printf("%c %c %c %c\n", '가', 'A', '!', '3' );
		System.out.printf("%b\n", true);
		// boolean은 %b
		System.out.printf("%f %e\n", 100.0, 100.0);
		// %f는 소숫점 6자리까지, %e 지수형태로 나타내준다. 
		System.out.printf("%.2f\n", 123.5678);
		System.out.printf("|%s|\n", "자바");
		// %s는 데이터의 길이에 맞춰 알아서 출력한다.
		System.out.printf("|%10s|\n", "자바");
		// 앞에 빈칸
		System.out.printf("|%-10s|\n", "자바");
		// 뒤에 빈칸
		System.out.printf("%,d원\n", 1000000);
		// 1000단위마다 컴마를 넣어라 라는 의미
		System.out.printf("%s%s%s\n", "java", "C#", "c++");
		System.out.printf("%s %s %s\n", "java", "C#", "c++");
		//블랭크를 주면 블랭크 준만큼 띄어진다. 
		System.out.printf("%10s%s%s\n", "java", "C#", "c++");
	}
}








