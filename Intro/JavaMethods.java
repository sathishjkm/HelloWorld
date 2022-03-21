import java.util.*;
class JavaMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] cars=new String[]{"audi", "volvo", "Benz", "audi", "volvo", "Benz","audi"};
        System.out.println("care name");
        System.out.println(Arrays.toString(cars));
        String a = scan.nextLine();
        int x = (cars, a);
        System.out.println(x);
    }

       public static int list(String[] cars,String a){
      int count=0;
        for (int i=0;i<cars.length;i++) {
            if(cars[i].equals(a)){
                count++;
            }
        }
        return count;
    }
}
