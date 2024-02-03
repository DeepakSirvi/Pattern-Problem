import java.util.Scanner;
class Q
{
	int n;
	Scanner scan = new Scanner(System.in);	
	Q()
	{
		n = scan.nextInt();
	}

	public static void main(String Deepak[])
	{
		Q p = new Q();
		for(int i=1;i<=p.n;i++)
		{
			for(int j=1;j<=p.n-1;j++)
			{
				if((j==1 || j==p.n-1 || i==1 || i==p.n-1 || (i==j+1 && i>=p.n/2+1)) &&(!(i==1 && j==1)) && (!(i==1 && j==p.n-1)) && (!(j==1 && (i==p.n-1 || i==p.n ))) && (!(j==p.n-1 && i==p.n-1)))
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