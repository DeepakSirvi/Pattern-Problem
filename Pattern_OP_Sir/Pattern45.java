import java.util.Scanner;
class Pattern45
{
	int n;
	Pattern45(int n)
	{
		this.n=n;
	}
	public static void main (String Deepak[])
	{
		Scanner scan = new Scanner(System.in);
		Pattern45 p = new Pattern45(scan.nextInt());
		for(int i=1;i<=p.n;i++)
		{ 
			int t=1;
			for(int j=1;j<=p.n+i-1;j++)
			{
		     if(j>p.n-i)
			{
			 System.out.print(t++ + " ");
			}
			else 
			{
               System.out.print("  ");
			}
			}	
			System.out.println();

		}

	}
}