package day7;

//�ҽ��� �ٸ��ٰ� �ϴ��� ���� �̸��� Ŭ������ �ϳ��� ��Ű�� �ȿ� �������� ����.
class studentNew{//�����ڰ� ������ �����Ϸ��� �ڵ����� ������ش�.
	String name;
	int age;	
	String subject;
	studentNew(String p1, int p2, String p3){
		name = p1;
		age = p2;
		subject = p3;
	}
	/*#### ������ �޼��� ���� ���
	1. �޼������ Ŭ������� �����ؾ� �Ѵ�.
	2. �Ű������� �������̴�. (�����ε� �����ϴ�.)
	3. ���� ���� Ÿ���� ���� �Ѵ�.
	4. ��ü ������ �����ؾ� �ϴ� ��� �Ǵ� 
   ��ü ������ �����͸� ���޹޾Ƽ� ����������� ���� �ʱ�ȭ �ϴ� ������� ������ �޼��带 ����Ѵ�.*/
	
	void printStudentInfo() {
		System.out.println(name+" "
				+ "�л��� ���̰� "+age+"�Դϴ�.");
	}
	void study(){
		System.out.println(name+" �л��� "+subject+" ������ �н��մϴ�.");
	}
	void study(int hour){//�����̸��� �޼ҵ��� �Ű������� �޸��Ͽ� ����ϴ� ��= �޼ҵ�����ε�
		System.out.println(name+" �л��� "+subject+" ������ "+hour+"�ð� ���� �н��մϴ�.");
	}
}
public class StudentTest2 {
	public static void main(String[] args) {
		//studentNew st1= new studentNew(); �̷��� �Ǹ� ������ ����. 
		studentNew st1= new studentNew("��ũ",24,"Javascript");
		System.out.println(st1);
		st1.study(2);
		
		studentNew st2= new studentNew("�Ѹ�",24,"scalar");
		System.out.println(st2);
		st2.study(5);
	}
}
