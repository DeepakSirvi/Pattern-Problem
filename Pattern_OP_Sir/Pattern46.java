import java.util.Scanner;
class Pattern46
{
	int n;
	Pattern46(int n)
	{
		this.n=n;
	}
	public static void main (String Deepak[])
	{
		Scanner scan = new Scanner(System.in);
		Pattern46 p = new Pattern46(scan.nextInt());
		int t=1;
		for(int i=1;i<=p.n;i++)
		{ 
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