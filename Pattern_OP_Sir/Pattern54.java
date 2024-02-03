import java.util.Scanner;
class Pattern54
{
	int n;
	Pattern54(int n)
	{
		this.n=n;
	}
	public static void main (String Deepak[])
	{
		Scanner scan = new Scanner(System.in);
		Pattern54 p = new Pattern54(scan.nextInt());
		for(int i=1;i<=p.n;i++)
		{ 
			int t=i;
			for(int j=1;j<=(p.n);j++)
			{
		       	if(j<(p.n-i+1))
		       	{
		       		System.out.print(" ");
		       	}
		       	else 
		       	{
		       		System.out.print(t--);
		       }
			}	
			System.out.println();

		}

	}
}