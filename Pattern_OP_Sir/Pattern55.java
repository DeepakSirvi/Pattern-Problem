import java.util.Scanner;
class Pattern55
{
	int n;
	Pattern55(int n)
	{
		this.n=n;
	}
	public static void main (String Deepak[])
	{
		Scanner scan = new Scanner(System.in);
		Pattern55 p = new Pattern55(scan.nextInt());
		for(int i=1;i<=p.n;i++)
		{ 
			int t=p.n-i+1;
			for(int j=1;j<=(p.n);j++)
			{
		       	if(j<i)
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