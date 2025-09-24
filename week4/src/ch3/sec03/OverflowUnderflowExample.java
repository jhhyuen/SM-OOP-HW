package ch3.sec03;

// 오버플로우,언더플로우하면 싸이클처럼 돌아간다(byte=1bit 2진수 메모리값으로 역추적확인)
public class OverflowUnderflowExample {
    public static void main(String[] args) {
        byte var1 = 125;
        for(int i=0; i<5; i++) {       //{}를 5번 반복 실행
            var1++;                    //++ 연산은 var1의 값을 1 증가시킨다.
            System.out.println("var1: " + var1);
        }

        System.out.println("-----------------------");

        byte var2 = -125;
        for(int i=0; i<5; i++) {       //{}를 5번 반복 실행
            var2--;                    //-- 연산은 var2의 값을 1 감소시킨다.
            System.out.println("var2: " + var2);
        }
    }


}
