import java.util.*;
class Q3
{
	public static void main(String []args)
	{
		Scanner s=new Scanner (System.in);
		System.out.println("enter the number of participents");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the place ");
		int k=s.nextInt();
		int count=0;
		int zer=0;
		System.out.println("Enter the scores of each participents");
		for(int i=0;i<n;i++)
		{
			int x=s.nextInt();
			a[i]=x;
		}
		for(int i=0;i<n;i++)
		{
			if (a[i]==0)
			{
				zer++;
			}
		}
		if(zer==n){
			System.out.println("0");
		}
		else
		{
			for(int i=0;i<n;i++)
			{
				if (a[k]<=a[i])
				{
					count++;
				}
			}
			for(int i=0;i<n;i++)
			{
				System.out.print(a[i]+" "); 
			}
			System.out.println();
			System.out.println(count);

		}
	}
}
			