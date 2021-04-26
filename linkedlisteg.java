package arraylist;
import java.util.*;
public class linkedlisteg {
    public static void main(String args[]){
        LinkedList<String>al= new LinkedList<String>();
        al.add("ANMISA");
        al.add("BINNY");
        al.add("SATHISH");
        al.add("PADMA");

        Iterator<String> itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }


}
