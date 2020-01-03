package day14;
import java.io.*;
public class FileReaderTest2 {
    public static void main(String args[]) {
       FileReader reader = null;
       BufferedReader br = null;
       try {
           reader = new FileReader("c:/iotest/output.txt");
           br = new BufferedReader(reader);
           while (true) {
               String data = br.readLine();	// readLine�� ���̻� ���� ���� ������ null�� return��.
               if (data == null)
                   break;               
               System.out.println(data);
           }
       } catch (FileNotFoundException fnfe) {
           System.out.println("������ �������� �ʽ��ϴ�.");
       } catch (IOException ioe) {
           System.out.println("������ ���� �� �����ϴ�.");
       } finally {
          try {
        	   br.close();
               reader.close();
          } catch (Exception e) {
        	  e.printStackTrace();
          }
       }
    }
}
