import java.util.Scanner;
class Pattern34
{
	int n;
	Pattern34(int n)
	{
		this.n=n;
	}
	public static void main (String Deepak[])
	{
		Scanner scan = new Scanner(System.in);
		Pattern34 p = new Pattern34(scan.nextInt());
		for(int i=1;i<=p.n;i++)
		{ int t=i;
			for(int j=1;j<=p.n-i+1;j++)
			{
		
			 System.out.print(t++);
			}	
			System.out.println();
		}

	}
}