import java.util.Scanner;
class I
{
	int n;
	Scanner scan = new Scanner(System.in);	
	I()
	{
		n = scan.nextInt();
	}

	public static void main(String Deepak[])
	{
		I p = new I();
		if(p.n%2==0)
		{
			p.n--;
		}
		for(int i=1;i<=p.n;i++)
		{
			for(int j=1;j<=p.n;j++)
			{
				if(i==1 || i==p.n || j==(p.n/2+1))
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