import java.util.*;

 class euler3 
 {
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter a number");
      int n = s.nextInt();
      int max=0;
      int x=0;
      ArrayList<Integer>num=new ArrayList<Integer>();
          while (n % 2 == 0) 
          {

               num.add(2);    
               n /= 2; 
           } 
     
           // n must be odd at this point.  So we can 
           // skip one element (Note i = i +2) 
           for (int i = 3; i <= n; i ++)
            { 
               // While i divides n, print i and divide n 
               while (n % i == 0) 
               { 
                   num.add(i); 
                   n /= i; 
               } 
           } 
     
           // This condition is to handle the case whien 
           // n is a prime number greater than 2 
           if (n > 2) 
               num.add(n); 
            System.out.println(num);
            for(int i=0;i<num.size();i++)
            {
               if(num.get(i)>max)
               {
                  max=num.get(i);
               }
            }
            System.out.println(max);

   }
}