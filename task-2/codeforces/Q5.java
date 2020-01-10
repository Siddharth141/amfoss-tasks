import java.util.*;
class Q5
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Length of the string should be less than 100");
		System.out.println(" enter the string");
		String a=s.next();
		int count =0;
		for (int i=0;i<(a.length()-1);i++)
		{
			if(a.charAt(i)==a.charAt(i+1))
			{
				count++;
			}
		}
		if (count==7)
			{
				System.out.println("Yes");
			}
			else
				System.out.println("No");

	}
}