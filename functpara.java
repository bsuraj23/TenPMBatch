public class functpara
{
        public static void main(String args[])
        {

            System.out.println("Anmisa here");

            //int result =
            // int subresult =
            System.out.println("Result is "+add(1094,34));
            System.out.println("Subresult is "+sub(123,12));
            printName();
            System.out.println("Completed");
        }
        ///with parameter and return tyoe
        private static int  add(int a,int b)
        {
            int c =a+b;
            return c;
        }
        ///no return+parameter
        private static void   printName()
        {
            System.out.println("ANMISA REDDY");
        }
        ///with parameter and return type
        private static int  sub(int a,int b)
        {
            int c = a-b;
            return c;
        }
    }
