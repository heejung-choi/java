package day7;


class studentNew2 {
	String name;
	int age;	
	String subject;
	studentNew2(String p1, int p2){
		name = p1;
		age = p2;
	
	}
	studentNew2(String p1, int p2, String p3){
		name = p1;
		age = p2;
		subject = p3;
	}
	
	
	void printStudentInfo() {
		System.out.println(name+" "	+ "�л��� ���̰� "+age+"�Դϴ�.");
	}
	void study(){
		System.out.println(name+" �л��� "+subject+" ������ �н��մϴ�.");
	}
	void study(int hour){//�����̸��� �޼ҵ��� �Ű������� �޸��Ͽ� ����ϴ� ��= �޼ҵ�����ε�
		System.out.println(name+" �л��� "+subject+" ������ "+hour+"�ð� ���� �н��մϴ�.");
	}
}
public class StudentTest3 {
	public static void main(String[] args) {
		//studentNew st1= new studentNew(); �̷��� �Ǹ� ������ ����. 
		studentNew2 st1= new studentNew2("��ũ",24,"Javascript");
		System.out.println(st1);
		st1.study(2);
		studentNew2 st2= new studentNew2("�Ѹ�",24);
		System.out.println(st2);
		st2.study(2);
	}
}
