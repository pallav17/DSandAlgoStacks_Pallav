import java.io.StringBufferInputStream;
import java.util.Arrays;

public class StackImpl {

    int[] Stack = new int[5];

        int count;
    public int[] push( int input )
    {
        if(count == Stack.length)
        {
            throw new StackOverflowError();
        }

       Stack[count] = input;
       count++;
        return Stack;
    }

    public int pop()
    {

        if (count == 0)
        {
            throw new IllegalArgumentException();
        }
        count--;
        Stack[count] = 0;

        return Stack[count];


    }

    public int peek()
    {
        return Stack[count-1];
    }
    @Override
    public String toString()
    {
        return Arrays.toString(Stack);
    }
}
