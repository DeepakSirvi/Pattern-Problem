import java.util.Scanner;
class Pattern41
{
	int n;
	Pattern41(int n)
	{
		this.n=n;
	}
	public static void main (String Deepak[])
	{
		Scanner scan = new Scanner(System.in);
		Pattern41 p = new Pattern41(scan.nextInt());
		for(int i=1;i<=p.n;i++)
		{ char t=(char)(65+p.n-1);
			for(int j=1;j<=i;j++)
			{
		
			 System.out.print(t--);
			}	
			System.out.println();
		}

	}
}