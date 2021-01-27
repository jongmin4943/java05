package ch05.Hw02;

public class Main {
	public static void main(String[] args) {
		BearGame game = new BearGame();
		Bear bear = new Bear(0,0,1);
		Fish fish = new Fish(6,4,3);
		game.drawBoard(bear,fish);
		System.out.println("게임종료!");
		
	}
}
