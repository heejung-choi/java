package day11;


public class TVTest {
	   public static void main(String args[]) {
	     //SaleTV, RentalTV Ŭ������ ��ü�� ���� �����Ѵ�.
		   SaleTV s = new SaleTV(300000,"SALETV-1",40,1);
		   RentalTV r = new RentalTV(100000,"RENTALTV-10",42,1);
		   
		  //SaleTV ��ü�� ä���� �� �� ���δ�.
		  //RentalTV ��ü�� ä���� �� �� ������.
		  //�� ��ü�� ���Ͽ� printAllTV()�� ȣ���Ѵ�		   
		   s.channelUp();
		   s.channelUp();
		   printAllTV(s);
		   r.channelDown();
		   r.channelDown();
		   r.channelDown();
		   printAllTV(r);	
		   
		 //Rentable Ÿ���� ��ü�� RentalTV ��ü�� printRentalTV() �� ȣ���Ѵ�.
		   printRentalTV((Rentable)r);     
	    
	   }
	   static void printAllTV(TV tv) {
		 // �ƱԸ�Ʈ�� ���޵� ��ü�� toString() �� ȣ���Ͽ� �� ��ǰ�� ������ ����Ѵ�.
		  System.out.println(tv.toString());
		 // �ƱԸ�Ʈ�� ���޵� ��ü�� play() �� ȣ���Ѵ�.
		 // tv ������ ���޵� ��ü�� SaleTV Ÿ���̸� sale() �޼��带 ȣ���Ѵ�.  
		  if(tv instanceof SaleTV) {
			  ((SaleTV) tv).play();
			  ((SaleTV) tv).sale();}
		  else 
			  ((RentalTV) tv).play();
	  
	   }
	   static void printRentalTV(Rentable tv) {
	     tv.rent();
	   }   
	}
