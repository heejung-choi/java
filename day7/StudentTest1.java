package day7;

class student{//Ŭ���� �̸� �ְ�, ���ֱ�, �ݵ�� �߰�ȣ
	String name;
	int age;
	String subject;
	void printStudentInfo() {
		System.out.println(name+" "
				+ "�л��� ���̰� "+age+"�Դϴ�.");
	}
	void study(){
		System.out.println(name+" �л��� "+subject+" ������ �н��մϴ�.");
	}
}
public class StudentTest1 {
	public static void main(String[] args) {
		//�ϳ��� �ڹټҽ� �ȿ��� �ϳ��� Ŭ������ �����ϴ°� ����.
		student st1= new student();//��ü���� �ϴ� ��
		System.out.println(st1);// day7.student�� ���� ���� ��ü ��� ��
		System.out.println(st1.name);
		System.out.println(st1.age);
		System.out.println(st1.subject);
		st1.printStudentInfo();//null�� �������� ������ �⺻��
		st1.study();
		st1.name="��ũ";
		st1.age=24;
		st1.subject="HTML5";
		st1.printStudentInfo();
		st1.study();
		student st2= new student();
		System.out.println(st2);
		System.out.println(st2.name);
		System.out.println(st2.age);
		System.out.println(st2.subject);
		st2.printStudentInfo();
		st2.study();
		st2.name="�ν�";
		st2.age=30;
		st2.subject="CSS3";
		st2.printStudentInfo();
		st2.study();
		System.out.println("st2=st1 ����");//���� ��ũ ������ ���´�.
		st2=st1;
		System.out.println(st1);
		System.out.println(st2);
		st1.printStudentInfo();
		st1.study();
		st2.printStudentInfo();
		st2.study();
		
	}
}
