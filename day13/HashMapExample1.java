package day13;
import java.util.*;
public class HashMapExample1 {
    public static void main(String args[]) {
        HashMap<String, Integer> map = 
        		new HashMap<String, Integer>();
        map.put("�ظ�", new Integer(95));
        map.put("�츣�̿´�", 100);
        map.put("��", 85);
        map.put("�巹����", 93);
        map.put("�׺�", 70);
        map.put("�츣�̿´�", 55); // JDK 1.5 Auto Boxing ����
        System.out.println(map);
        Integer num = map.get("�츣�̿´�");
        System.out.println("�츣�̿´��� ������? " + num);
        System.out.println(map);
    }
}
