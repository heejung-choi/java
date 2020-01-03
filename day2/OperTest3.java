package day2;

public class OperTest3 {
	public static void main(String[] args) {
	 int ivalue;
	 char cvalue;
	 double dvalue;
	 boolean bvalue;
	 
	 ivalue = 100;
	 cvalue = 'A';
	 dvalue = 3.14;
	 bvalue = true;
	 
	 System.out.println(ivalue);
	 System.out.println(cvalue);
	 System.out.println(dvalue);
	 System.out.println(bvalue);
	 
	 ivalue = cvalue;
	 System.out.println(ivalue);// 문자데이터를 십진수 값으로 바꿔 내보냄 //65
	 
	 /*ivalue = dvalue;
	 System.out.println(ivalue); 값이 더 작은것으로는 변환할 수 없음 */
	 
	 ivalue = (int)dvalue; //강제로 형변환하겠다는 뜻 -> 값이 손실되더라도 변환하갰다는 뜻
	 // 형변환 연산자라고 부름
	 System.out.println(ivalue);
	 
	/* ivalue = bvalue;
	 ivalue = (int)bvalue; 형변환에 boolean은 제외된다. 자동, 강제 형변환 둘다 안된다.*/


}
}
