package test;

public class Goods {
	String prodId; 	// 상품 아이디 
	String prodName; // 상품 이름 
	int price; 	// 상품 가격 
	char asYn; 	// AS 가능 여부 
	
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
			return "상품ID : "+prodId+",상품명 : "+prodName+",가격: "+price+",AS가능여부: "+asYn;
		else
			return "상품ID : "+prodId+",상품명 : "+prodName+",가격: "+price+",AS가능여부: "+asYn;
	}

}
