import java.util.*;
class Q2
{
	public static void main(String []args)
	{
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the word");
		String word = s.next();
		int count=word.length();
		System.out.println(count);
		if(count>10)
		{
			System.out.println(word.charAt(0)+" "+(count-2)+" "+word.charAt(count-1));
		}

	}
}