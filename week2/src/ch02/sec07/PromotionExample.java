package ch02.sec07;

public class PromotionExample {
	 public static void main(String[] args) {
	        // 자동 타입 변환
	        byte byteValue = 10;
	        int intValue = byteValue; // 자동형변환발
	        System.out.println("intValue: " + intValue);

	        char charValue = '가'; //char 1개니까 '써야함,char2개면"
	        // "로 잡으면 나중에 리터럴 상수가 쓸데없이 커진다.
	        intValue = charValue;
	        System.out.println("'가'의 유니코드: " + intValue);

	        intValue = 50;
	        long longValue = intValue;
	        System.out.println("longValue: " + longValue);

	        longValue = 100;
	        float floatValue = longValue;
	        System.out.println("floatValue: " + floatValue);

	        floatValue = 100.5F;
	        double doubleValue = floatValue;
	        System.out.println("doubleValue: " + doubleValue);
	    }

}
