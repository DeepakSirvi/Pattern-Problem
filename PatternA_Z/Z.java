import java.util.Scanner;
class Z
{
	int n;
	Scanner scan = new Scanner(System.in);	
	Z()
	{
		n = scan.nextInt();
	}

	public static void main(String Deepak[])
	{
		Z p = new Z();
		for(int i=1;i<=p.n;i++)
		{
			for(int j=1;j<=p.n;j++)
			{
				if(i==1 || i==p.n || (i+j==p.n+1))
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