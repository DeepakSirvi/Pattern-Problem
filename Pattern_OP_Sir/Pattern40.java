import java.util.Scanner;
class Pattern40
{
	int n;
	Pattern40(int n)
	{
		this.n=n;
	}
	public static void main (String Deepak[])
	{
		Scanner scan = new Scanner(System.in);
		Pattern40 p = new Pattern40(scan.nextInt());
		for(int i=1;i<=p.n;i++)
		{ char t=(char)(65);
			for(int j=1;j<=p.n-i+1;j++)
			{
		
			 System.out.print(t++);
			}	
			System.out.println();
		}

	}
}