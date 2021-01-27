package ch05.Hw01;

import java.util.ArrayList;
import java.util.Scanner;

abstract class Shape {
	private Shape next;

	public Shape() {
		next = null;
	}

	public void setNext(Shape obj) {
		next = obj;
	}

	public Shape getNext() {
		return next;
	}

	public abstract void draw();
}

class Line extends Shape {

	@Override
	public void draw() {
		System.out.println("Line");
	}

}

class Rect extends Shape {

	@Override
	public void draw() {
		System.out.println("Rect");
	}

}

class Circle extends Shape implements Shape01 {

	@Override
	public void draw() {
		System.out.println("Circle");
	}

	@Override
	public double getArea() {
		return 0;
	}

}

public class Hw07 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("그래픽 에디터 beauty를 실행합니다");
		ArrayList<Shape> arr = new ArrayList<>();
		while (true)
			switch (menu()) {
			case 1:
				arr.add(insert());
				break;
			case 2:
				arr.remove(delete(arr));
				break;
			case 3:
				list(arr);
				break;
			case 4:
				System.out.println("beauty를 종료합니다");
				System.exit(0);
				break;
			default:
				System.out.println("해당사항 없습니다.");
			}
	}

	private static void list(ArrayList<Shape> arr) {
		for(int i = 0; i<arr.size(); i++) {
			arr.get(i).draw();
		}
	}

	private static int delete(ArrayList<Shape> arr) {
		int choice = 0;
		System.out.print("삭제할 도형의 위치 >>>");
		try {
			choice = scan.nextInt();
		} catch (Exception e) {
			System.out.println("잘못된 입력입니다.");
			return delete(arr);
		}
		if (choice < 1 ||choice > arr.size()) {
			System.out.println("잘못된 입력입니다.");
			return delete(arr);
		}
		return choice - 1;
	}

	private static Shape insert() {
		int choice;
		Shape p = null;
		System.out.print("Line(1), Rect(2), Circle(3) >> ");
		try {
			choice = scan.nextInt();
		} catch (Exception e) {
			System.out.println("잘못된 입력입니다.");
			return insert();
		}
		if (choice < 1 || choice > 3) {
			System.out.println("잘못된 입력입니다.");
			return insert();
		}
		if (choice == 1) {
			p = new Line();
			p.setNext(p);
		}
		if (choice == 2) {
			p = new Rect();
			p.setNext(p);
		}
		if (choice == 3) {
			p = new Circle();
			p.setNext(p);
		}
		return p.getNext();
	}

	private static int menu() {
		int choice = 0;
		System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
		try {
			choice = scan.nextInt();
		} catch (Exception e) {
			System.out.println("잘못된 입력입니다.");
			return menu();
		}
		return choice;
	}
}
