import java.util.Scanner;
class K
{
	int n;
	Scanner scan = new Scanner(System.in);	
	K()
	{
		n = scan.nextInt();
	}

	public static void main(String Deepak[])
	{
		K p = new K();
		if(p.n%2==0)
		{
			p.n--;
		}
		int end = p.n-2;
		for(int i=1;i<=p.n;i++)
		{
			for(int j=1;j<=p.n-2;j++)
			{
				if(j==1 || j==end)
				{
					System.out.print("*");
				}
				else if(i==p.n/2 && j==2)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(" ");
				}	

			}
			if(i<=p.n/2)
			{
				end--;
			}
			else
			{
				end++;
			}
			System.out.println();
		}
	}
}		