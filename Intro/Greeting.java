import java.util.*;
class Greeting{
    public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    System.out.println("enter today");
        String today=scan.nextLine();
         switch(today){
            case "monday":{
                System.out.println("hi how are you");
                break;
            }
            case "tuesday":{
                System.out.println("what are you doing");
                break;
            }
            case "wednesday":{
                System.out.println("how old are you");
                break;
            }

            case "thursday":{
                System.out.println("whare are you from");
                break;
            }
            case "friday":{
                System.out.println("today is good day");
                break;
            }
            case "saturday":{
                System.out.println("week end day");
                break;
            }
            case "sunday":{
                System.out.println("week first day");
                break;
            }
            default:{
                System.out.println("not it all");
            }
        }
    }
}







