package day4;
public class BreakTest3 {
	public static void main(String[] args) {
		unico: for(int dan=1; dan <= 9; dan++) {
			for(int num=1
					
					
					; num <= 9; num++) {
				if(dan*num > 30) {
					System.out.println();
					break unico;
				}
				System.out.print(dan+"x"+num+"="+dan*num+"\t");
			}
			System.out.println();		
		}	
		System.out.println("������ ��� ����!!");
	}
}
