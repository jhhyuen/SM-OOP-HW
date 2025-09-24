package teamHW;

import java.util.Scanner;


public class BankExample {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in); 
	        boolean run = true; // 프로그램 실행을 제어하는 스위치 변수
	        int money = 0;    // 계좌의 잔고를 저장하는 변수
	        
	        while(run) { //run = true니까 코드는 무한히 반복: 뛰는 중
	        	// 사용자한테 보여질 부분 + 선택입력란  
	            System.out.println("-------------------------------");
	            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료"); 
	            System.out.println("-------------------------------");
	            System.out.print("선택> ");
	            
	            // 선택입력란에 적혀진 1,2,3중 하나를 strNum변수에 저장
	            // 저장된 변수값에 따라 if,else문이 작동한다.
	            
	           
	            String menuNum = scanner.nextLine();

	            if(menuNum.equals("1")) {
	                System.out.print("예금액> ");
	                String amountStr = scanner.nextLine();
	                money += Integer.parseInt(amountStr);

	            } else if(menuNum.equals("2")) { // ◀ [수정] 출금 기능
	                // 1. "출금액>" 문구를 보여줍니다.
	                System.out.print("출금액> ");
	                
	                // 2. 사용자가 입력한 금액을 문자열로 읽어옵니다.
	                String amountStr = scanner.nextLine();
	                
	                // 3. 문자열을 숫자로 변환하여 money에서 빼줍니다.
	                money -= Integer.parseInt(amountStr);

	            } else if(menuNum.equals("3")) { // ◀ [수정] 잔고 조회 기능
	                // 현재 money 변수에 저장된 값을 바로 출력합니다.
	                System.out.println("잔고> " + money);

	            } else if(menuNum.equals("4")) {
	                run = false;
	            }

	        System.out.println("프로그램 종료");
	    }
	 }
}