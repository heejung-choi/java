package day14;
import java.io.*;
public class FileWriterTest2 {
    public static void main(String args[]) {      
        try (FileWriter  writer = new FileWriter("c:/iotest/output2.txt");){     
        	//	------> 자동으로 close가 된다. Java5 부터 가능,
        	//try에 객체생성하는 문장을 여러개 생성한다.
            char arr[] = { '객', '체', '지', '향', '언', '어', 'J', 'a', 'v', 'a' };          
            for (int cnt = 0; cnt < arr.length; cnt++)
                writer.write(arr[cnt]);
            writer.write('\n');
            writer.write(arr);
            writer.write('\n');
            writer.write("OCJP 시험 대비!!");
            writer.write('\n');  
            System.out.println("파일에 출력 완료!!");
        } catch (IOException ioe) {
            System.out.println("파일로 출력할 수 없습니다.");
        } 
    }
}
