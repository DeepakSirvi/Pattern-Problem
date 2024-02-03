import java.util.Scanner;
/** 
 * n=5
     1
    121
   12321
  1234321
 123454321 
 */
class Pattern15
{
	Scanner scan = new Scanner(System.in);
	int n;
	Pattern15()
	{
		n = scan.nextInt();
	}

	public static void main(String Deepak[])
	{
		Pattern15 p = new Pattern15();
		int t;
		for(int i=1;i<=p.n;i++)
		{
			t=1;
			for(int j=1;j<=p.n+i-1;j++)
			{
				if(j>=p.n-i+1)
				{
					System.out.print(j>=p.n?t--:t++);					
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