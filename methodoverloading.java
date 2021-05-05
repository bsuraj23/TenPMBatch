public class methodoverloading
    //different functons with same names but should be change in parameter or prototypes
    {
        static void sum(int a, int b)
        {
            int g=a+b;
            System.out.println("Sum is "+g);
        }
        static void sum(double v, double x, double y)
        {
            double s=x+y+v;
            System.out.println("Sum is "+s);
        }
        public static void main(String arg[])
        {
            int a,b;
            a=5;
            b=8;
            sum(a,b);
            sum(3.2,1.4,5.1);
        }

    }