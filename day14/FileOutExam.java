package day14;

import java.io.*;
import java.util.GregorianCalendar;

public class FileOutExam {
    public static void main(String args[]) {
        FileWriter writer = null;
        String path = "C:/iotest";
        File isDir = new File(path);
        if (!isDir.exists()) {
        	isDir.mkdirs();
        }
        try  {
        	writer = new FileWriter("c:/iotest/today.txt",true);
    		GregorianCalendar gc = new GregorianCalendar();
    		gc = new GregorianCalendar(1995, 3, 29);	//month�� ��� -1
    		GregorianCalendar today = new GregorianCalendar();
    		int f = today.get(GregorianCalendar.DAY_OF_WEEK);
    		GregorianCalendar todaytt = new GregorianCalendar();
    		int yr = todaytt.get(GregorianCalendar.YEAR);
    		int mh = todaytt.get(GregorianCalendar.MONTH)+1;
    		int dy = todaytt.get(GregorianCalendar.DATE);
    
            char t;
            switch (f) {
            case 1:
            	t = '��';
            	break;
            case 2:
            	t = '��';
                break;
            case 3:
            	t = 'ȭ';
                break;
            case 4:
            	t = '��';
                break;
            case 5:
            	t = '��';
                break;
            case 6:
            	t = '��';
                break;
            default :
            	t = '��';
                break;
            }
            writer.write("������ " + yr + "�� " + mh + "�� " + dy + "���Դϴ�.");
            writer.write("\n");
            writer.write("������ " + t + "�����Դϴ�.");
            writer.write("\n");
            int n = gc.get(GregorianCalendar.DAY_OF_WEEK);
            char c;
            switch (n) {
            case 1:
            	c = '��';
            	break;
            case 2:
            	c = '��';
                break;
            case 3:
            	c = 'ȭ';
                break;
            case 4:
            	c = '��';
                break;
            case 5:
            	c = '��';
                break;
            case 6:
            	c = '��';
                break;
            default :
            	c = '��';
                break;
            }
            writer.write("�ڹμ��� " + c + "���Ͽ� �¾���ϴ�.");
            System.out.println("������ �Ϸ�Ǿ����ϴ�.");
            
        } catch (IOException ioe) {
            System.out.println("���Ͽ� �����ϴ� ���� ������ �߻��߽��ϴ�.");
        }
            
            finally {
                try {
                	if (writer != null)
                		writer.close();
                } catch (Exception e) {
              }
          }
      } 
  }