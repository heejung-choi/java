package day4;

public class CharacterTest1 {
	public static void main(String[] args) {
	char v1 = 65;
	char v2 = 'A'; //ASCII
	//컴파일러가 알고있는것을 예약어라고 한다. 그래서 'A'라고 안하고 A라고 하면 오류가 난다.
	char v3 = 0x41;//영(공)엑스
	char v4 = '\u0041';//유니코드
	System.out.println(v1);
	System.out.println(v2);
	System.out.println(v3);
	System.out.println(v4);
	int v5 = 65;
	int v6 = 'A';
	int v7 = 0x41;
	int v8 = '\u0041'; 
	System.out.println(v5);
	System.out.println(v6);
	System.out.println(v7);
	System.out.println(v8);
	
	System.out.println((char)(v1+1)); // 타입명
	System.out.println((char)(v2+1));
	System.out.println((char)(v3+1));
	System.out.println((char)(v4+1));
	
	System.out.println(++v1); //++는 타입을 그대로 유지한다.
	System.out.println(++v2);
	System.out.println(++v3);
	System.out.println(++v4);
	
	System.out.println(v1+=10);
	}
}
