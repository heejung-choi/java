package test;


public class GoodsTest {
	public static void main(String[] args) {
		Goods[]a= new Goods[2];
		a[0]=new Goods("PRD-0001","듀크컴퓨터",10000,'N');
		a[1]=new Goods("PRD-0002","턱시컴퓨터",20000,'Y');
		
		for(int i = 0; i<a.length ; i++)
			System.out.println(a[i].getGoodsInfo());
	
	
        // 생성된 객체 각각 getGoodsInfo()를 호출하고 리턴결과를 출력합니다.
		
	
	}
}
