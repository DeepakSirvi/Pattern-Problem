import java.util.Scanner;
class C
{
	int n;
	Scanner scan = new Scanner(System.in);	
	C()
	{
		n = scan.nextInt();
	}

	public static void main(String Deepak[])
	{
		C p = new C();
		for(int i=1;i<=p.n;i++)
		{
			for(int j=1;j<=p.n;j++)
			{
				if(i==1 || j==1 || i==p.n)
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