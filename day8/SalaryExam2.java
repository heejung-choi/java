package day8;
import day6.MethodLab3;
	class SalaryExpr2{
		int bonus;
	SalaryExpr2(){
		this(0);	
	}SalaryExpr2(int bonus){			//�����ڸ޼��� 
		this.bonus = bonus;								
	}int getSalary(int grade){		//���� ����ؼ� �����ϴ� �޼���
//		int result=0;
//		switch(grade) {
//			case 1 : result =bonus+100;
//				break;
//			case 2 : result =bonus+90;
//				break;
//			case 3 : result =bonus+80;
//				break;
//			case 4 : result = bonus+70;
//				break;
//		} return result;			//�������� ������ bonus���� ������ ����
		switch(grade) {
			case 1 : bonus+=100;
				break;
			case 2 : bonus+=90;
				break;
			case 3 : bonus+=80;
				break;
			case 4 : bonus+=70;
				break;
		} return bonus;	
	}
}	
	
public class SalaryExam2 {
	public static void main(String[] args) {
		int month = MethodLab3.getRandom(12);	//getRandom�� static����
												//static���� ��ü�������̵� �ڵ����� ��밡��
		int grade = MethodLab3.getRandom(4);
		
		SalaryExpr se1;					//�ѹ��� ��ü�����ϸ� garbage �ּ�ȭ����!!
		if(month%2==0) {
			se1 = new SalaryExpr(100);//*** Ŭ����(SalaryExpr)�� ��ü�����ؾ� ���Ұ���
		//	System.out.println(month+"�� "+grade+"����� ������ "+se1.bonus+"�Դϴ�.");
		}
		else {
			se1 = new SalaryExpr(0);
		//	System.out.println(month+"�� "+grade+"����� ������ "+se1.bonus+"�Դϴ�.");
		} System.out.println(month+"�� "+grade+"����� ������ "+se1.bonus+"�Դϴ�.");
	}
}
	
