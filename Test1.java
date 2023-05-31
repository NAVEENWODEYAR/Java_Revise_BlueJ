import java.util.List;
import java.util.*;
import java.util.stream.*;

// Java program for demonstrating the Stream API
 public class Test1
{
    public static void main(String args[])
    {
        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> squareof_Num = num.stream().map((n) -> n*n).collect(Collectors.toList());
            System.out.println("Original list--" + num);
            System.out.println("Modified list using the stream API-- "+squareof_Num);
            System.out.println("********");
                squareof_Num.forEach(System.out::println);
    }
} 