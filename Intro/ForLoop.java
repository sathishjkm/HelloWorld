import java.util.*;
class ForLoop{
    public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    System.out.println("enter the a");
    int a=scan.nextInt();
    System.out.println("enter the b");
    int b=scan.nextInt();
    for(int i=a;i<=b;i++){
        System.out.println(i);
    }
    }
}