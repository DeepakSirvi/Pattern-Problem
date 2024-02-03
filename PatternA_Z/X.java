import java.util.Scanner;
class X
{
	int n;
	Scanner scan = new Scanner(System.in);	
	X()
	{
		n = scan.nextInt();
	}

	public static void main(String Deepak[])
	{
		X p = new X();
		if(p.n%2==0)
		{
			p.n--;
		}
		for(int i=1;i<=p.n;i++)
		{
			for(int j=1;j<=p.n;j++)
			{
				if(j==i || (i+j==p.n+1))
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