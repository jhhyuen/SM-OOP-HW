package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 키보드 입력 객
        boolean run = true; // true동안 프로그램 계속 실행(스위치역할)
        int speed = 0; // 당연히 속도의 초깃값

        while(run) { //run = true니까 코드는 무한히 반복: 뛰는 중
        	// 사용자한테 보여질 부분 + 선택입력란  
            System.out.println("-----------------------------");
            System.out.println("1.증속 | 2.감속 | 3.중지");
            System.out.println("-----------------------------");
            System.out.print("선택: ");
            
            // 선택입력란에 적혀진 1,2,3중 하나를 strNum변수에 저장
            // 저장된 변수값에 따라 if,else문이 작동한다.
            
            String strNum = scanner.nextLine();

            if(strNum.equals("1")) {
                speed++;//1이면증
                System.out.println("현재 속도 = " + speed);
            } else if(strNum.equals("2")) {
                speed--;//2면감
                System.out.println("현재 속도 = " + speed);
            } else if(strNum.equals("3")) {
                run = false;//3은 run=true->false처리 중지 : while문 탈출  
            }
        }

        System.out.println("프로그램 종료");
    }
}