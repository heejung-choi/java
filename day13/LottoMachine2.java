package day13;

import java.util.HashSet;
//import java.util.Iterator;

public class LottoMachine2 {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		while(true){
			int b = (int)(Math.random()*21)+10;
			set.add(b);
			if(set.size()==10) break;			
		}		
		System.out.print("������ �ζ� ��ȣ:" +set);
		
		/*			
		Iterator<Integer> iterator = set.iterator();
		System.out.printf("������ �ζ� ��ȣ: [%d",iterator.next());
		while (iterator.hasNext()) {
			int str = iterator.next();            
            System.out.printf(",%d",str);       
		} System.out.print("]");*/

}
}
