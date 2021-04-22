public class Int {
    int a = 15000; // (-2^31 to 2^31 -1)[4bytes]; long= (-2^62 to 2^62 -1) [8bytes]
    int b = -20000;

    void add() {

        int c = a + b;

        System.out.println("The int Value is : " + c);
    }
}

class Addclass {

    public static void main(String args[]) {

        Int obj = new Int();

        obj.add();
    }
}
