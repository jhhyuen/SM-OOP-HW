package ch02.sec02;

// 2진수,8진수,16진수 넣어서 돌리면 10진수로 출력

public class IntegerLiteraExample {
	public static void main(String[] args) {
		int var1 = 0b1011; // 2진수
		int var2 = 0206; // 8진
		int var3 = 365; // 10진
		int var4 = 0xB3; // 16진
		
		System.out.println("var1: "+var1);
		System.out.println("var2: "+var2);
		System.out.println("var3: "+var3);
		System.out.println("var4: "+var4);
	}

}
