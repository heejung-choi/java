package test;

public class Goods {
	String prodId; 	// ��ǰ ���̵� 
	String prodName; // ��ǰ �̸� 
	int price; 	// ��ǰ ���� 
	char asYn; 	// AS ���� ���� 
	
	Goods(){}
	Goods(String prodId,String prodName,int price,char asYn)
	{
		this.prodId=prodId;
		this.prodName=prodName;
		this.price=price;
		this.asYn=asYn;
	
	}
	
	
	public String getGoodsInfo() {
		if(asYn=='Y')
			return "��ǰID : "+prodId+",��ǰ�� : "+prodName+",����: "+price+",AS���ɿ���: "+asYn;
		else
			return "��ǰID : "+prodId+",��ǰ�� : "+prodName+",����: "+price+",AS���ɿ���: "+asYn;
	}

}
