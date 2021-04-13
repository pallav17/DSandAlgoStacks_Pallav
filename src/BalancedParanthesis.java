import java.util.Stack;

public class BalancedParanthesis {

    //( a + b)

    public boolean String   (String input)
    {
     char round[] = {'(',')'};
      char square[] = {'[',']'};
       char angular[] =  {'<','>'};

        Stack<Character> bal = new Stack<Character>();
       for( char ch:input.toCharArray())
       {

          if( ch == round[1])
          {
             bal.push(ch);

             if(ch == round[2])
             {
                 bal.pop();

             }
             else
                 continue;
          }



       }


        return false;
    }
}
