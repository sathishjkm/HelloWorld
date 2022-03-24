class StudentClasses{
    public static void main(String []args){
        Student Obj=new Student("raj",10);
        System.out.println("name is:"+Obj.getName());
        System.out.println("rollNo is:"+Obj.rollNo);
        System.out.println("is_male:"+Obj.is_male);
        Student Obj1=new Student("seetha",22);
        System.out.println("name is:"+Obj1.getName());
        System.out.println("rollNo is:"+Obj1.rollNo);
        System.out.println("is_male:"+Obj1.is_male);
    }
}
class Student {
    private String name;
    public int rollNo;
    public boolean is_male = true;
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    String getName(){
        return this.name;
    }
}