import java.util.Scanner;
class Pattern39
{
	int n;
	Pattern39(int n)
	{
		this.n=n;
	}
	public static void main (String Deepak[])
	{
		Scanner scan = new Scanner(System.in);
		Pattern39 p = new Pattern39(scan.nextInt());
		for(int i=1;i<=p.n;i++)
		{ char t=(char)(65+i-1);
			for(int j=1;j<=p.n-i+1;j++)
			{
		
			 System.out.print(t++);
			}	
			System.out.println();
		}

	}
}