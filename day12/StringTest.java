package day12;
public class StringTest {
	public static void main(String[] args) {
		System.out.println("1".length());// length() 리턴값 유형 int				
		System.out.println("가나다".length()); 					
		System.out.println("abc".charAt(1));//.charAt(1) 원하는 문자 꺼내는 것으로 .charAt(0)이 첫번째 문자이다. 			
		System.out.println("abc".toUpperCase());	 	
		String str1 = "ABCDEFGHIJ";
		String str2 = "abcdefgfhij";
		
		System.out.println(str1.substring(4));//4번째 값부터  출력    		        
		System.out.println(str1.substring(0, 3));//0번째부터 3번째까지 출력  		
		System.out.println(str2.indexOf("f"));//앞에서부터 f의 위치 출력       		  
		System.out.println(str2.lastIndexOf("f"));//뒤에서부터 f의 위치 출력        
		System.out.println(str2.replace('h', 'H'));//h->H값으로 변경// 많이 할거면 StringBuffer 	    
		
		String str3 = "java:html5:css3:javascript";
		String[] ary = str3.split(":");//:을 기준으로 배열로 생성    
		
		for(int i=0; i < ary.length; i++){
			System.out.println(ary[i]);
		}		
		char ch[] = str3.toCharArray();// 주어진 문자열을 한글자씩 쪼개서 리턴
		System.out.println(str3.length() + " ---- " + ch.length);
		System.out.println(ch);
		for(int i=0; i < ch.length; i++){
			System.out.print(ch[i] + " ");
		}
	}
}













