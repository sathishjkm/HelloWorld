import java.util.*;
class MethodBasic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the no a");
        int a = scan.nextInt();
        System.out.println("enter the no b");
        int b = scan.nextInt();
        int d = checkHigh(a, b);
        System.out.println("Higher No Is");
        System.out.println(d);

    }

    public static int checkHigh(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}

