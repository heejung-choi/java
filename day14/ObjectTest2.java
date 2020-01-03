package day14;

class Member2 {
	private int id;
	private String name;
	private String password;

	Member2(int id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}

	public boolean equals(Object o) {
		if (o != null && o instanceof Member2) {	//	member2 ��ü�� ����� �Դ��� Ȯ��!
			Member2 m = (Member2) o;	// ����ȯ�ؼ� �����ؾ� �Ѵ�.
			if (id == m.id && 	//	id�� id ���� ��
					name.equals(m.name) && 	// name�� name ���� ��
							password.equals(m.password))	// password�� password ���� ��
				return true;
		}
		return false;
	}
}

public class ObjectTest2 {
	public static void main(String args[]) {
		Member2 obj1 = new Member2(10, "�ڹ�", "duke");
		Member2 obj2 = new Member2(10, "�ڹ�", "duke");
		Member2 obj3 = new Member2(20, "�ڹ�", "duke");
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1 == obj2);		
		System.out.println(obj1.equals(null));
		System.out.println(obj1.equals(new java.util.Date()));
		System.out.println(obj1.equals(obj3));
	}
}
