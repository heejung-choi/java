package day1;

public class VariableTest {
	public static void main(String[] args) {
		System.out.println(1+2+3+4+5+10); //25
		System.out.println(1+2+3+4+5-10); //5
		System.out.println(1+2+3+4+5*10); //60
		System.out.println((1+2+3+4+5)*10); //곱셈연산자가 우선순위지만 괄호를 통해 우선순위를 선택할 수 있다.
		System.out.println(1+2+3+4+5/10); //10 : 5나누기 10은 몫이 0이기 때문에 0
		
		System.out.println("-------");
		int result = 1+2+3+4+5; //result :변수라고 한다. 12345를 리터널이라고 한다.
		System.out.println(result+10);
		System.out.println(result-10);
		System.out.println(result*10);
		System.out.println(result/10);
		
		char munja = 'A'; //0x41 //숫자앞에 ox가 붙어있으면 16진수 
		System.out.println(""+munja+ munja); //65+65=130 //"" 널문자열
	}
}
