public class Arithmetic {

    int a;
    int b;
    int c;

    Arithmetic() {

        a = 100;
        b = 2;
    }

    void add() {

        c = a + b;
        System.out.println("The Addition is : " + c);
    }

    void sub() {

        c = a - b;
        System.out.println("The Subtraction is : " + c);
    }

    void multi() {

        c = a * b;
        System.out.println("The Multiplication is : " + c);
    }

    void div() {

        c = a / b;
        System.out.println("The Division is : " + c);
    }

    void mod() {

        c = a % b;
        System.out.println("The Modulus (i.e.reminder) is : " + c);
    }

    void inc() {

        c = ++a;
        System.out.println("The Increment is : " + c);
    }

    void dec() {

        c = --a;
        System.out.println("The Decrement is : " + c);
    }
}

class AddClass {

    public static void main (String args[]) {

        Arithmetic obj = new Arithmetic();

        obj.add();
        obj.sub();
        obj.multi();
        obj.div();
        obj.mod();
        obj.inc();
        obj.dec();
    }
}