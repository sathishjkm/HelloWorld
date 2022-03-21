import java.util.*;
class BoxVolumeMethod{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lenth is");
        int a = scan.nextInt();
        System.out.println("breadth is");
        int b = scan.nextInt();
        System.out.println("height is");
        int c= scan.nextInt();
        int d = Boxvolume(a, b,c);
        System.out.println("Boxvolume is");
        System.out.println(d);
    }

    public static int Boxvolume(int lenth,int breadth,int height){
        int d=(lenth*breadth*height);
        return d;
    }
}