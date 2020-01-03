package day2;

public class OperTest1 {
	public static void main(String[] args) {
		/*int num1 = 100;
		int num2 = 50;*/
		
		int num1=100, num2=50; //타입이 동일한 경우에 한해서 같은 행에 넣어서 선언해도 된다.
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		System.out.println(num1>num2);
		System.out.println(num1<=num2);
		System.out.println(num1==num2);
		System.out.println(num1!=num2);
		System.out.println(num1>0 && num2>0);
		System.out.println(num1>80 && num2>80);
		System.out.println(num1>0 || num2>0);
		System.out.println(num1>80 || num2>80);
		System.out.println(num1>0 && num2>0 && num1 %2==0);
		System.out.println(num1>80 && num2>80 && num1 %2==1);		
		
}
}
