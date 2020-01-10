import java.util.Scanner;
class q1
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int k=0;
		int m=0;
		int[] a=new int[3];
		int[] b=new int[3];
		for(int i=0;i<3;i++)
		{
			int x=s.nextInt();
			if(x>=1 && x<=100)
				a[i]=x;
			else System.out.println("entry not allowed");
		}
		for(int i=0;i<3;i++)
		{
			int y=s.nextInt();
			if(y>=1 && y<=100)
				b[i]=y;
			else System.out.println("entry not allowed");
		}
		for(int i=0;i<3;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<3;i++)
		{
			System.out.print(b[i]+" ");
		}
		System.out.println();
		for(int i=0;i<3;i++)
		{
			if(a[i]>b[i])
				k++;
			else if(a[i]<b[i])
				m++;
		}
		int[] c={k,m};
		for(int i=0;i<2;i++)
		{
			System.out.print(c[i]+" ");
		}

	}
}