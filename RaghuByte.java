public class Byte {

    byte a = 50; //-128 to 127 (-2^7 to 2^ -1); 1byte
    byte b = (byte) -80;

    void add() {

        byte c = (byte) (a + b);

        System.out.println("The Byte Value is : " + c);
    }

}
class Addclass {

    public static void main(String args[]) {

        Byte obj = new Byte();

        obj.add();
    }
}