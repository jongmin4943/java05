package ch05.Hw01;

abstract class PairMap {
	protected String keyArray[]; // key 들을 저장하는 배열
	protected String valueArray[]; // value 들을 저장하는 배열

	abstract String get(String key); // key값을 가진 value 리턴, 없으면 null

	abstract void put(String key, String value);

	abstract String delete(String key);

	abstract int length(); // 현재 저장된 아이템 개수
}

class Dictionary extends PairMap {
	private int i;

	public Dictionary(int i) {
		keyArray = new String[i];
		valueArray = new String[i];
		this.i = i;
	}

	@Override
	String get(String key) {
		for (int i = 0; i < keyArray.length; i++) {
			String ans = keyArray[i];
			if (key.equals(ans)) {
				return valueArray[i];
			}
		}
		return null;
	}

	@Override
	void put(String key, String value) {
		for (int i = 0; i < keyArray.length; i++) {
			String ans = keyArray[i];
			if (key.equals(ans)) {
				valueArray[i] = value;
			} else if (keyArray[i] == null) {
				keyArray[i] = key;
				valueArray[i] = value;
				break;
			}
		}
	}

	@Override
	String delete(String key) {
		String result = "";
		for (int i = 0; i < keyArray.length; i++) {
			String ans = keyArray[i];
			if (key.equals(ans)) {
				keyArray[i] = null;
				result = valueArray[i];
				valueArray[i] = null;
			}
		}
		return result;
	}

	@Override
	int length() {
		return keyArray.length;
	}

}

public class Hw05 {
	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("황기태", "자바");
		dic.put("이재문", "파이썬");
		dic.put("이재문", "C++");
		System.out.println("이재문의 값은 " + dic.get("이재문"));
		System.out.println("황기태의 값은 " + dic.get("황기태"));
		dic.delete("황기태");
		System.out.println("황기태의 값은 " + dic.get("황기태"));
	}
}
