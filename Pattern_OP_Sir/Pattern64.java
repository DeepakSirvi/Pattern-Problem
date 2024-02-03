import java.util.Scanner;

class Pattern64
{
	int n;
	Pattern64(int n)
	{
		this.n=n;
	}

	public int fact(int i)
	{
		int f=1;
		for(;i>1;i--)
		{
			f*=i;
		}
		return f;
	}

	public static void main(String Deepak[])
	{
		Scanner scan = new Scanner(System.in);
		Pattern64 p = new Pattern64(scan.nextInt());
		int sum=0;
		for(int i=1;i<=p.n;i++)
		{
			sum+=p.fact(i);
		}
		System.out.println(sum);
	}
}