public class finaleg
{
    //if data number is qualified final,it acts as constant
    //value cannot be changed
    //method-not be overiden
    //class- not be inherited
    public static void main(String args[])
    {
        int a=67;
        final int b=56;
        //b=b+4;
        //a=a+100;//--cannot assign value to final variable
        System.out.println("a is :"+a);
        System.out.println("b is :"+b);
    }
}
