import java.util.Scanner;
class V
{
	int n;
	Scanner scan = new Scanner(System.in);	
	V()
	{
		n = scan.nextInt();
	}

	public static void main(String Deepak[])
	{
		V p = new V();
		for(int i=1;i<=p.n;i++)
		{
			for(int j=1;j<=p.n*2-1;j++)
			{
				if(i==j || (i+j == p.n*2))
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