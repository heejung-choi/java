package day14;
import java.io.*;
public class FileWriterTest2 {
    public static void main(String args[]) {      
        try (FileWriter  writer = new FileWriter("c:/iotest/output2.txt");){     
        	//	------> �ڵ����� close�� �ȴ�. Java5 ���� ����,
        	//try�� ��ü�����ϴ� ������ ������ �����Ѵ�.
            char arr[] = { '��', 'ü', '��', '��', '��', '��', 'J', 'a', 'v', 'a' };          
            for (int cnt = 0; cnt < arr.length; cnt++)
                writer.write(arr[cnt]);
            writer.write('\n');
            writer.write(arr);
            writer.write('\n');
            writer.write("OCJP ���� ���!!");
            writer.write('\n');  
            System.out.println("���Ͽ� ��� �Ϸ�!!");
        } catch (IOException ioe) {
            System.out.println("���Ϸ� ����� �� �����ϴ�.");
        } 
    }
}
