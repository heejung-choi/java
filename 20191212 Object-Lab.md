![image-20191212140613383](C:\Users\student\AppData\Roaming\Typora\typora-user-images\image-20191212140613383.png)

```
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

```

```
package day8;

public class SalaryExpr {
	int bonus;
	
	SalaryExpr(){
		this(0);
	}
	
	SalaryExpr(int bonus) {
		this.bonus = bonus;
	}
	
	
//	grade 의 값이 1 이면 
//	멤버 변수 bonus 에 100 더한 후 이 값을 리턴. 
//	grade 의 값이 2 이면 
//	멤버 변수 bonus 에 90 더한 후 이 값을 리턴.
//	grade 의 값이 3 이면 
//	멤버 변수 bonus 에 80 더한 후 이 값을 리턴.
//	grade 의 값이 4 이면 
//	멤버 변수 bonus 에 70 더한 후 이 값을 리턴
	
	int getSalary(int grade) {
		
		switch(grade) {
		case 1:
			bonus += 100;
			break;
		case 2:
			bonus += 90;
			break;
		case 3:
			bonus += 80;
			break;
		case 4:
			bonus += 70;
			break;
		}
		return bonus;
	}


}

```

