package day13;


import java.util.*;

public class HashLab {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		String s;
		int i;
		while(map.size()<5) {
		System.out.printf("�����̸��� �Է��ϼ���: ");
		s = sc.next();		
		System.out.printf("�α� ���� �Է��ϼ���: ");
		i = sc.nextInt();
		sc.nextLine();
		if(!map.containsKey(s))
			{map.put(s,i);
			System.out.println("����Ǿ����ϴ�.");}
		else
			System.out.println("�����"+s+"�� �̹� ����Ǿ����ϴ�.");
		
	   
	   	
		}
		sc.close();
		System.out.println("5���� ��� �ԷµǾ����ϴ�.");
		System.out.print("�Էµ� ������:");		
		Iterator <String> it=map.keySet().iterator();
		
		while(true) {
			s=it.next();
			i=map.get(s);
			System.out.printf("%s(%d)",s,i);
			if(it.hasNext())
				System.out.print(",");
			else break;
		}
				//+map.keySet()+"(");
		
		
	}

}//contains key
