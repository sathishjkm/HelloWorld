class StaticProperty {
    public static void main(String[] args) {
        state Obj = new state("india");
        System.out.println(state.country);
        System.out.println(Obj.country);
    }
}
class state{
    public static String country;
    state(String country){
        this.country=country;
    }
}