package ch05.ex02;

class Point {
	protected int x,y;
	// default 생성자
	public Point () {
		x = y = 0;
		System.out.println("Point class default 생성자 호출");
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point class overloaded 생성자 호출");
	}
	void showPoint() {
		System.out.printf("(%d, %d)\n", x, y);
	}
}

class ColorPoint extends Point {
	private String color;
	ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
		System.out.println("ColorPoint class overloaded 생성자 호출");
	}
	void showColorPoint() {
		System.out.print(color);
		super.showPoint();
//		showPoint(); 다된다
//		this.showPoint();
	}
}


public class SuperEx {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(3, 1, "Blue");
		cp.showColorPoint();
	}

}
