import java.util.*;
class ScannerWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the a");
        int a = scan.nextInt();
        System.out.println("enter the b");
        int b = scan.nextInt();
        System.out.println("enter the c");
        int c=scan.nextInt();
        int i=a;
        while (i<= b) {
            i++;
        if(i%c==0){
            System.out.println(i);
        }
        }
    }
}
