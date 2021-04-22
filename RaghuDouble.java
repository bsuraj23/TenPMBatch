
    public class Double {

        double a = 9.87654321; // 4 to 8 precisions[8bytes]; Float= 4 precisions[4bytes]
        double b = -1.23456789;

        void add() {

            double c = a + b;
            System.out.println("The Double Value is : " + c);
        }

    }

    class Addclass {

        public static void main(String args[]) {

            Double obj = new Double();

            obj.add();
        }
}
