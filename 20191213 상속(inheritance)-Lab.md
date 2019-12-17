# 상속(inheritance) Lab

## [ 상속실습  문제 1 ]

class Person {
	private String name;//- private : 밖에서 직접 접근 못한다.
	Person(String name) {
		this.name = name;
	}//person 클래스는 바꾸면 안된다.
	public String getInfo() {//+
		return name;
	}
}
Person 클래스를 상속하여 Friend 라는 클래스를 다음과 같은 사양으로 구현한다. 

Person
- name : String
Person(String)
+ getInfo() : String

FriendTest

+ main(String args[]) : void


Friend
- phoneNum : String
- email : String
Friend(String,String,String)
+getInfo():String

public class FriendTest {
    public static void main(String args[]) {
         // Friend 클래스 타입의 배열을 생성한다. (원소 5 개)  --> Friend 타입의 객체들을 저장
         // 5개의 Friend 객체를 생성한다. (객체 생성시 입력되는 정보는 임의로 정한다.)
         // 각 Firend 객체의 정보를 getInfo() 라는 메서드를 호출하여 실행 결과 예와 같이 출력 한다. 



　## [상속실습 답변1]

```java
package day9;
import day6.MethodLab3;

class Person {
	private String name;// - private : 밖에서 직접 접근 못한다.
	Person(String name) {
		this.name = name;
	}// person 클래스는 바꾸면 안된다.

	public String getInfo() {// +
		return name;
	}
}

class Friend extends Person {
	String phoneNum;
	String email;
	
	Friend(String name, String phoneNum, String email) {
		super(name);
		this.phoneNum = phoneNum;
		this.email = email;
	}

	public String getInfo() {
		return super.getInfo() + phoneNum + email;
	}
}

public class FriendTest {

	public static void main(String[] args) {
		System.out.printf("%-13s%-32s%s\n", "이름", "전화번호", "메일주소");
		System.out.println("----------------------------------------------");
		Friend a = new Friend("최희정" + "       ", "01028079395" + "       ", "choi851008@naver.com");
		System.out.println(a.getInfo());
		Friend a2 = new Friend("최유정" + "       ", "01027059395" + "       ", "choi751008@naver.com");
		System.out.println(a2.getInfo());
		Friend a3 = new Friend("최아람" + "       ", "01028449395" + "       ", "choi651008@naver.com");
		System.out.println(a3.getInfo());
		Friend a4 = new Friend("변영순" + "       ", "01027079533" + "       ", "choi551006@naver.com");
		System.out.println(a4.getInfo());
		Friend a5 = new Friend("최흥렬" + "       ", "01028075595" + "       ", "choi451007@naver.com");
		System.out.println(a5.getInfo());
	}

}

```



## [상속 실습 문제2]

다음과 같은 내용으로 Multiplication 클래스가 있다. 

```java
class Multiplication {
	private int dan;
	private int number;
	Multiplication() {}
	Multiplication(int dan) {
		this.dan = dan;
	}
	Multiplication(int dan, int number){
		this.dan = dan;
		this.number = number;
	}
	void printPart() {
		if (number == 0) {	       
			for(int n=1; n <= 9; n++)
				System.out.print("\t"+dan + "*" + n+ "="+dan*n);
			System.out.println();
		} else {
			System.out.println(dan * number);
		}
	}
}

```

1. 상속 구문을 적용하여 GuGuDanExpr 클래스를 구현한다.

\- Multiplication 클래스를 상속한다.

\- GuGuDanExpr 클래스의 생성자 사양

​     GuGuDanExpr()

​     GuGuDanExpr(int dan)

​     GuGuDanExpr(int dan, int number)

\- GuGuDanExpr 클래스의 메서드 사양

​     static void printAll() //static 은 non-static 못한다. 혼자 수행해야됨

다음에 제시된 출력 방식으로 1단부터 9단까지 모두 출력

​          1*1=1  1*2=2  ……………….

​          2*1=2  2*2=4 ………………..

​                  :

​         9*1=1  9*2=2 ……………….

 

 

2. 다음에 제시된 내용을 수행하는 메인 클래스 GuGuDan 을 구현한다.

 

1부터 20사이의 난수를 2개를 추출하여 각각 dan 변수와 number 변수에 담는다. 

Day 6 메소드3

(1) dan 과 number 이 모두 1~9 사이이면 dan*number 의 구구단을 출력한다.

GuGuDanExpr 객체를 생성(생성자를 통해서 dan과 number에 대한 데이터를 전달하여 초기화한다.)하고 printPart() 를 호출한다. 단이 3, number가 4로 추출된다면 3 * 4 = 12 를 출력한다.

 

(2) dan 은 1~9 사이이고 number 가 10 이상이면 GuGuDanExpr 객체를 생성

(생성자를 통해서 dan에 대한 정보를 전달하여 초기화한다.)하고 printPart() 

를 호출한다. 

추출된 dan의 숫자가 2 라면…. 

 

2단 : 2 * 1 = 1  2 * 2 = 2  2 * 3 = 6 ………………

 

(3) dan 의 값이 10 이상이면 GuGuDanExpr 의 static 메서드 printAll() 을 호출

하여 1단부터 9단까지의 값들을 행 단위로 출력한다. 

 

1 * 1 = 1  1 * 2 = 2  1 * 3 = 3 ………………..

2 * 1 = 1  2 * 2 = 2  2 * 3 = 6 ………………...

……………..

9 * 1 = 9  9 * 2 = 18 9 * 3 = 27………………...



## [상속 실습 답변 2]



```java
package day9;

import day6.MethodLab3;

class Multiplication {
	private int dan;
	private int number;
	Multiplication() {
	}
	Multiplication(int dan) {
		this.dan = dan;
	}
	Multiplication(int dan, int number) {
		this.dan = dan;
		this.number = number;
	}
	public void printPart() {
		if (number == 0) {
			for (int n = 1; n <= 9; n++)
				System.out.print("\t" + dan + "*" + n + "=" + dan * n);
			System.out.println();
		} else {
			System.out.println(dan * number);
		}
	}
}
class GuGuDanExpr extends Multiplication {
	GuGuDanExpr(int dan) {
		super(dan);
	}
	GuGuDanExpr(int dan, int number) {
		super(dan, number);
	}
	public static void printAll() {

		for (int dan = 1; dan <= 9; dan++) {
			for (int num = 1; num <= 9; num++)
				System.out.print(dan + "x" + num + "=" + dan * num + "\t");
			System.out.println();
		}
	}
}
public class GuGuDan {
	public static void main(String[] args) {
		int dan = MethodLab3.getRandom(20);
		int number = MethodLab3.getRandom(20);

		if (dan >= 10)
			GuGuDanExpr.printAll();
		else if (number >= 10) {
			GuGuDanExpr b = new GuGuDanExpr(dan);
			b.printPart();
		} else {
			GuGuDanExpr a = new GuGuDanExpr(dan, number);
			System.out.print(dan + "*" + number + "=");
			a.printPart();
		}
	}
}

```



## [상속 실습 답안 3]

```java
package exercise;


public class Human {
	String name;
	int age;
	int height;
	int weight;
	public Human(){		
	}
	public Human(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	public String printInformation() {
		return name+"  "+ age+"  "+ height+"  "+ weight;
	}
}
```

```java
package exercise;

public class Student extends Human {
	String number;
	String major;
	public Student(){		
	}
	public Student(String name, int age, int height, int weight, String number, String major) {
		super(name, age, height, weight);	
		this.number = number;
		this.major = major;	
	}
	public String printInformation() {
		return super.printInformation()+"  " +number+"  "+major;
	}
}
```

``` java
package exercise;

public class StudentTest {

	public static void main(String[] args) {
		Student array []= new Student[3];
		array[0]= new Student ("홍길동",20,171,81,"201101","영문");
		array[1]= new Student ("고길동",21,183,72,"201102","건축");
		array[2]= new Student ("박길동",22,175,65,"201103","컴공");
		for(int i = 0; i<array.length ; i++)
			System.out.println(array[i].printInformation());
	}

}


```

