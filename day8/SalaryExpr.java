package day8;

public class SalaryExpr {
	int bonus;
	
	SalaryExpr(){
		this(0);
	}
	
	SalaryExpr(int bonus) {
		this.bonus = bonus;
	}
	
	
//	grade �� ���� 1 �̸� 
//	��� ���� bonus �� 100 ���� �� �� ���� ����. 
//	grade �� ���� 2 �̸� 
//	��� ���� bonus �� 90 ���� �� �� ���� ����.
//	grade �� ���� 3 �̸� 
//	��� ���� bonus �� 80 ���� �� �� ���� ����.
//	grade �� ���� 4 �̸� 
//	��� ���� bonus �� 70 ���� �� �� ���� ����
	
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
