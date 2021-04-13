
import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Hello World!");

        Stack<Integer> stackBasics = new Stack<Integer>();

        stackBasics.push(5);
        stackBasics.push(6);
        stackBasics.push(7);

        System.out.println(stackBasics);

        ReverseString rv = new ReverseString();

        System.out.println(rv.reverseString("abcdefgh"));

    }





}
