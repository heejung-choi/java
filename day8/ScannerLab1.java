package day8;

import java.util.Scanner;

public class ScannerLab1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("ù��° ���ڸ� �Է��ϼ���: ");
		int su1 = sc.nextInt();
		sc.nextLine();
		System.out.printf("�ι�° ���ڸ� �Է��ϼ���: ");
		int su2 = sc.nextInt();
		sc.nextLine();
		System.out.printf("������(+, -, *, /)�� �Է��ϼ��� : ");
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
		
		if(str.equals("+")||str.charAt(0)=='-'||str.charAt(0)=='*'||str.charAt(0)=='/')//str.equals("+")�� ����
		System.out.printf("%d�� %d��  %s�������� %s�Դϴ�.",su1,su2,str,result);
		else
			System.out.printf("+,-,*,/�� �Է��ϼ�");}	
	
	
	}


