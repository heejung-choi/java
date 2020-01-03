package day6;

public class MethodTest9 {

	public static void main(String[] args) {
		int size = MethodLab3.getRandom(3, 8);//클래스이름.메소드명 
		int p[] = new int[size];
		for (int i=0; i<p.length; i++)
			p[i]=MethodLab3.getRandom(20);
		for(int data:p)
			System.out.print(data+" ");
		System.out.println();//메인메소드의 p는 메인메소드에서만 사용되고 iseven에서의 p는 거기서만 사용된다.
		boolean flag[] = isEven(p);
		
		for(boolean data:flag)
			//System.out.print(data+" ");
			System.out.print(data ?"짝수 ":"홀수"+" ");//boolean인 경우에만 true를 생략해줄 수 있다(비교연산자)
		System.out.println();
	}
	//전달된 배열의 요소값들을 각각 체크하여
	//짝수면 true 홀수면 false를 저장하는 boolean 타입 배열을 리턴한다.
	//전달된 배열의 크기와 동일한 크기의 boolean 타입 배열을 생성하여 리턴
	static boolean[] isEven(int[]p) { //is ~이냐?
		boolean[]result = new boolean[p.length];
		for(int i=0; i<p.length; i++)//for each문을 쓰게 되면 인덱스들을 또 꺼내는 것을 만들어 줘야 한다.
			result[i] =p[i] % 2==0 ? true : false;//삼항연산자
		return result;
		
	}

}
