import java.util.*;
//this is multible class,used to multible two numbers
class ScannerMultible{
    public static void main(String[] args){
        //this is the scanner input
        Scanner scan=new Scanner(System.in);
        //asking the user to give input
        System.out.println("enter the num1");
        int num1=scan.nextInt();
        //asking the user to give input
        System.out.println("enter the num2");
        int num2=scan.nextInt();
        //complete tha multible
        int num3=num1*num2;
        //print the rusult
        System.out.println("the result is"+" "+num3);
    }
}