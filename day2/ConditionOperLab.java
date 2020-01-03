package day2;
public class ConditionOperLab {
	public static void main(String[] args) {
		int value = (int)(Math.random()*5)+1;
		int su1=300;
		int su2=50;
		int result;

	if (value == 1)
		result=su1+su2;
	else if (value ==2)
		result=su1-su2;
	else if (value ==3)
		result=su1*su2;
	else if (value ==4)
		result=su1/su2;
	else
		result=su1%su2;
/* 조건문이라는건 참일수도 있지만 거짓일수도 있다.else if문만 있으면 오류가 날 수 있다
	이걸 경우에는 result 값을 0으로 초기화 해놓는다.*/
	
	System.out.println("결과값:"+result);
	}

}

