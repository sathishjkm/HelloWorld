class ClassesObject {
    public static void main(String[] args) {
        Account a1 = new Account(456789,"sathish",5000);//constructor
        System.out.println("acc_no_is"+" "+a1.acc_no);
        System.out.println("name is"+" "+a1.getName());
        a1.setName("kumar");
        System.out.println("new name is"+" "+a1.getName());
        System.out.println("salary is"+" "+a1.getSalary());
        a1.setSalary(6000);
        System.out.println("salary is"+" "+a1.getSalary());
    }
}
class Account {
    public int acc_no;
    private String name;
    private double salary;
    Account(int acc_no, String name, double salary) {//constructor
        this.acc_no = acc_no;
        this.name = name;
        this.salary = salary;
    }
    //methods
    void setSalary(double newSalary){//set panurathu
        this.salary = newSalary;
    }
    //methods
    double getSalary(){//get panurathu
        return this.salary;
    }
    //methods
    void setName(String newName){//get panurathu
        this.name=newName;
    }
    //methods
    String getName(){//set panurethu
        return this.name;
    }

    }
