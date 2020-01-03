package day14;

import java.util.HashSet;

class Member3 {
	private int id;
	private String name;
	private String password;
	Member3(int id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}
	public boolean equals(Object o) {
		if (o != null && o instanceof Member3) {
			Member3 m = (Member3) o;			
			if (id ==  m.id && 
					name.equals(m.name) && 
							password.equals(m.password))
				return true;
		}
		return false;
	}	
	public int hashCode() {
		return id+name.hashCode()+password.hashCode();	//	���ڰ��� ������ �����ű� ������ id�� �׳� ���� ó�� �ߴ�.
		//�Ȱ��� ���ڿ� �����϶� �Ȱ��� �뿡��⵵�� �ϱ�����-> equals�� hashCode�� �������̵� ������Ѵ�
	}
	
	public String toString() {	// toString : � ��ü�� ������ �ϳ��� ���ڿ��� return ���ִ� �޼����̴�.
		return "("+id+":"+name+":"+password+")";
	}
}
public class ObjectTest3 {
	public static void main(String args[]) {
		Member3 obj1 = new Member3(10, "�ڹ�", "duke");
		Member3 obj2 = new Member3(10, "�ڹ�", "duke");
		Member3 obj3 = new Member3(20, "�ڹ�", "duke");
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());	
		System.out.println(obj3.hashCode());	
		HashSet<Member3> set = new HashSet<>();
		set.add(obj1);
		set.add(obj2);
		set.add(obj3);
		System.out.println("����� �������� ���� : " + set.size()); //	 ���������� ����� �������� ������ 2���� �ȴ�.
		//obj1�� obj2�� ���� �����̱� ����(�ߺ��� �Ǵ��Ѱ��̴�.=> hashCode�� equals�� �������̵��߱� ����)
		System.out.println(set);
	}
}




