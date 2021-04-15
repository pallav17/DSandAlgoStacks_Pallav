import java.util.Stack;

public class BalancedParanthesis {

    //( a + b)

    public boolean isBalanced (String input)
    {

        Stack<Character> bal = new Stack<Character>();
       for( char ch:input.toCharArray()) {

           if (ch == '(' || ch == '[' || ch == '{' || ch == '<') {
               bal.push(ch);

           }
               if (ch == ')' || ch == ']' || ch == '}' || ch == '>') {
                   bal.pop();

               } else
                   continue;
           }


        return false;
    }
}
