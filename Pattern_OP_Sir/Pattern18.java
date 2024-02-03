import java.util.Scanner;
/** 
 * n=5
   55555
   45555
   34555
   23455
   12345
 */
class Pattern18
{
	Scanner scan = new Scanner(System.in);
	int n;
	Pattern18()
	{
		n = scan.nextInt();
	}

	public static void main(String Deepak[])
	{
		Pattern18 p = new Pattern18();
		int t;
		for(int i=1;i<=p.n;i++)
		{
			t=p.n-i+1;
			for(int j=1;j<=p.n;j++)
			{
			 	System.out.print(t<p.n?t++:(t=t));					
			}
			System.out.println();
		}


	}
}