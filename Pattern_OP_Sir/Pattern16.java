import java.util.Scanner;
/** 
 * n=5
 123454321 
  1234321
   12321
    121
     1
 */
class Pattern16{
	Scanner scan = new Scanner(System.in);
	int n;
	Pattern16()
	{
		n = scan.nextInt();
	}

	public static void main(String Deepak[])
	{
		Pattern16 p = new Pattern16();
		int t;
		for(int i=1;i<=p.n;i++)
		{
			t=1;
			for(int j=1;j<=p.n*2-i;j++)
			{
				if(j>=i)
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