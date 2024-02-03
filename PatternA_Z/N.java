import java.util.Scanner;
class N
{
	int n;
	Scanner scan = new Scanner(System.in);	
	N()
	{
		n = scan.nextInt();
	}

	public static void main(String Deepak[])
	{
		N p = new N();
		for(int i=1;i<=p.n;i++)
		{
			for(int j=1;j<=p.n;j++)
			{
				if(j==1 || j==p.n || i==j)
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