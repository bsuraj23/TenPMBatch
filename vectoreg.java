package arraylist;
import java.io.*;
import java.util.*;
class vectoreg {
    public static void main(String[] args)
    {
        //size
        int n =5;
        //Declaring the vector
        Vector<Integer> v = new Vector<Integer>(n);
        //Appending the elements
        for(int i = 1;i<=n;i++)
            v.add(i);
        //printing elements
        System.out.println(v);
        //remove element at index 3
        v.remove(3);
        //displaying after deletion
        System.out.println(v);
        //PRINTING ELEMENTS ONE-BY-ONE
        for(int i=0; i <v.size();i++)
            System.out.print(v.get(i) + " ");
    }
}
