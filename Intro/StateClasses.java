class StateClasses{
    public static void main(String[] args){
        state Obj=new state("tamilnadu",1000000);
        System.out.println(Obj.country);
        Obj.setCountry("chinna");
        System.out.println(Obj.getCountry());
        System.out.println(Obj.name);
        System.out.println(Obj.population);
    }
}
class state{
    public String country="india";
    public String name;
    public double population;
    state(String name,double population){
        this.name=name;
        this.population=population;
    }
    void setCountry(String newCountry){
        this.country=newCountry;
    }
    String getCountry() {
        return this.country;
    }

}