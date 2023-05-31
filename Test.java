import java.util.Scanner;

public class Test
{
    public static int add_No(int a, int b)
    {
        System.out.println("static method belongs to the class,hence object is not needed");
        return a+b;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
                System.out.println("Hello World");
                System.out.println("Enter the first number");
                int a = sc.nextInt();
                System.out.println("Enter the second number");
                int b = sc.nextInt();
                System.out.println("Sum of the given numbers--"+add_No(a,b));
    }
}