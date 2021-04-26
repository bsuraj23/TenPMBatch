package arraylist;
import java.util.Stack;
public class stackeg
{
    public static void main(String[] args)
    {
        //creating stack class
        Stack<Integer>stk = new Stack<>();
        //checking stack is empty or not
        boolean result = stk.empty();
        System.out.println("Is stack empty?" + result);
        //pushing elements
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        //print elements
        System.out.println("Elements in stack:" +stk);
        result = stk.empty();
        System.out.println("Is stack empty?" + result);
    }
}
