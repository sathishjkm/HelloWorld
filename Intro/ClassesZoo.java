class ClassesZoo {
    public static void main(String[] args) {
        Zoo Obj=new Zoo(40,50,60);
        System.out.println("no of lion:"+Obj.getNoOfLion());
        Obj.setNoOfTiger(100);
        System.out.println("no of tiger:"+Obj.getNoOfTiger());
        System.out.println("have a water:"+Obj.have_a_water);
        System.out.println("no of elephant:"+Obj.noOfElephant);
    }
}

class Zoo{
    private int noOfLion;
    private int noOfTiger;
    public boolean have_a_water=true;
    public int noOfElephant;
    Zoo(int noOfLion,int noOfTiger,int noOfElephant){
        this.noOfLion=noOfLion;
        this.noOfTiger=noOfTiger;
        this.noOfElephant=noOfElephant;
    }
    int getNoOfLion(){
        return this.noOfLion;
    }
    void setNoOfTiger(int newNoOfTiger){
        this.noOfTiger=newNoOfTiger;
    }
    int getNoOfTiger(){
        return this.noOfTiger;
    }

}
