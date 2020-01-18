import java.util.*;
class Q4
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        System.out.println(" Enter the value of n");
        int n=s.nextInt();
        int x=0;
        String a="X++";
        String b="++X";
        String c="X--";
        String d="--X";
        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter the expression");
            String k=s.next();
            if (k.equals(a) || k.equals(b))
            {
                x++;
            }
            else if(k.equals(c) || k.equals(d))
            {
                x--;
            }
        }
        System.out.println(x);
    }
}