public class Short {


    short a = 1000; //-32768 to 32767 ( -2^15 to  2^15 -1)
    short b = -1500;

    void add() {

        short c = (short) (a + b);// (-2^15 to 2^15 -1) ; 2bytes

        System.out.println("The Short Value is : " + c);
    }
}

class Addclass {

    public static void main(String args[]) {

        Short obj = new Short();

        obj.add();
    }
}

