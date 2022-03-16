import java.util.*;
class IfGreating{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the day");
        String day=scan.nextLine();
        if(day.equals("monday")){
            System.out.println("week 1st day");
        }
        else if(day.equals("tuesday")){
            System.out.println("week 2nd day");
        }
        else if(day.equals("wednesday")){
            System.out.println("week 3rd day");
        }
        else if(day.equals("thursday")){
            System.out.println("week 4th day");
        }
        else if(day.equals("friday")){
            System.out.println("week 5th day");
        }
        else if(day.equals("saturday")){
            System.out.println("week 6th day");
        }
        else if(day.equals("sunday")){
            System.out.println("week 7th day");
        }
        else{
            System.out.println("nothink to all");
        }
    }

}