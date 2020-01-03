package day11;

import java.util.Random;


class DuplicateException extends Exception {
    DuplicateException() {
    	super("중복된 로또 번호가 발생했습니다");//예외 메세지
    		
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
		//throw 뒤에 예외 객체 지정, 예외가 발생했을 때 public void checkLottoNums()에게  알리기 위해 throw절을 한다.
		//throw절 뒤에 나오는 것에 따라 어떤 예외가 발생했는가를 볼 수 있다.
		for(int i=0 ; i<nums.length ; i++)
			for(int n=i+1; n<nums.length ; n++)
				if(nums[i]==nums[n]) 
					throw new DuplicateException();
									
	}
	public int[] getNums() {
		return nums;//return값이 int형 배열이다. int 배열의 참조값을 리턴한다.
	}
	
}
