import java.util.Scanner;
/** 
 * n=5
   Aa
   Bb Bb
   Cc Cc Cc
   Dd Dd Dd Dd
 */
class Pattern26
{
	Scanner scan = new Scanner(System.in);
	int n;
	Pattern26()
	{
		n = scan.nextInt();
	}

	public static void main(String Deepak[])
	{
		Pattern26 p = new Pattern26();
	   char cap=64;
	   char sma=96;
		for(int i=1;i<=p.n;i++)
		{
			cap+=1;
			sma+=1;
			for(int j=1;j<=i;j++)
			{
			 	System.out.print(cap+""+sma+" ");
			 
			}					
			
			System.out.println();
		}


	}
}