package ch05.Hw01;

//1번
class TV {
	public TV() {}
	private int size;
	public TV(int size) {this.size = size;}
	protected int getSize() {return size;}
}

class ColorTV extends TV{
	private int size2;
	public ColorTV(int size,int size2) {
		super(size);
		this.size2 = size2;
	}
	public int getSize2() {
		return size2;
	}
	public void printProperty() {
		System.out.printf("%d인치 %d컬러\n",getSize(),size2);
		
	}
}

//2번
class IPTV extends ColorTV {
	private String ip;
	public IPTV(String ip,int size, int size2) {
		super(size, size2);
		this.ip = ip;
	}
	public void printProperty() {
		System.out.printf("나의 IPTV는 %s 주소의 %d인치 %d컬러\n",ip,getSize(),getSize2());
	}
	
}
public class Hw01 {
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
		
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		
		iptv.printProperty();
	}
}
