import java.util.Scanner;

class Pattern70
{
	int n;
	Pattern70(int n)
	{
		this.n=n;
	}
	public static void main(String Deepak[])
	{
		Scanner scan = new Scanner(System.in);
		Pattern70 p = new Pattern70(scan.nextInt());
		double t=1.000,sum=0.000;
		for(int i=1;i<=p.n;i++)
		{
			if(i%2==0)
			{
				sum-=(t/++t);

			}
			else 
			{
				sum+=(t/++t);
			}

		}
		System.out.print(sum);
	}
}