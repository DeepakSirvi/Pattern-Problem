import java.util.Scanner;
class O
{
	int n;
	Scanner scan = new Scanner(System.in);	
	O()
	{
		n = scan.nextInt();
	}

	public static void main(String Deepak[])
	{
		O p = new O();
		for(int i=1;i<=p.n;i++)
		{
			for(int j=1;j<=p.n;j++)
			{
				if((j==1 || j==p.n || i==1 || i==p.n) && (!(j==1 && i==1)) && (!(i==p.n && j==p.n)) && (!(i==1 && j==p.n)) && (!(j==1 && i==p.n )))
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