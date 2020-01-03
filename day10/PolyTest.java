package day10;

public class PolyTest {

	public static void main(String[] args) {
		printObjectInfo(new Object());//�̷��� �ϸ� ���̻� ���� ���Ѵ�. �ѹ��� ����ϸ� ������ ���� �ʾƵ� �ȴ�.
		printObjectInfo(new String("������"));
		printObjectInfo("ABC");
		printObjectInfo(new java.util.Date());
		printObjectInfo(new java.io.File("c:\\TEMP"));//�ƱԸ�Ʈ ����ϴ� ��
		printObjectInfo(new java.io.File("c:/TEMP"));// "/"�̰Ŵ� �ѹ��� �ص� �ǰ� "\\" �̰Ŵ� �ι� �Է��ؾ� �Ѵ�. 
		//io�� input, output�� �����̴�.	
		printObjectInfo(new int[10]);
		printObjectInfo(new double[5]);
		printObjectInfo(new day7.Member());		
		printObjectInfo(new Integer(100));
		printObjectInfo(100);//Java 5���� AutoBoxing ����//��ü�� �;��� �ڸ��� �⺻���� ���� �����Ϸ��� �ڵ����� ��ü�� �ٲ��ش�.
		printObjectInfo('��');
	}
	static void printObjectInfo(Object o) {//java.lang�� �ڵ����� import�ȴ�. 
//	static void printObjectInfo(String o) {//�̰����� �ϸ� String���� �޴°��� ������ ����.
	if(o instanceof String) {// insttanceof �θ�Ÿ�� == true
		System.out.println("���ڿ� ��ü ���޵�: "+o.getClass().getName()+"  -"+((String) o).length());
	}else {
	System.out.println("���޵� ��ü�� Ŭ������: "+o.getClass().getName());
	}
	}
}
