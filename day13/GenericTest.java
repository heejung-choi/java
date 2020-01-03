package day13;
import java.util.*;
public class GenericTest {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();//LinkedList()�� Ÿ���� ��������� �Ѵ�. ���������� ������ �ڵ����� Object�� �����ȴ�.
		list.add("java");
		list.add("100"); 
		//list.add(100);�̷��� �ϸ� ���ܰ� �߻��Ѵ�. java.lang.ClassCastException 
		//->��ü ���� �ٸ� ���� ĳ���� �Ҷ� ���� ������ ���� ������ integer�� String ���� �� �� ���ٴ� ����
		//�����Ͽ����� ��ĥ �� ������ ���� ������ ������ Ŀ����.
		list.add("servlet");
		list.add("jdbc");
		
		for(int i=0; i < list.size(); i++)//size() LinkedList�� ����ִ� ũ��
			System.out.println(list.get(i));
		System.out.println();		
		
		for(Object value : list) {
			String s = (String)value;		
			System.out.println(s);
		}
		System.out.println();		
		
		Iterator iter = list.iterator();
		//Iterator:�������̽�, �ݷ��� ��ü�� ���� ��� �� �ȿ� �ִ� �����͵��� �ϳ��ϳ� ������ ����� �Ծ���� ������
		//set ��ü�� list ��ü�� ��� ���� �� �ִ�.
		while(iter.hasNext()){
			Object value = iter.next();
			String s = (String)value;		
			System.out.println(s);
		}
	}
}
