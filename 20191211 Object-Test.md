# Object-Test 20191211



## Test 1: StudentTest1

```java
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

```

```java

// cmd 창에서 student class 확인
C:\unico\eclipse-workspace\javaexam\bin>javap day7.student//javap 명령어로 class 확인 해볼 수 있음
Compiled from "StudentTest1.java"
class day7.student {
  java.lang.String name;//java.lang. 자동으로 추가되었음
  int age;
  java.lang.String subject;
  day7.student();
  void printStudentInfo();
  void study();
}
```



## Test 2: StudentTest2

```java
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


```

## Test 3 : StudentTest3

```java
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

```





## Test 4: DateTest

```java
package day7;//패키지는 클래스를 묶는 꾸러미
import java.util.Date; //다른 패키지에 있는 것을 접근하려면 이렇게 해야한다.
//패키지 이름: java.util 클래스 이름:Date
import java.util.GregorianCalendar;
public class DateTest {

	public static void main(String[] args) {
		//자바에 Date 클래스가 있다.
		Date d= new Date();		
		System.out.println(d.toString()); //현재 시간정보와 시스템정보가 나오고 있다.
		GregorianCalendar gc= new GregorianCalendar();
		System.out.println(gc.get(GregorianCalendar.DAY_OF_WEEK));//오늘의 요일
		//소괄호 붙어있는 것들 메소드 안붙어있는것들 상수이다. 상수 이름 붙일때는 대문자로 한다.
		gc= new GregorianCalendar(2019,11,25);
		//이 시점에서 위의 객체는 가비지가 된다.// 12월을 하려면 12-1을 해서 조회해야 한다.(월은 반드시 -1)
		System.out.println(gc.get(GregorianCalendar.DAY_OF_WEEK));
		gc= new GregorianCalendar(1995,9,8);
		System.out.println(gc.get(GregorianCalendar.DAY_OF_WEEK));
	}
}
```



