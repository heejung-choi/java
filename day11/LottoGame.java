package day11;

import java.util.Random;


class DuplicateException extends Exception {
    DuplicateException() {
    	super("�ߺ��� �ζ� ��ȣ�� �߻��߽��ϴ�");//���� �޼���
    		
    }
}

public class LottoGame {

	public static void main(String[] args) {		
		LottoMachine lotto = new LottoMachine();
		lotto.createLottoNums();
		try { lotto.checkLottoNums();}
		catch(DuplicateException e) {
			System.out.println(e.getMessage());
			return;
		}	
		int num[] = lotto.getNums();
		for(int i=0; i<6; i++) {
			if(i==5)
				System.out.printf("%d ",num[i]);
			else
				System.out.printf("%d, ",num[i]);
			}
		}
}


class LottoMachine {
	private int nums[];
	public LottoMachine(){
		nums = new int[6];
	}
	public void createLottoNums() {
		Random rand = new Random();
		for(int n=0 ; n<nums.length ; n++)    
			nums[n]=rand.nextInt(20)+1;
	}
	public void checkLottoNums() throws DuplicateException{
		//throw �ڿ� ���� ��ü ����, ���ܰ� �߻����� �� public void checkLottoNums()����  �˸��� ���� throw���� �Ѵ�.
		//throw�� �ڿ� ������ �Ϳ� ���� � ���ܰ� �߻��ߴ°��� �� �� �ִ�.
		for(int i=0 ; i<nums.length ; i++)
			for(int n=i+1; n<nums.length ; n++)
				if(nums[i]==nums[n]) 
					throw new DuplicateException();
									
	}
	public int[] getNums() {
		return nums;//return���� int�� �迭�̴�. int �迭�� �������� �����Ѵ�.
	}
	
}
