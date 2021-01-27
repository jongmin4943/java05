package ch05.Hw02;

import java.util.Arrays;
import java.util.Scanner;

public class BearGame {
	Scanner scan = new Scanner(System.in);

	public void drawBoard(Bear bear, Fish fish) {
		String[][] board = new String[10][20];
		int count = 0;
		while (true) {
			for (int i = 0; i < 50; ++i) System.out.println(); //지우기
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[i].length; j++) {
					board[i][j] = "-";
					board[fish.getX()][fish.getY()] = "@"; // 양옆 y
					board[bear.getX()][bear.getY()] = "B"; // 위아래가 x
				}
			}
			for (int i = 0; i < board.length; i++) {
				for(int j = 0; j < board[i].length; j++) {
					System.out.print(board[i][j]);
				}
				System.out.println();
			}
			if(bear.collide(fish)) {
				break;
			}
			bear.move();
			count++;
			if (count == 3) {
				fish.move();
				count = 0;
			}
		}
	}
}
