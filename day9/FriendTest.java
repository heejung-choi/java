package day9;
import day6.MethodLab3;

class Person {
	private String name;// - private : �ۿ��� ���� ���� ���Ѵ�.
	Person(String name) {
		this.name = name;
	}// person Ŭ������ �ٲٸ� �ȵȴ�.

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
		System.out.printf("%-13s%-32s%s\n", "�̸�", "��ȭ��ȣ", "�����ּ�");
		System.out.println("----------------------------------------------");
		Friend a = new Friend("������" + "       ", "01028079395" + "       ", "choi851008@naver.com");
		System.out.println(a.getInfo());
		Friend a2 = new Friend("������" + "       ", "01027059395" + "       ", "choi751008@naver.com");
		System.out.println(a2.getInfo());
		Friend a3 = new Friend("�־ƶ�" + "       ", "01028449395" + "       ", "choi651008@naver.com");
		System.out.println(a3.getInfo());
		Friend a4 = new Friend("������" + "       ", "01027079533" + "       ", "choi551006@naver.com");
		System.out.println(a4.getInfo());
		Friend a5 = new Friend("�����" + "       ", "01028075595" + "       ", "choi451007@naver.com");
		System.out.println(a5.getInfo());
	}

}
