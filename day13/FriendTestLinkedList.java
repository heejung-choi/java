package day13;


import java.util.Iterator;

//ctrl+shift+o

//���� ����������.
import java.util.LinkedList;

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

public class FriendTestLinkedList {

	public static void main(String[] args) {
		System.out.printf("%-13s%-32s%s\n", "�̸�", "��ȭ��ȣ", "�����ּ�");
		System.out.println("----------------------------------------------");
		LinkedList<Friend> list = new LinkedList<Friend>();
		list.add(new Friend("������" + "       ", "01028079395" + "       ", "choi851008@naver.com"));
		list.add(new Friend("������" + "       ", "01027059395" + "       ", "choi751008@naver.com"));
		list.add(new Friend("�־ƶ�" + "       ", "01028079395" + "       ", "choi851008@naver.com"));
		list.add(new Friend("������" + "       ", "01027059395" + "       ", "choi751008@naver.com"));
		list.add(new Friend("�����" + "       ", "01028079395" + "       ", "choi000008@naver.com"));
		int num = list.size();
        for (int cnt = 0; cnt < num; cnt++) {
            Friend str = list.get(cnt);
            System.out.println(str.getInfo());
        }	
		System.out.println("----------------------------------------------");
		Iterator<Friend> iterator = list.iterator();   
        while (iterator.hasNext()) {
            Friend str = iterator.next();
            System.out.println(str.getInfo());
        }
        System.out.println("----------------------------------------------");
        for(Friend str : list) {
        	 System.out.println(str.getInfo());
        }
        System.out.println("----------------------------------------------"); 		
		while(!list.isEmpty()) {
			Friend f = list.removeLast();
			System.out.println(f.getInfo());
		}    
}
	
	}


