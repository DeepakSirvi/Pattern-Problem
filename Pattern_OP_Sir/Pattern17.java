import java.util.Scanner;
/** 
 * n=5
     *
    ***
   *****
  *******
 ********* 
 */
class Pattern17
{
	Scanner scan = new Scanner(System.in);
	int n;
	Pattern17()
	{
		n = scan.nextInt();
	}

	public static void main(String Deepak[])
	{
		Pattern17 p = new Pattern17();
		for(int i=1;i<=p.n;i++)
		{
			for(int j=1;j<=p.n+i-1;j++)
			{
				if(j>=p.n-i+1)
				{
					System.out.print("*");					
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