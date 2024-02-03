import java.util.Scanner;
/** n=5
 1
 3 2
 4 5 6 
 10 9 8 7
 11 12 13 14 15
 */
class Pattern12

{
	int n,t;

	Scanner scan = new Scanner(System.in); 
   Pattern12()
   {
   	n = scan.nextInt();
      t = 0;
   }

   public static void main (String Deepak[])
   {

      Pattern12 p = new Pattern12();
      for(int i=1;i<=p.n;i++)
      {
         if(i%2==0)
            {
               p.t = p.t+i-1;
            }  
            else
            {
               p.t = p.t+i;
            }
      	for(int j=1;j<=i;j++)
         { 
            System.out.print(p.t+" "); 
            if(i%2==0)
            {
               p.t--;
            }  
            else
            {
               p.t++;
            }
      	}
      	System.out.println();
      }
   }

 
}