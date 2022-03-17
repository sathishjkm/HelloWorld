import java.util.*;
class CarsArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] cars = {"volvo", "bmw", "audi", "tata"};
        System.out.println("enter the car a");
        String a=scan.nextLine();
        for(int i=0;i<=cars.length;i++){
          if(cars[i].equals(a)){
            continue;
          }
            System.out.println(cars[i]);
        }

        }
    }



