package day14;
public class HashCodeTest {
	public static void main(String[] args) {
		String s1 = new String("��ũ");
		String s2 = new String("��ũ");
		String s3 = new String("��ũ");
		String s4 = new String("��ũ");
		String s5 = "��ũ";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
		String s6 = new String("��浿");
		String s7 = new String("��ũ1");
		System.out.println(s6.hashCode());
		System.out.println(s7.hashCode());
	}
}
