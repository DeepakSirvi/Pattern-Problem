import java.util.Scanner;
class Pattern42
{
	int n;
	Pattern42(int n)
	{
		this.n=n;
	}
	public static void main (String Deepak[])
	{
		Scanner scan = new Scanner(System.in);
		Pattern42 p = new Pattern42(scan.nextInt());
		for(int i=1;i<=p.n;i++)
		{ char t=(char)(65+i-1);
			for(int j=1;j<=i;j++)
			{
		
			 System.out.print(t++);
			}	
			System.out.println();
		}

	}
}