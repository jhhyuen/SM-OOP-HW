package ch02.sec09;

public class OperationPromotionExample {
	public static void main(String[] args) {
        byte byteValue1 = 10;
        byte byteValue2 = 20;
        // byte result1 = byteValue1 + byteValue2; // 컴파일 에러 발생
        // 자바는 기본적으로 정수 연산 시 int 타입으로 변환 후 연산
        int result1 = byteValue1 + byteValue2;
        System.out.println("result1: " + result1);

        char charValue1 = 'A';
        char charValue2 = 1;
        // char result2 = charValue1 + charValue2; // 컴파일 에러 발생
        // 자바는 기본적으로 정수 연산 시 int 타입으로 변환 후 연산
        int result2 = charValue1 + charValue2;
        System.out.println("result2: " + result2);
        System.out.println("result2의 유니코드: " + (char) result2);

        int intValue3 = 10;
        int intValue4 = intValue3 / 4;
        System.out.println("result3: " + intValue4);

        int intValue5 = 10;
        // int result4 = intValue5 / 4.0; // 컴파일 에러 발생
        // 실수와 정수가 연산되면 실수 타입으로 변환 후 연산
        double result4 = intValue5 / 4.0;
        System.out.println("result4: " + result4);

        int intValue6 = 1;
        int intValue7 = 2;
        double result5 = (double) intValue6 / intValue7;
        System.out.println("result5: " + result5);
    }

}
