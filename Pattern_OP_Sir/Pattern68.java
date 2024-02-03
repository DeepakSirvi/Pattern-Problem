import java.util.Scanner;

class Pattern68
{
	int n;
	Pattern68(int n)
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
		return f;
	}


	public int pow(int i)
	{
		int f=1,n=i;
		for(;i>=1;i--)
		{
			f*=n;
		}
		return f;
 	}

	public static void main(String Deepak[])
	{
		Scanner scan = new Scanner(System.in);
		Pattern68 p = new Pattern68(scan.nextInt());
		int sum=0;
		for(int i=1;i<=p.n;i++)
		{
			sum+=p.pow(i)/p.fact(i);
		}
		System.out.println(sum);
	}
}