import java.util.Scanner;
class B
{
	int n;
	Scanner scan = new Scanner(System.in);	
	B()
	{
		n = scan.nextInt();
	}

	public static void main(String Deepak[])
	{
		B p = new B();
		for(int i=1;i<=p.n;i++)
		{
			for(int j=1;j<=p.n;j++)
			{
				if((j==1 || j==p.n || i==1 || i==p.n || i==p.n/2+1) && (!(i==p.n && j==p.n)) && (!(i==1 && j==p.n)) && (!(j==p.n && i==p.n/2+1 )))
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