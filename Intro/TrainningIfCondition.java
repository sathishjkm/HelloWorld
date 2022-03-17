import java.util.*;
class TrainningIfCondition{
    public static void main(String[] args){
     Scanner scan=new Scanner(System.in);
        System.out.println("enter the menu");
       String menu=scan.nextLine();

       if (menu.equals("south indian")) {
            System.out.println("this is south indian food");
        }

        else if (menu.equals("north indian")) {
            System.out.println("this is north indian food");
        }

       else if (menu.equals("chinese"))  {
            System.out.println("this is chinese indian food");
        }

       else {
           System.out.println("please enter valid menu");
       }

    }


}