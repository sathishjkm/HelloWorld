class PersonClassesObject{
    public static void main(String args[]){
        Person one=new Person("sethu",32,"papanasam");//constructor
        System.out.println("name is:"+one.getName());
        System.out.println("age is:"+one.getAge());
        System.out.println("city is:"+one.city);
        System.out.println("male is:"+ one.male_is);
    }
}

class Person{
    private String name;
    private int age;
    public String city;
    public boolean male_is=true;
    Person(String name,int age,String city){//constructor
        this.name=name;
        this.age=age;
        this.city=city;

    }
    //methods
    String getName(){
        return this.name;
    }
    int getAge(){
        return this.age;
    }
}