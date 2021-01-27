package ch05.Hw02;

import java.util.Random;

public class Fish extends GameObject {
	Random ran = new Random();
	public Fish(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}

	@Override
	protected void move() {
		int move = ran.nextInt(4);
		if(move == 0 && this.x >1) {
			x -= 1;
		}
		if(move == 1 && this.x <9) {
			x += 1;
		}
		if(move == 2 && this.y >1) {
			y -= 1;
		}
		if(move == 3 && this.y <19) {
			y += 1;
		}
	}

	@Override
	protected char getShape() {
		return 0;
	}

}
