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
/* ���ǹ��̶�°� ���ϼ��� ������ �����ϼ��� �ִ�.else if���� ������ ������ �� �� �ִ�
	�̰� ��쿡�� result ���� 0���� �ʱ�ȭ �س��´�.*/
	
	System.out.println("�����:"+result);
	}

}

