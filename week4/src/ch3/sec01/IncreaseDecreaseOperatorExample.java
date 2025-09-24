package ch3.sec01;
// ++ x와 x++의 차이
// 전위증가 먼저 1증가하고 다음 대입하는 변수에다가 대입
// 후위증가 일단 다음 대입하는 변수에 현재 x값을 대입하고 그 후에 x값을 1증가
// (즉,뒤에나오는 변수가 필연적으로 작음)
// 증감연
public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        x++;
        ++x;
        System.out.println("x=" + x);

        System.out.println("-----------------------");
        
        
        
        y--;
        --y;
        System.out.println("y=" + y);

        System.out.println("-----------------------");
        
        
        z = x++;
        System.out.println("z=" + z);
        System.out.println("x=" + x);

        System.out.println("-----------------------");
        
        
        z = ++x;
        System.out.println("z=" + z);
        System.out.println("x=" + x);

        System.out.println("-----------------------");
        
        
        z = ++x + y++;
        System.out.println("z=" + z);
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}
	


