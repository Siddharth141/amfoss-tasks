import java.util.*;
class Q1

{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of m");
        double m=s.nextInt();
        System.out.println("Enter the value of n");
        double n=s.nextInt();
        System.out.println("Enter the value of a");
        double a=s.nextInt();
        double x=(Math.ceil(m/a) * Math.ceil(n/a));

        System.out.println("The required number of squares are " +x);
    }
}