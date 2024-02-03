import java.util.Scanner;
/** n=5
 1
 232
 34543
 4567654
 567898765
 */
class Pattern13
{
	int n;
   int t;
	Scanner scan = new Scanner(System.in); 
   Pattern13()
   {
   	n = scan.nextInt();
      t = 0;
   }

   public static void main (String Deepak[])
   {
      Pattern13 p = new Pattern13();
      for(int i=1;i<=p.n;i++)
      {
         p.t=i;
      	for(int j=1;j<=i*2-1;j++)
         { 
            System.out.print(p.t+" ");
            if(j<i)
            {
               p.t++;
            }
            else
            {
               p.t--;
            }
      	}
      	System.out.println();
      }
   }

 
}