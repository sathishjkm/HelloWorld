import java.util.*;
//this is a addition class,used to add three numbers
class Addition{
    public static void main(String[] args){
        //this is the scanner input
        Scanner scan=new Scanner(System.in);
        //asking the user to give input
        System.out.println("enter the num1");
        int num1=scan.nextInt();
        //asking the user to give input
        System.out.println("enter the num2");
        int num2=scan.nextInt();
        //asking the user to give input
        System.out.println("enter the num3");
        int num3=scan.nextInt();
        //complete the addition
        int num4=num1+num2+num3;
        //print the result
        System.out.println("The Result Is"+num4);
    }

}