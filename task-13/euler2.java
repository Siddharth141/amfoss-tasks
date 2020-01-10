import java.util.*;
class euler2
{
	public static void main (String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no of test cases");
		int t=s.nextInt();
		
		for (int i=1;i<=t;i++)
		{
			ArrayList<Integer>series=new ArrayList<Integer>();
			System.out.println("Enter the value of N");
			int n=s.nextInt();
			series.add(1);
			series.add(2);
			int sum=0;
			for(int j=2;j<n;j++)
			{
				
				int k=0;
				k=series.get(j-1)+series.get(j-2);
				if(k<n)
					series.add(k);
				else
					break;
				
			}
			System.out.println(series);
			for(int l=0;l<series.size();l++)
			{
				
				if(series.get(l)%2==0)
					sum=sum+series.get(l);
				
			}
			System.out.println(sum);

		}

	}
}