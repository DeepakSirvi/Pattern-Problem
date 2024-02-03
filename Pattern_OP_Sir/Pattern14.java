import java.util.Scanner;
/** n=4
 1     1
  2   2 
   3 3  
    4   
   3 3  
  2   2 
 1     1
 */
class Pattern14
{
	int n;
   int t;
	Scanner scan = new Scanner(System.in); 
   Pattern14()
   {
   	n = scan.nextInt();
      t = 1;
   }

   public static void main (String Deepak[])
   {
      Pattern14 p = new Pattern14();
      for(int i=1;i<=p.n*2-1;i++)
      {
      	for(int j=1;j<=p.n*2-1;j++)
         { 
           if(i==j || (i+j==p.n*2))
            {
               System.out.print(p.t);
            }
            else
            {
               System.out.print(" ");
            }
      	}
      	System.out.println();
         if(i>=p.n)
         {
            p.t--;
         }
         else
         {
            p.t++;
         }
      }
   }

 
}