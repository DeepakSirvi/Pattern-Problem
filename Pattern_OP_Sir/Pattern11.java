import java.util.Scanner;
/** n=5
 12345
 21234
 32123 
 43212
 54321
 */
class Pattern11
{
	int n;
	Scanner scan = new Scanner(System.in); 
   Pattern11()
   {
   	n = scan.nextInt();
   }

   public static void main (String Deepak[])
   {
      Pattern11 p = new Pattern11();
      for(int i=1;i<=p.n;i++)
      {
         int t=i;
      	for(int j=1;j<=p.n;j++)
         { 
            System.out.print(t+" ");
            if(j<i)
            {
               t--;
            }
            else
            {
               t++;
            }
          

      	}
      	System.out.println();
      }
   }

 
}