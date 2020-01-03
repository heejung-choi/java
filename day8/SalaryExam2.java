package day8;
import day6.MethodLab3;
	class SalaryExpr2{
		int bonus;
	SalaryExpr2(){
		this(0);	
	}SalaryExpr2(int bonus){			//생성자메서드 
		this.bonus = bonus;								
	}int getSalary(int grade){		//월급 계산해서 리턴하는 메서드
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
//		} return result;			//지역변수 만들어야 bonus값이 변하지 않음
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
		int month = MethodLab3.getRandom(12);	//getRandom은 static형임
												//static형은 객체생성없이도 자동으로 사용가능
		int grade = MethodLab3.getRandom(4);
		
		SalaryExpr se1;					//한번만 객체생성하면 garbage 최소화가능!!
		if(month%2==0) {
			se1 = new SalaryExpr(100);//*** 클래스(SalaryExpr)를 객체생성해야 역할가능
		//	System.out.println(month+"월 "+grade+"등급의 월급은 "+se1.bonus+"입니다.");
		}
		else {
			se1 = new SalaryExpr(0);
		//	System.out.println(month+"월 "+grade+"등급의 월급은 "+se1.bonus+"입니다.");
		} System.out.println(month+"월 "+grade+"등급의 월급은 "+se1.bonus+"입니다.");
	}
}
	
