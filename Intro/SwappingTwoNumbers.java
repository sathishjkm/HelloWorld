class SwappingTwoNumbers {
    public static void main(String[] args){
        int a=430;
        int b=980;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
}