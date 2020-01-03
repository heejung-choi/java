package day8;
import day6.MethodLab3;
/*
 	public static int getRandom(int n) {
		return (int)(Math.random()*n+1);
	}
	public static int getRandom(int n1, int n2) {
		return (int)(Math.random()*(n2-n1+1)+n1);
	}	
 */

public class SalaryExam {

	public static void main(String[] args) {
		int month = MethodLab3.getRandom(12);
		int grade =MethodLab3.getRandom(4);
		
		SalaryExpr salaryExpr = month%2 == 0? (new SalaryExpr(100)) : ( new SalaryExpr());
		int salary = salaryExpr.getSalary(grade);
		
		
		System.out.printf("%d월 %d등급의 월급은 %d입니다.", month, grade, salary);
	}

}
