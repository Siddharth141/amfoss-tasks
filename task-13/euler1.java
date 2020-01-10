import java.util.*;
class euler1
{
	public static void main (String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no of test cases");
		int t=s.nextInt();
		
		for(int i=1;i<=t;i++)
		{
			int sum=0;
			System.out.println("enter the value of N");
			int n=s.nextInt();
			for(int j=1;j<=n-1;j++)
			{
				if (j%3==0 || j%5==0)
				{
					sum=sum+j;
				}
			}
			System.out.println(sum);
		}
	}
}