import java.util.*;
class MethodOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter 1st numbers");
        int number1 = scan.nextInt();
        System.out.println("enter 2nd numbers");
        int number2 = scan.nextInt();
        System.out.println("enter 3rd numbers");
        int number3 = scan.nextInt();
        System.out.println("maximum no is");
        int result = findMax(number1, number2, number3);
        System.out.println(result);
    }

    public static int findMax(int num1, int num2, int num3) {

        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else {
            return num3;
        }

    }
}