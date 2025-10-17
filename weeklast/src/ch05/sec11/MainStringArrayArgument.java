package ch05.sec11;

public class MainStringArrayArgument {
    public static void main(String[] args) {
        // 입력값이 2개가 아닐 경우 종료
        if (args.length != 2) {
            System.out.println("프로그램 입력 값이 부족");
            System.exit(0); // 프로그램 강제 종료
        }

        // 문자열로 전달된 입력값 받기
        String strNum1 = args[0];
        String strNum2 = args[1];

        // 문자열을 정수(int)로 변환
        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);

        // 두 수의 합 계산
        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
    }
}
