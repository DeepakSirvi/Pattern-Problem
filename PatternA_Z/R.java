import java.util.Scanner;
class R
{
	int n;
	Scanner scan = new Scanner(System.in);	
	R()
	{
		n = scan.nextInt();
	}

	public static void main(String Deepak[])
	{
		R p = new R();
		if(p.n%2==0)
		{
			p.n--;
		}
		for(int i=1;i<=p.n;i++)
		{
			for(int j=1;j<=p.n/2+1;j++)
			{
				if(j==1 || i==1 || i==p.n/2+1 || (j==p.n/2+1 && i<=p.n/2) || (i>p.n/2 && i-j==p.n/2))
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