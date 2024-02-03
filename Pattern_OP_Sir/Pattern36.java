import java.util.Scanner;
class Pattern36
{
	int n;
	Pattern36(int n)
	{
		this.n=n;
	}
	public static void main (String Deepak[])
	{
		Scanner scan = new Scanner(System.in);
		Pattern36 p = new Pattern36(scan.nextInt());
		int t=1;
		for(int i=1;i<=p.n;i++)
		{
		
			for(int j=1;j<=i;j++)
			{

					System.out.print(t +" ");
					t+=2;
				
			}	
			System.out.println();
		}

	}
}