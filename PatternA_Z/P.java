import java.util.Scanner;
class P
{
	int n;
	Scanner scan = new Scanner(System.in);	
	P()
	{
		n = scan.nextInt();
	}

	public static void main(String Deepak[])
	{
		P p = new P();
		if(p.n%2==0)
		{
			p.n--;
		}
		for(int i=1;i<=p.n;i++)
		{
			for(int j=1;j<=p.n;j++)
			{
				if(j==1 || i==1 || i==p.n/2+1 || (j==p.n && i<=p.n/2))
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