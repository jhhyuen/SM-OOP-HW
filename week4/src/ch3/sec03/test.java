package ch3.sec03;

// 사직연산 기본 int 백만 x 백만하면 int의 연산범위 넘어가서
// 이상한 값나옴 -> 그니까 type cast를 long값으로 변환하고 연산해야 성공
// 이게 오버플로우 : 컴파일에러는 안남 -> 129 원했는데 -127됨 
// 그니까 제발 타입케스트 미리타입값 할당하기

public class test {
	 public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        
	        int x = 1000000;
	        int y = 1000000;
	        int z = x*y;
	        
	        System.out.println(z);
	        
	        System.out.println("-----------------------");
	        
	        long x1 = 1000000;
	        long y1 = 1000000;
	        long z1 = (long)x*(long)y;
	        
	        System.out.println(z1);
	        
	    }

}
