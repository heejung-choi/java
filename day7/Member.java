package day7;

public class Member {
	String name;
	String account;
	String passwd;
	int birthyear;
	public Member(){};
	 Member(String p1, String p2, String p3, int p4) {
		name = p1;
		account = p2;
		passwd = p3;
		birthyear = p4;
	}
	void ID(int num) {
		System.out.println("È¸¿ø" + num + ": " + name + "(" + account + "," + passwd + "," + birthyear + ")");
	}
}