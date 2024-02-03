import java.util.Scanner;
class Pattern37
{
	int n;
	Pattern37(int n)
	{
		this.n=n;
	}
	public static void main (String Deepak[])
	{
		Scanner scan = new Scanner(System.in);
		Pattern37 p = new Pattern37(scan.nextInt());
		for(int i=1;i<=p.n;i++)
		{ char t=(char)(p.n-i+65);
			for(int j=1;j<=p.n-i+1;j++)
			{
		
			 System.out.print(t--);
			}	
			System.out.println();
		}

	}
}