package day14;
import java.io.*;
public class FileWriterTest {
    public static void main(String args[]) {
        FileWriter writer = null;
        String path = "C:/iotest";
        File isDir = new File(path);
        if (!isDir.exists()) {//디렉토리에 파일이 있느냐?
        	isDir.mkdirs();// 파일이 없으면 mkdirs-> 파일을 생성하라는 명령어
        }
        try  {
        	writer = new FileWriter("c:/iotest/output.txt",true);
            char arr[] = { '객', '체', '지', '향', '언', '어', 'J', 'a', 'v', 'a' };          
            for (int cnt = 0; cnt < arr.length; cnt++)
                writer.write(arr[cnt]);
            writer.write(File.pathSeparatorChar);            
            writer.write(arr);
            writer.write("\r\n");	// 계행청리, //\r\t 을 같이줘야  나타난다.
            writer.write("OCJP 시험 대비");
            writer.write("\r\n");
            System.out.println("파일에 출력 완료!!");
        } catch (IOException ioe) {
            System.out.println("파일로 출력할 수 없습니다.");
        } finally {
            try {
            	if (writer != null)
            		writer.close();
            } catch (Exception e) {
            	System.out.println("파일을 닫는동안 오류 발생!!");
            }
        }
    }
}

