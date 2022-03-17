class StringArray{
  public static void main(String[]args){
   String[] cars={"volvo","bmw","audi","tata"};
   System.out.println(cars[0]);
      System.out.println(cars[1]);
      System.out.println(cars[2]);
      System.out.println(cars.length);
    for(int i=0;i<cars.length;i++){
        System.out.println(cars[i]);
    }
    for(String a:cars){
        System.out.println(a);
    }
  }
}