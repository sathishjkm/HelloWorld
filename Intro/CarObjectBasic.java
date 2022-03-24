class CarObjectBasic{
    public static void main(String[] args){
      car Obj1=new car("tata",6);
        System.out.println(Obj1.name);
        System.out.println("no of seats"+" "+Obj1.no_of_seats);
        System.out.println("is abs"+" "+Obj1.is_abs);
    }
}

class car {
    public String name;
    public int no_of_seats;
    public boolean is_abs = true;
    car(String name,int seats) { //constractor
        this.name =name;
        this.no_of_seats =seats;

    }
}