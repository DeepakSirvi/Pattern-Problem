import java.util.Scanner;
class L
{
	int n;
	Scanner scan = new Scanner(System.in);	
	L()
	{
		n = scan.nextInt();
	}

	public static void main(String Deepak[])
	{
		L p = new L();
		if(p.n%2==0)
		{
			p.n--;
		}
		for(int i=1;i<=p.n;i++)
		{
			for(int j=1;j<=p.n;j++)
			{
				if(j==1 || i==p.n)
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