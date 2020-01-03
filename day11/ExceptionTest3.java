package day11;
import java.util.Random;
class TestException extends Exception {
	TestException(String message){
		super(message);//super�� ȣ�������ν� �޼��� �����ϴ� ���̴�.
	}
}
public class ExceptionTest3 {
	public static void main(String[] args)  {
		System.out.println("main()�������");
		a();
		System.out.println("main()��������");
	}
	static void a()  {
		System.out.println("a()�������");
		try {
			b();
		} catch (TestException e){	//catch ���� ȣ��Ǹ� �޸� ���� ������ ���� ���� e���� �ش�.(getMessage)
			System.out.println("���� �߻� : "+e.getMessage());
		}
		System.out.println("a()��������");
	}
	static void b() throws TestException {
		System.out.println("b()�������");
		c();
		System.out.println("b()��������");
	}
	static void c() throws TestException {
		//throws TestException { �̰� ������ ��������. 
		// c �޼ҵ�� ���ܰ� �߻��� �� ������ �׸� �˾ƶ� �ϴ� �����̴�.
		System.out.println("c()�������");
		boolean flag = new Random().nextBoolean();
		//��ü �����ؼ� �ٷ� ����� ��ƾ� �ϴ� ���� �ƴϴ�. �ѹ��� ���Ÿ� ���� ���� �ص� �ȴ�. �׷��� �̷��� �ϸ� ��ü�� ����� �ѹ��ۿ� ����� �� ����.
		//���������� Boolean 
		if(flag){
			throw new TestException("<<:::::�׽�Ʈ�� ���ܹ߻���Ŵ:::::>>");
		}else {
			System.out.println("��������");
		}	
		
		System.out.println("c()��������");
	}	
}
//printStackTrace(): ȣ������ ���
//getMessage(): ���� �޽��� ���






