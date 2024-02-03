import java.util.Scanner;

class Pattern67
{
	int n;
	Pattern67(int n)
	{
		this.n=n;
	}

	public int fact(int i)
	{
		int f=1,n=i;
		for(;i>1;i--)
		{
			f*=i;
		}
		return f/n;
	}

	public static void main(String Deepak[])
	{
		Scanner scan = new Scanner(System.in);
		Pattern67 p = new Pattern67(scan.nextInt());
		int sum=0;
		for(int i=1;i<=p.n;i++)
		{
			sum+=p.fact(i);
		}
		System.out.println(sum);
	}
}