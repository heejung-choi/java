package day7;

public class MethodTest10 {
	public static void main(String[] args) {
		int p1[]= {20,10,14,30};
		System.out.println("p1 변수의 값: "+p1);
		//p1 변수의 값: [I@15db9742 4바이트 16진수의 값
		//updateArray1 이 수행되는 경우에는 p1,p2와 같은 참조 값을 갖는다.
		//이것을 지역변수 스코프라고 부른다.
		printArray(p1);
		int[] result =updateArray1(p1);
		printArray(result);
		printArray(p1);
		System.out.println("--------------");
		updateArray2(p1);
		printArray(p1);
		//updateArray1 p1이 참조하고 있는 배열을 바꾸지 않지만 updateArray2는 배열을 바꾼다.
		//updateArray2는 리터블하다.
		
	}
	static void printArray(int[]p2) {//void 리턴값이 없다.
		for(int d:p2)
			System.out.printf("%d",d);//%d 10진 정수의 형태로 출력
		//printf는 포맷문자열을 먼저 줘야한다.
		System.out.printf("\n");// \n줄바꿈
	
	
	}
	static int[]updateArray1(int[]p2){//리턴값이 int로 형성되어 있는 배열이다.
		System.out.println("p2 변수의 값: "+p2);
		int[] result =new int[p2.length];
		for(int i=0; i<result.length; i++)//p2.length와 result.length와 동일
			result[i]=p2[i]*2;
		return result;
	}
	
	static void updateArray2(int[]p3){
		System.out.println("p3 변수의 값: "+p3);
		for(int i=0; i<p3.length; i++)
			p3[i]=p3[i]*2;//각각의 엘먼트값을 곱하기 하여 다시 엘먼트로 보내고 있다.
	}
}
