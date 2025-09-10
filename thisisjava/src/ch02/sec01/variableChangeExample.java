package ch02.sec01;

// 변수끼리 넣을 수 있
public class variableChangeExample {
	
	public static void main(String[] args) {
		int x=3;
		int y=5;
		System.out.println("x:"+x+", y"+y);
		
		int temp=x;
		x=y;
		y=temp;
		System.out.println("x:"+x+", y"+y);
	}
	
	

}