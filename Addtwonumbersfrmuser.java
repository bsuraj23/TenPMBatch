import java.util.Scanner;

public class Addtwonumbersfrmuser {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);

        System.out.println("Enter Two Numbers(four to eight decimal places) You wanna add (note:Press Enter after your choice):");

        double n1, n2, n3;
        n1 = obj1.nextDouble();
        n2 = obj1.nextDouble();
        n3 = n1 + n2;
        System.out.println("the sum of ur given numbers is " + n3);
    }

}


