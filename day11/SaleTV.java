package day11;

public class SaleTV extends TV {
	int price;
	SaleTV(){}
	SaleTV(int price,String model, int size, int channel){
		super(model,size,channel);
		this.price=price;
	}
	public void play() {
		System.out.println("�Ǹ� TV ä��"+channel+"���� ���θ� �÷��� �մϴ�.");
	}
	public void sale() {
		System.out.println(model+"���� ��ǰ�� �Ǹ��մϴ�."+price+"�� ������ �ּ���.");
	}
	public String toString() {
		return "�ǸŻ�ǰ����: �𵨸�("+model+"), "+"����("+price+"), "+"ũ��("+size+")";
	}
	
	
}
