import java.util.Scanner;
/** 
 * n=5
  EDCBABCDE
   DCBABCD
    CBABC
     BAB
      A
 */
class Pattern25
{
	Scanner scan = new Scanner(System.in);
	int n;
	Pattern25()
	{
		n = scan.nextInt();
	}

	public static void main(String Deepak[])
	{
		Pattern25 p = new Pattern25();
		char t;
		for(int i=1;i<=p.n;i++)
		{
			t=65;
			t+=p.n-i;
			for(int j=1;j<=p.n*2-i;j++)
			{
			 	if(j>=i)
			 	{
			 		System.out.print(j>=p.n?t++:t--);
			 	}				
			 	else
			 	{
			 		System.out.print(" ");
			 	}
			}
			System.out.println();
		}


	}
}