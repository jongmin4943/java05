package ch05.Hw01;

import java.util.Scanner;

abstract class Calc {
	protected int a,b;
	protected void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
}
class Add extends Calc{
	public int calculate() {
		return a+b;
	}
}
class Sub extends Calc{
	public int calculate() {
		return a-b;
	}
}
class Mul extends Calc{
	public int calculate() {
		return a*b;
	}
}
class Div extends Calc{
	public int calculate() {
		return a/b;
	}
}

public class Hw06 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int a = scan.nextInt();
		int b = scan.nextInt();
		String c = scan.next();
		if(c.equals("+")) {
			Add add = new Add();
			add.setValue(a, b);
			System.out.println(add.calculate());
		} else if(c.equals("-")) {
			Sub sub = new Sub();
			sub.setValue(a, b);
			System.out.println(sub.calculate());
		} else if(c.equals("*")) {
			Mul mul = new Mul();
			mul.setValue(a, b);
			System.out.println(mul.calculate());
		} else if(c.equals("/")) {
			if(b==0) {
				System.out.println("계산이 불가능합니다.");
				return;
			}
			Div div = new Div();
			div.setValue(a, b);
			System.out.println(div.calculate());
		} else {
			System.out.println("입력이 틀렸습니다.");
		}
	}
}
