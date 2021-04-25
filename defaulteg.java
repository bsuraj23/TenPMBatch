package defaultparentclass;
//When no access modifier is specified for class,method or data member - it is said to be having default access modifier by default
class defaulteg {
private String name;
//getter method
    public String getName(){
        return this.name;
    }
//setter method
    public void setName(String name){
        this.name = name;
    }
}
class eg{
    public static void main(String[] main){
        defaulteg d = new defaulteg();
        //access the private variable using getter ans setter
        d.setName("Anmisathish");
        System.out.println(d.getName( ));
    }
}