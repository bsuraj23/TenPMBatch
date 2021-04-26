package arraylist;
import java.util.*;
public class sortedseteg {
    public static void main(String[ ] args){
        //create a sorted set
        SortedSet set = new TreeSet();
        //ADD elements
        set.add("b");
        set.add("c");
        set.add("a");
        //Iterating over the elements
        Iterator it = set.iterator();

        while (it.hasNext()){
            //Get element
            Object element = it.next();
            System.out.println(element.toString());
        }
    }
}
