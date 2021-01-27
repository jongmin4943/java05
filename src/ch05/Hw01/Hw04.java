package ch05.Hw01;

import java.util.Scanner;

interface Stack {
	int length();

	int capacity();

	String pop();

	boolean push(String val);
}

class StackApp implements Stack {
	private String[] stk;	//입력받은 문자열 저장
	private int capacity;	// 스택에 저장 가능한 개수
	private int length;		// 현재 스택에 저장된 개수
	public StackApp(int capa) {
		this.capacity = capa;
		stk = new String[capa];
		this.length = 0;
	}
	@Override
	public int length() {		
		return length;
	}

	@Override
	public int capacity() {		 // stk.length = 3 - 저장된개수
		return stk.length-length();
	}

	@Override
	public String pop() {
		if(length < 1) {
			return null;
		} else {
			String s = stk[length-1];
			length--;
			return s;
		}
	}

	@Override
	public boolean push(String val) {
		if(capacity()>0) {
			stk[length] = val;
			length++;
			return true;
		}
		else return false;
	}

}

public class Hw04 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("총 스택 저장 공간의 크기 입력 >>>");
		int capa = scan.nextInt();
		scan.nextLine();
		StackApp stk = new StackApp(capa);
		while (true) {
			System.out.print("문자열 입력 >>");
			String a = scan.nextLine();
			if(a.equals("그만")) {
				break;
			}
			if(!stk.push(a)) {
				System.out.println("스택이 꽉 차서 푸시 불가!");
			}
		}
		System.out.print("스택에 저장된 모든 문자열 팝");
		for(int i = 0; i<capa; i++) {
			String a = stk.pop();
			System.out.print(a+" ");
		}
	}
}
