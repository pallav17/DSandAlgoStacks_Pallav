public class StackImpl {

    int[] input = new int[5];


    public int[] push( int k )
    {
        if(input.length > 0)
        input[input.length+1] = k;

        else
        {
            input[0] = k;
        }

        return input;
    }
}
