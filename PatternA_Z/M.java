import java.util.Scanner;
class M
{
	int n;
	Scanner scan = new Scanner(System.in);	
	M()
	{
		n = scan.nextInt();
	}

	public static void main(String Deepak[])
	{
		M p = new M();
		if(p.n%2==0)
		{
			p.n--;
		}
		for(int i=1;i<=p.n;i++)
		{
			for(int j=1;j<=p.n;j++)
			{
				if(j==1 || j==p.n || (i==j && i<=p.n/2+1) || ((i+j==p.n+1) && i<p.n/2+1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}	

			}
			System.out.println();
		}
	}
}		