import java.util.*;
//this is divition class,used to divition of two numbers
class Divition{
    public static void main(String args[]){
        //this is the scanner input
        Scanner scan=new Scanner(System.in);
        //asking the user to give input
        System.out.println("enter the divoider");
        int divoider=scan.nextInt();
        //asking the user to give input
        System.out.println("enter the divisor");
        int divisor=scan.nextInt();
        //complete the divition
        int quotion=divoider/divisor;
        int reminder=divoider%divisor;
        //print the result
        System.out.println("the quotion is"+" "+quotion);
        System.out.println("the reminder is"+" "+reminder);


    }
}