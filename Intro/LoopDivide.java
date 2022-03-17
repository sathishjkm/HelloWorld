import java.util.*;
class LoopDivide {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the a");
        int a =scan.nextInt();
        System.out.println("enter the b");
        int b =scan.nextInt();
        System.out.println("enter the divive");
        int c=scan.nextInt();
        for (int i=a;i>=b;i++) {
            if(i%c==0){
                System.out.println(i);
            }
        }
    }
}
