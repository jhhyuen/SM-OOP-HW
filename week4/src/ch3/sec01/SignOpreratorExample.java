package ch3.sec01;

// 정수타입의 연산은 byte로 받으면 안되고 int로 받아야한

public class SignOpreratorExample {
	public static void main(String[] args) {
		int x = -100;
		x = -x;
		System.out.println("x: " + x);
		
		byte b = 100;
		int y = -b;
		System.out.println("y: " + y);
	}

}
