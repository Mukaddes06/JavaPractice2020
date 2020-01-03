package repl;
import java.util.*;
public class Repl {


    static int search(String[]arr, String s)
    {
        int counter = 0;
        for (int j = 0; j < arr.length; j++)

                /* checking if string given in query is
                  present in the given string. If present,
                  increase times*/
            if (s.equals(arr[j]))
                counter++;

        return counter;
    }
}


