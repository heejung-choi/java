package day7;

//소스가 다르다고 하더라도 같은 이름의 클레스가 하나의 패키지 안에 있을수는 없다.
class studentNew{//생성자가 없으나 컴파일러가 자동으로 만들어준다.
	String name;
	int age;	
	String subject;
	studentNew(String p1, int p2, String p3){
		name = p1;
		age = p2;
		subject = p3;
	}
	/*#### 생성자 메서드 정의 방법
	1. 메서드명은 클래스명과 동일해야 한다.
	2. 매개변수는 선택적이다. (오버로딩 가능하다.)
	3. 리턴 값의 타입은 생략 한다.
	4. 객체 생성시 수행해야 하는 기능 또는 
   객체 생성시 데이터를 전달받아서 멤버변수들의 값을 초기화 하는 기능으로 생성자 메서드를 사용한다.*/
	
	void printStudentInfo() {
		System.out.println(name+" "
				+ "학생은 나이가 "+age+"입니다.");
	}
	void study(){
		System.out.println(name+" 학생은 "+subject+" 과목을 학습합니다.");
	}
	void study(int hour){//같은이름의 메소드의 매개변수를 달리하여 사용하는 것= 메소드오버로딩
		System.out.println(name+" 학생은 "+subject+" 과목을 "+hour+"시간 동안 학습합니다.");
	}
}
public class StudentTest2 {
	public static void main(String[] args) {
		//studentNew st1= new studentNew(); 이렇게 되면 오류가 난다. 
		studentNew st1= new studentNew("듀크",24,"Javascript");
		System.out.println(st1);
		st1.study(2);
		
		studentNew st2= new studentNew("둘리",24,"scalar");
		System.out.println(st2);
		st2.study(5);
	}
}
