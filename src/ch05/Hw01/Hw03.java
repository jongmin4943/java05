package ch05.Hw01;

//5번
class Point {
	private int x,y;
	public Point(int x, int y) {
		this.x =x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class ColorPoint extends Point {
	private String color;
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	public ColorPoint() {
		super(0,0);
		this.color = "BLACK";
	}
	public ColorPoint(int i, int j) {
		super(i,j);
	}
	public void setXY(int i, int j) {
		super.move(i,j);
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return String.format("%s색의 (%d,%d)의 점",color,getX(),getY());
	}
}

class Point3D extends Point {
	private int z;
	public Point3D(int x, int y) {
		super(x,y);
		
	}
	public Point3D(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}
	protected void move(int x, int y, int z) {
		super.move(x, y);
		this.z = z;
	}
	@Override
	public String toString() {
		return String.format("(%d,%d,%d)의 점",getX(),getY(),this.z);
	}
	public void moveUp() {
		this.z++;
		
	}
	public void moveDown() {
		this.z--;
	} 
}

class PositivePoint extends Point {

	public PositivePoint(int x, int y) {
		super(x, y);
		if(x<0 && y<0) {
			super.move(0, 0);
		}
	}

	public PositivePoint() {
		this(0,0);
	}
	
	public void move(int x, int y) {
		if(x>0 && y>0) {
			super.move(x, y);
		} else {
			super.move(getX(),getY());
		}
	}
	@Override
	public String toString() {
		return String.format("(%d,%d)의 점",getX(),getY());
	}
}

public class Hw03 {
	
	public static void main(String[] args) {
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");
		
		p.move(-5, 5); //p는 음수공간으로 이동하지않음..
		System.out.println(p.toString() + "입니다.");
		
		PositivePoint p2 = new PositivePoint(-10,-10);
		System.out.println(p2.toString() + "입니다.");
		
	}
	
	public static void main03(String[] args) {
		Point3D p = new Point3D(1,2,3);
		System.out.println(p.toString() + "입니다.");
		
		p.moveUp();
		System.out.println(p.toString() + "입니다.");
		p.moveDown();
		p.move(10,10);
		System.out.println(p.toString() + "입니다.");
		
		p.move(100,200,300);
		System.out.println(p.toString() + "입니다.");
	}
	
	public static void main02(String[] args) {
		ColorPoint zeroPoint = new ColorPoint();
		System.out.println(zeroPoint.toString() + "입니다.");
		
		ColorPoint cp = new ColorPoint(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
	}
	
	
	
	public static void main01(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10,20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다. ");
	}
}
