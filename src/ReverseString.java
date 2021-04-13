import java.util.Stack;

public class ReverseString {

    public String reverseString (String input)
    {

        Stack<Character> stack = new Stack<Character>();

        for(char ch:input.toCharArray())
        {
            stack.push(ch);

        }



        StringBuilder reversed= new StringBuilder();


        while (!stack.isEmpty())
        {

            reversed.append(stack.pop());
        }



        return reversed.toString();
    }

}
