package test;


public class GoodsTest {
	public static void main(String[] args) {
		Goods[]a= new Goods[2];
		a[0]=new Goods("PRD-0001","��ũ��ǻ��",10000,'N');
		a[1]=new Goods("PRD-0002","�ν���ǻ��",20000,'Y');
		
		for(int i = 0; i<a.length ; i++)
			System.out.println(a[i].getGoodsInfo());
	
	
        // ������ ��ü ���� getGoodsInfo()�� ȣ���ϰ� ���ϰ���� ����մϴ�.
		
	
	}
}
