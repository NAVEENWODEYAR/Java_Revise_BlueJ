import java.util.*;
import java.util.stream.Stream;


public class Stream_Ex
{
    public static void main(String args[])
    {
        System.out.println("Stream API used for processing the data");
        
        List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9);
                        l.stream().map((n)->n*n).forEach(System.out::println);
        
        
    }
}