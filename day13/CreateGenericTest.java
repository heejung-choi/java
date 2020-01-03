package day13;
import java.util.Date;
public class CreateGenericTest {
	public static void main(String[] args) {
		Value1 o1 = new Value1();//Value1 String ��ü�� ó�� ����
		o1.put("abc");
		String s1 = o1.get(); 
		System.out.println(s1);		
		
		Value2 o2 = new Value2();//� ��ü�� ������ �� �� �ִ�.
		o2.put("abc");
		String s2 = (String)o2.get(); //������ ����ȯ ����� �Ѵ�.
		System.out.println(s2);
		
		Value3<String> o3 = new Value3<>();
		//	Value3<String> o3 = new Value3<>-> ���⿡ �󲩼���ȣ�� �൵ �ȴ� java8���� 
		// ������ 	Value3<String> o3 = new Value3<String>(); java8�������� �̷��� ��� �Ѵ�.
		o3.put("abc");
		String s3 = o3.get(); //����ȯ�� ���� �ʾƵ� �ȴ�.
		System.out.println(s3);	
		
		Value3<Date> o4 = new Value3<Date>();
		//o4.put("abc"); Ÿ���Ķ���ͷ� Date�� ��� ������ �ݵ�� Date�� �;���
		o4.put(new Date());
		Date s4 = o4.get(); 
		System.out.println(s4);	
	}
}


class Value1 {//String ��ü�� ������ �� �ִ�.
	String obj;
	void put(String obj){
		this.obj = obj;
	}
	String get() {
		return obj;
	}
}
class Value2 {
	//String, StringBuffer, �⺻�� ���� �� �� �ִ�. ��ſ� put���� ��ü�� �������� ��� ������ �������� ����ȯ�� �ؾ��Ѵ�.\
	//������ Generic ������ ��� �̷��Թۿ� ó���� ���ߴ�.
	Object obj;
	void put(Object obj){
		this.obj = obj;
	}
	Object get() {
		return obj;
	}
}
// Value3<Card> v = new Value3<Card>();//��ü������ Ÿ���Ķ���͸� <Card>�� �ָ� T�� Card�� �ٲ��. �Ű�����, return��
// Value3<String> v = new Value3<String>();��ü������ Ÿ���Ķ���͸� <String>�� �ָ� T�� Card�� �ٲ��. �Ű�����, return��
//Ŭ������ ó���� ������ Ÿ���� ��ü������������ ���ϰڴٶ�� �����̴�.
//Generic ���� ������ ������ Ÿ���� ó������ ���ؾ� ������ Generic�� ����ϸ� ������ Ÿ���� ��ü �����ø��� �������� ��ȭ�� �� �ִ�.

class Value3<T> {//<T> ������ȣ �ȿ� �ƹ��ų� �־ �ȴ�. element�� Ÿ���� �ǹ���
	//��ü������ TT��� Ÿ�� �Ķ���͸� ���� ���̶�� �ǹ��̴�.
	T obj;
	void put(T obj){
		this.obj = obj;
	}
	T get() {
		return obj;
	}
}













