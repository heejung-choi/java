package day12;

public class StringBufferTest {

	public static void main(String[] args) {		
		StringBuffer buffer = new StringBuffer();
		String str = "자바프로그래밍";
     		buffer.append(str);

        System.out.printf("%s\n", buffer);
       // buffer.reverse();//buffer 개체를 앞뒤로 바꿔준다,
        System.out.printf("%s\n", buffer);
        System.out.printf("길이 : %d\n", buffer.length());
        
        StringBuffer buffer2 = new StringBuffer();
        buffer2.append('자');//append 문자열 맨뒤에 추가해주는 것
        buffer2.append('바');
        buffer2.append('프');
        buffer2.append('로');
        buffer2.append('그');
        buffer2.append('래');
        buffer2.append('밍');
        System.out.println(buffer == buffer2);
        System.out.println(buffer.equals(buffer2));//StringBuffer여기에는  equals가 없어서 형변환 시켜서 비교해야함
        System.out.println(buffer.toString().equals(buffer2.toString()));
        
        
        
        
	}
}






