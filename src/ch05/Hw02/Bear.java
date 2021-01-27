package ch05.Hw02;

import java.util.Scanner;

public class Bear extends GameObject {
	Scanner scan = new Scanner(System.in);
	public Bear(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}

	@Override
	protected void move() {
		String move = scan.next();
		move.toLowerCase();
		if(move.equals("w") && this.x >1) {
			x -= 1;
		}
		if(move.equals("s") && this.x <9) {
			x += 1;
		}
		if(move.equals("a") && this.y >1) {
			y -= 1;
		}
		if(move.equals("d") && this.y <19) {
			y += 1;
		}
	}

	@Override
	protected char getShape() {
		return 0;
	}
	
}
