package ch05.ex03;

public class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface {
	public void sendCall() {
		System.out.println("전화 걸기");
	}

	public void receiveCall() {
		System.out.println("전화 받기");
	}

	public void sendSMS() {
		System.out.println("SMS 보내기");
	}

	public void receiveSMS() {
		System.out.println("SMS 받기");
	}

	@Override
	public void play() {
		System.out.println("음악 재생");
	}

	@Override
	public void stop() {
		System.out.println("재생 중지");
	}
	
	public void schedule() {
		System.out.println("일정관리");
	}

}
