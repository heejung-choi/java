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
