import java.util.Scanner;
class *
{
	int n;
	Scanner scan = new Scanner(System.in);	
	*()
	{
		n = scan.nextInt();
	}

	public static void main(String Deepak[])
	{
		* p = new *();
		// for(int i=1;i<=p.n;i++)
		// {
		// 	for(int j=1;j<=p.n;j++)
		// 	{
		// 		if(i==1 || j==1 || j==p.n || i==(p.n/2+1))
		// 		{
		// 			System.out.print("*");
		// 		}
		// 		else
		// 		{
		// 			System.out.print(" ");
		// 		}	

		// 	}
		// 	System.out.println();
		// }
		for(int i=0;i<p.n;i++)
		{
			for(int j=0;j<=p.n+i;j++)
			{
				if((i+j==p.n) || (j-i==p.n))
				{
					System.out.print("*");
				}
				else if((i==p.n/2) && (j>i) )
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