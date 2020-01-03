package day8;

import java.util.Scanner;

public class ScannerLab1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("첫번째 숫자를 입력하세요: ");
		int su1 = sc.nextInt();
		sc.nextLine();
		System.out.printf("두번째 숫자를 입력하세요: ");
		int su2 = sc.nextInt();
		sc.nextLine();
		System.out.printf("연산자(+, -, *, /)를 입력하세요 : ");
		String str = sc.nextLine();
		sc.close();
		
		int result=0;
		switch(str) {
		case "+": result=su1+su2;		
		break;
		case "-": result=su1-su2;	
		break;
		case "*": result=su1*su2;		
		break;
		case "/": result=su1/su2;		
		}		
		
		if(str.equals("+")||str.charAt(0)=='-'||str.charAt(0)=='*'||str.charAt(0)=='/')//str.equals("+")도 가능
		System.out.printf("%d와 %d의  %s연산결과는 %s입니다.",su1,su2,str,result);
		else
			System.out.printf("+,-,*,/를 입력하숑");}	
	
	
	}


