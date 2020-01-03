package day11;

public class ExceptionTest2 {

	public static void main(String[] args) {//����ó���� �ؾ��ϴ� �޼ҵ� ó���� ����
		System.out.println("�������");
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int result= num1/num2;
			System.out.println("������: "+result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("���α׷� �ƱԸ�Ʈ�� 2�� �����ϼ���!!");
		} catch (ArithmeticException e) {
			e.printStackTrace();//� �࿡�� ���ܰ� �߻��ߴ��� �˰� ������
			/*���ܰ� �߻��� ���� �ݽ��� ������ ȣ���ϼ���
			 ȣ���ϸ� ��� java.lang.ArithmeticException: / by zero
			at day11.ExceptionTest2.main(ExceptionTest2.java:10)�� ���� */
			
			System.out.println("�ι�° ���α׷� �ƱԸ�Ʈ�� 0�� �ƴ� ���� �����ϼ���!");
			
			return;//���θ޼ҵ��� ������ JVM���� ���ư��ڴٴ� ������ ���α׷��� �����ڴٶ�� ��
			//return �ߴµ��� �ұ��ϰ� finally �����Ѵ�.
			
		} catch (NumberFormatException e) {
			//���� Ŭ������ Exception��� �θ� Ŭ������ �ִ�.(Exception e)�� �����ص� �ȴ�.
			//�׷��� ù��° catch ���� Exception e�� ������ ������ ����. �����ϼ��� �Ʒ��� �ڼ��ϼ��� ���� catch ���� �ۼ��ؾ� �Ѵ�.
			e.printStackTrace();
			System.out.println("���α׷� ��ť��Ʈ�� ���ڸ� �����ϼ���!!");
		} finally {
			System.out.println("�׻� ����!!");
		}		
		System.out.println("��������");
	}
}
