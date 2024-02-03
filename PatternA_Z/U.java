import java.util.Scanner;
class U
{
	int n;
	Scanner scan = new Scanner(System.in);	
	U()
	{
		n = scan.nextInt();
	}

	public static void main(String Deepak[])
	{
		U p = new U();
		for(int i=1;i<=p.n;i++)
		{
			for(int j=1;j<=p.n;j++)
			{
				if(j==1 || i==p.n || j==p.n)
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