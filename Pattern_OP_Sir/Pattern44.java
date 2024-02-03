import java.util.Scanner;
class Pattern44
{
	int n;
	Pattern44(int n)
	{
		this.n=n;
	}
	public static void main (String Deepak[])
	{
		Scanner scan = new Scanner(System.in);
		Pattern44 p = new Pattern44(scan.nextInt());
		int t=11;
		for(int i=1;i<=p.n;i++)
		{ 
			for(int j=1;j<=p.n+i-1;j++)
			{
		     if(j>p.n-i)
			{
			 System.out.print(i + " ");
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