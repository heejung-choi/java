package day2;

public class OperTest3 {
	public static void main(String[] args) {
	 int ivalue;
	 char cvalue;
	 double dvalue;
	 boolean bvalue;
	 
	 ivalue = 100;
	 cvalue = 'A';
	 dvalue = 3.14;
	 bvalue = true;
	 
	 System.out.println(ivalue);
	 System.out.println(cvalue);
	 System.out.println(dvalue);
	 System.out.println(bvalue);
	 
	 ivalue = cvalue;
	 System.out.println(ivalue);// ���ڵ����͸� ������ ������ �ٲ� ������ //65
	 
	 /*ivalue = dvalue;
	 System.out.println(ivalue); ���� �� ���������δ� ��ȯ�� �� ���� */
	 
	 ivalue = (int)dvalue; //������ ����ȯ�ϰڴٴ� �� -> ���� �սǵǴ��� ��ȯ�ϰ��ٴ� ��
	 // ����ȯ �����ڶ�� �θ�
	 System.out.println(ivalue);
	 
	/* ivalue = bvalue;
	 ivalue = (int)bvalue; ����ȯ�� boolean�� ���ܵȴ�. �ڵ�, ���� ����ȯ �Ѵ� �ȵȴ�.*/


}
}
