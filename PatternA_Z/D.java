import java.util.Scanner;
class D
{
	int n;
	Scanner scan = new Scanner(System.in);	
	D()
	{
		n = scan.nextInt();
	}

	public static void main(String Deepak[])
	{
		D p = new D();
		for(int i=1;i<=p.n;i++)
		{
			for(int j=1;j<=p.n;j++)
			{
				if(i==1 || i== p.n || j==p.n || j==(p.n/2) )
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