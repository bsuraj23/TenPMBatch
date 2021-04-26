package arraylist;
import java.util.*;

public class arraylisteg {
    public static void main(String args[]){
        //creating the list to get o/p
        //list in java provides the facility to maintain the ordered collection
        List<String>list=new ArrayList<String>();
        //Adding elements in the list
        list.add("Mango");
        list.add("orange");
        list.add("grapes");
        list.add("Banana");
        list.add("Apple");
        //lterating the list elements using for-each loop
        for(String fruit:list)
            System.out.println(fruit);
    }
}
