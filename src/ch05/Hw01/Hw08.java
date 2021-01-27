package ch05.Hw01;

interface Shape01 {
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.print("---다시 그립니다.");
		draw();
	}
}

class Circle01 implements Shape01 {
	int r;
	public Circle01(int r) {
		this.r = r;
	}

	@Override
	public void draw() {
		System.out.println("반지름이 " +r+ "인 원입니다.");
	}

	@Override
	public double getArea() {
		return r*r*PI;
	}
	
}
class Rect01 implements Shape01 {
	int x,y;
	public Rect01(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw() {
		System.out.println("가로 " +x+"세로 "+y+ "인 사각형입니다.");
	}

	@Override
	public double getArea() {
		return x*y;
	}
	
}
class Oval implements Shape01 {
	int x,y;
	public Oval(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw() {
		System.out.printf("%d와 %d인 사각형에 내접하는 타원입니다.\n",x,y);
	}

	@Override
	public double getArea() {
		return x/2*y/2*PI;
	}
	
}

public class Hw08 {
	public static void main(String[] args) {
		Shape01[] list = new Shape01[3];
		list[0] = new Circle01(10);
		list[1] = new Oval(20,30);
		list[2] = new Rect01(10,40);
		
		for(int i=0; i<list.length; i++) {
			list[i].redraw();
		}
		for(int i =0; i<list.length; i++) {
			System.out.println("면적은 "+list[i].getArea());
		}
	}
}
