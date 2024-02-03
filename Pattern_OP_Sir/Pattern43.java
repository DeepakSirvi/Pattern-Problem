import java.util.Scanner;
class Pattern43
{
	int n;
	Pattern43(int n)
	{
		this.n=n;
	}
	public static void main (String Deepak[])
	{
		Scanner scan = new Scanner(System.in);
		Pattern43 p = new Pattern43(scan.nextInt());
		for(int i=1;i<=p.n;i++)
		{ char t=(char)(65+p.n-i);
			for(int j=1;j<=i;j++)
			{
		
			 System.out.print(t++);
			}	
			System.out.println();
		}

	}
}