import java.util.Scanner;
/** 
 * n=7
   1
   23
   4
   56
   7
   89
   10
 */
class Pattern23
{
	Scanner scan = new Scanner(System.in);
	int n;
	Pattern23()
	{
		n = scan.nextInt();
	}

	public static void main(String Deepak[])
	{
		Pattern23 p = new Pattern23();
		int t = 1;
		int x;
		for(int i=1;i<=p.n;i++)
		{
			if(i%2==0)
			{
				x=2;
			}
			else
			{
				x=1;
			}
			for(int j=1;j<=x;j++)
			{
			 	System.out.print(t++);					
			}
			System.out.println();
		}


	}
}