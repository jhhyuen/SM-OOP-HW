package ch05.sec03;

public class ReferenceVariableCompareExample {
    public static void main(String[] args) {
        int[] arr1;  // 배열 변수 arr1 선언
        int[] arr2;  // 배열 변수 arr2 선언
        int[] arr3;  // 배열 변수 arr3 선언

        arr1 = new int[] { 1, 2, 3 };  // 새로운 int 배열 {1,2,3}을 생성 → arr1이 참조
        arr2 = new int[] { 1, 2, 3 };  // 또 다른 int 배열 {1,2,3}을 새로 생성 → arr2가 참조
        arr3 = arr2;                   // arr3은 arr2가 참조하는 배열을 그대로 참조

        System.out.println(arr1 == arr2);  // arr1과 arr2가 같은 배열을 참조하는지 비교
        System.out.println(arr2 == arr3);  // arr2와 arr3이 같은 배열을 참조하는지 비교
    }
}