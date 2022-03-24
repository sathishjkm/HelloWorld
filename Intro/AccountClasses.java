class AccountClasses{
    public static void main(String[] args){
        account a1=new account(123456,"sathish",1000);
        a1.display();
        a1.checkbalance();
        a1.deposit(40000);
        a1.checkbalance();
        a1.withdraw(15000);
        a1.checkbalance();
    }
}
class account{
    int acc_no;
    String name;
    double amount;
    account(int acc_no,String name,double amt){
      this.acc_no=acc_no;
      this.name=name;
      this.amount=amt;
    }
    //deposit method
    void deposit(double amt){
        amount=amount+amt;
        System.out.println(amt+" "+"deposit");
    }
    //withdraw method
    void withdraw(double amt){
        if(amount<amt){
            System.out.println("no balance");
        }
        else {
           amount=amount-amt;
            System.out.println(amt+" "+"withdraw");
        }
    }
    void checkbalance(){
        System.out.println("balance is:"+amount);
    }
    void display(){
        System.out.println(acc_no+name+amount);
    }
}