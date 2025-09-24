package ch3.sec05;
// 자바의 장점 : 예외처리(컴파일오류는 안뜨고 논리오류떠서 원하는 결과가 안나올때)
// 예외처리class api를 통해 논리적 오류를 찾아낼 수 있다.
public class InfinityAndNanCheckExample {
	 public static void main(String[] args) {
	        int x = 5;
	        double y = 0.0;
	        double z = x / y;
	        //double z = x % y;

	        //잘못된 코드
	        System.out.println(z + 2);

	        //알맞은 코드
	        if(Double.isInfinite(z) || Double.isNaN(z)) { 
	        	// "변수 z의 값이 무한대(Infinity) 이거나, 혹은 숫자 아님(NaN) 상태입니까?"
	            System.out.println("값 산출 불가");
	        } else {
	            System.out.println(z + 2); // 맞으면 계산결과 내보든가.
	        }
	    }

}
