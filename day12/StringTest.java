package day12;
public class StringTest {
	public static void main(String[] args) {
		System.out.println("1".length());// length() ���ϰ� ���� int				
		System.out.println("������".length()); 					
		System.out.println("abc".charAt(1));//.charAt(1) ���ϴ� ���� ������ ������ .charAt(0)�� ù��° �����̴�. 			
		System.out.println("abc".toUpperCase());	 	
		String str1 = "ABCDEFGHIJ";
		String str2 = "abcdefgfhij";
		
		System.out.println(str1.substring(4));//4��° ������  ���    		        
		System.out.println(str1.substring(0, 3));//0��°���� 3��°���� ���  		
		System.out.println(str2.indexOf("f"));//�տ������� f�� ��ġ ���       		  
		System.out.println(str2.lastIndexOf("f"));//�ڿ������� f�� ��ġ ���        
		System.out.println(str2.replace('h', 'H'));//h->H������ ����// ���� �ҰŸ� StringBuffer 	    
		
		String str3 = "java:html5:css3:javascript";
		String[] ary = str3.split(":");//:�� �������� �迭�� ����    
		
		for(int i=0; i < ary.length; i++){
			System.out.println(ary[i]);
		}		
		char ch[] = str3.toCharArray();// �־��� ���ڿ��� �ѱ��ھ� �ɰ��� ����
		System.out.println(str3.length() + " ---- " + ch.length);
		System.out.println(ch);
		for(int i=0; i < ch.length; i++){
			System.out.print(ch[i] + " ");
		}
	}
}













