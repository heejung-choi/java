package day9;

import day6.MethodLab3;

class Multiplication {
	private int dan;
	private int number;
	Multiplication() {
	}
	Multiplication(int dan) {
		this.dan = dan;
	}
	Multiplication(int dan, int number) {
		this.dan = dan;
		this.number = number;
	}
	public void printPart() {
		if (number == 0) {
			for (int n = 1; n <= 9; n++)
				System.out.print("\t" + dan + "*" + n + "=" + dan * n);
			System.out.println();
		} else {
			System.out.println(dan * number);
		}
	}
}
class GuGuDanExpr extends Multiplication {
	GuGuDanExpr(int dan) {
		super(dan);
	}
	GuGuDanExpr(int dan, int number) {
		super(dan, number);
	}
	public static void printAll() {
		for (int dan = 1; dan <= 9; dan++) {
			for (int num = 1; num <= 9; num++)
				System.out.print(dan + "x" + num + "=" + dan * num + "\t");
			System.out.println();
		}
	}
}
public class GuGuDan {
	public static void main(String[] args) {
		int dan = MethodLab3.getRandom(20);
		int number = MethodLab3.getRandom(20);

		if (dan >= 10)
			GuGuDanExpr.printAll();
		else if (number >= 10) {
			GuGuDanExpr b = new GuGuDanExpr(dan);
			b.printPart();
		} else {
			GuGuDanExpr a = new GuGuDanExpr(dan, number);
			System.out.print(dan + "*" + number + "=");
			a.printPart();
		}
	}
}
