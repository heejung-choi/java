package day13;
import java.util.*;
public class HashtableExample1 {
    public static void main(String args[]) {
        Hashtable<String, Integer> hashtable = 
        		new Hashtable<String, Integer>();
        hashtable.put("�ظ�", new Integer(95));
        hashtable.put("�츣�̿´�", new Integer(100));
        hashtable.put("��", new Integer(85));
        hashtable.put("�巹����", new Integer(93));
        hashtable.put("�׺�", new Integer(70));
        hashtable.put("�츣�̿´�", 55); // JDK 1.5 Auto Boxing ����
        System.out.println(hashtable);
        Integer num = hashtable.get("�츣�̿´�");
        System.out.println("�츣�̿´��� ������? " + num);
    }
}
