package ch05.Hw01;

import java.util.Scanner;

abstract class Converter {
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;
	
	public void run( ) {
		Scanner scan = new Scanner(System.in);
		System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다.");
		System.out.print(getSrcString() + "을 입력하세요>> ");
		double val = scan.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과: " + res + getDestString() + "입니다.");
		scan.nextLine();
		scan.close();
	}
}

class Won2Dollar extends Converter {
	private double src;
	private String srcString;
	private String destString;
	public Won2Dollar(double i) {
		this.src = i;
		this.srcString = "원";
		this.destString = "달러";
	}

	@Override
	protected double convert(double src) {
		return src/1200;
	}

	@Override
	protected String getSrcString() {
		return this.srcString;
	}

	@Override
	protected String getDestString() {
		return this.destString;
	}
	
}

class Km2Mile extends Converter {
	private double d;
	private String scr;
	private String dest;
	public Km2Mile(double d) {
		this.d = d;
		this.scr = "Km";
		this.dest = "Mile";
	}
	@Override
	protected String getSrcString() {
		return this.scr;
	}
	@Override
	protected String getDestString() {
		return this.dest;
	}
	@Override
	protected double convert(double src) {
		return src/1.6;
	}

	
}

public class Hw02 {
	public static void main(String[] args) {
//		Won2Dollar toDollar = new Won2Dollar(1200);
//		toDollar.run();
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();
	}
}
