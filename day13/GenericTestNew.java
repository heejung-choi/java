package day13;
import java.util.*;
public class GenericTestNew {
	public static void main(String[] args) {
		// 제네릭스 라는 구문이 적용되어 만들어진 클래스의 객체 생성시
		// 타입 파라미터라는 것을 사용한다. 
		LinkedList<String> list = new LinkedList<String>();  // 타입파라미터
		//타입 파라미터를 넣으면 집어 넣을 때도 String인지 확인하고, 저장할 때도 확인한다.
		//그렇기 때문에 형변환이 필요 없다.
		list.add("java");
		list.add("100");
		list.add("servlet");
		list.add("jdbc");
		
		for(int i=0; i < list.size(); i++)
			System.out.println(list.get(i));
		System.out.println();		
		
		for(String value : list) {			
			System.out.println(value);
		}
		System.out.println();
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()){
			String s = iter.next();			
			System.out.println(s);
		}
	}
}

