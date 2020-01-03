package day7;

class student{//클래스 이름 주고, 블럭주기, 반드시 중괄호
	String name;
	int age;
	String subject;
	void printStudentInfo() {
		System.out.println(name+" "
				+ "학생은 나이가 "+age+"입니다.");
	}
	void study(){
		System.out.println(name+" 학생은 "+subject+" 과목을 학습합니다.");
	}
}
public class StudentTest1 {
	public static void main(String[] args) {
		//하나의 자바소스 안에는 하나의 클래스를 정의하는게 좋다.
		student st1= new student();//객체생성 하는 식
		System.out.println(st1);// day7.student로 부터 만든 객체 라는 뜻
		System.out.println(st1.name);
		System.out.println(st1.age);
		System.out.println(st1.subject);
		st1.printStudentInfo();//null은 참조값이 없다의 기본값
		st1.study();
		st1.name="듀크";
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
		st2.name="턱시";
		st2.age=30;
		st2.subject="CSS3";
		st2.printStudentInfo();
		st2.study();
		System.out.println("st2=st1 수행");//전부 듀크 정보가 나온다.
		st2=st1;
		System.out.println(st1);
		System.out.println(st2);
		st1.printStudentInfo();
		st1.study();
		st2.printStudentInfo();
		st2.study();
		
	}
}
