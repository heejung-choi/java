package day11.case2;

public class TVUser {
	public static void main(String[] args) {
		TV tv = new SamsungTV();//� ��ü�� ������ �������� �޶����� ������ ����.
		tv.powerOn();
		tv.volumnUp();
		tv.volumnDown();
		tv.powerOff();
	}

}
