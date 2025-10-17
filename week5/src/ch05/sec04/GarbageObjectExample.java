package ch05.sec04;

public class GarbageObjectExample {
    public static void main(String[] args) {
        String hobby = "여행";
        hobby = null; 
        // "여행"에 해당하는 String 객체는 이제 아무 변수도 참조하지 않음 → 쓰레기(Garbage)

        String kind1 = "자동차";
        String kind2 = kind1;  // kind2도 같은 "자동차" 객체를 참조함
        kind1 = null;          // kind1은 이제 아무 것도 참조하지 않음

        System.out.println("kind2: " + kind2);
    }
}
