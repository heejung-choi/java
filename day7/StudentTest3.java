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
		System.out.println(name+" "	+ "학생은 나이가 "+age+"입니다.");
	}
	void study(){
		System.out.println(name+" 학생은 "+subject+" 과목을 학습합니다.");
	}
	void study(int hour){//같은이름의 메소드의 매개변수를 달리하여 사용하는 것= 메소드오버로딩
		System.out.println(name+" 학생은 "+subject+" 과목을 "+hour+"시간 동안 학습합니다.");
	}
}
public class StudentTest3 {
	public static void main(String[] args) {
		//studentNew st1= new studentNew(); 이렇게 되면 오류가 난다. 
		studentNew2 st1= new studentNew2("듀크",24,"Javascript");
		System.out.println(st1);
		st1.study(2);
		studentNew2 st2= new studentNew2("둘리",24);
		System.out.println(st2);
		st2.study(2);
	}
}
