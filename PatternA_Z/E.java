import java.util.Scanner;
class E
{
	int n;
	Scanner scan = new Scanner(System.in);	
	E()
	{
		n = scan.nextInt();
	}

	public static void main(String Deepak[])
	{
		E p = new E();
		if(p.n%2==0)
		{
			p.n--;
		}
		for(int i=1;i<=p.n;i++)
		{
			for(int j=1;j<=p.n;j++)
			{
				if(i==1 || j==1 || i==p.n || (i==(p.n/2+1) && j<=i))
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