import java.util.Scanner;
class Pattern38
{
	int n;
	Pattern38(int n)
	{
		this.n=n;
	}
	public static void main (String Deepak[])
	{
		Scanner scan = new Scanner(System.in);
		Pattern38 p = new Pattern38(scan.nextInt());
		for(int i=1;i<=p.n;i++)
		{ char t=(char)(p.n+65-1);
			for(int j=1;j<=p.n-i+1;j++)
			{
		
			 System.out.print(t--);
			}	
			System.out.println();
		}

	}
}