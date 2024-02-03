import java.util.Scanner;
class F
{
	int n;
	Scanner scan = new Scanner(System.in);	
	F()
	{
		n = scan.nextInt();
	}

	public static void main(String Deepak[])
	{
		F p = new F();
		for(int i=1;i<=p.n;i++)
		{
			for(int j=1;j<=p.n;j++)
			{
				if(i==1 || j==1  || (i==(p.n/2+1) && j<=i))
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