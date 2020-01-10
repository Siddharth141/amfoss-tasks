import java.util.*;
class q4
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age ");
		int x=s.nextInt();
		int a[]=new int[x];
		int max=0;
		int count=0;
		System.out.println("Enter the height of each candle");
		for(int i=0;i<x;i++)
		{
			int y=s.nextInt();
			a[i]=y;
		}
		for(int i=0;i<x;i++)
		{
			if(max<a[i])
			{
				max=a[i];

			}
		}
		for(int i=0;i<x;i++)
		{
			if(max==a[i])
			{
				count++;
			}
		}
		System.out.println(count);
	}
}