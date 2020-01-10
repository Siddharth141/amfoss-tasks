import java.util.*;
class q3
{
	public static void main (String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the stair case" );
		int x=s.nextInt();
		String a[][]=new String[x][x];
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<x;j++)
			{
				if(i>=(x-(j+1)))
				{
					a[i][j]="#";
				}
				else
					a[i][j]=" ";
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
	}
}