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
