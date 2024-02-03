import java.util.Scanner;
class Pattern35
{
	int n;
	Pattern35(int n)
	{
		this.n=n;
	}
	public static void main (String Deepak[])
	{
		Scanner scan = new Scanner(System.in);
		Pattern35 p = new Pattern35(scan.nextInt());
		
		for(int i=1;i<=p.n;i++)
		{
		int t=1;
		char ch=65; 
			for(int j=1;j<=i;j++)
			{

				if(i%2==0)
				{
					System.out.print(ch++ +" ");
				}
				else
				{
					System.out.print(t++ +" ");
				}
			}	
			System.out.println();
		}

	}
}