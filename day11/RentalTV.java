package day11;

public class RentalTV extends TV implements Rentable{
	int price;
	RentalTV(){}
	RentalTV(int price,String model, int size, int channel){
		super(model,size,channel);
		this.price=price;
	}
	public void play() {
		System.out.println("�뿩 TV ä��"+channel+"���� ���θ� �÷��� �մϴ�.");
	}
	public void rent() {
		System.out.println(model+"���� ��ǰ�� �뿩�մϴ�."+price+"�� ������ �ּ���.");
	}
	public String toString() {
		return "�뿩��ǰ����: �𵨸�("+model+"), "+"����("+price+"), "+"ũ��("+size+")";
	}
}