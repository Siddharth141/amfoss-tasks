import java.util.*;
class q2
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of the square matrix");
		int x=s.nextInt();
		int a[][]=new int[x][x];
		int s1=0;
		int s2=0;
		int d=0;
		System.out.println("enter the elements of the matrix");
	
		
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<x;j++)
			{
				
				int y=s.nextInt();
				a[i][j]=y;
			}
		}
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<x;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<x;j++)
			{
				if(i==j)
				{
				  s1=s1+a[i][j];
				}
			}
		}
		for(int i=0;i<x;i++)
		{
			s2=s2+a[i][x-(i+1)];
		}
		d=s1-s2;
		System.out.println(Math.abs(d));
	}
}