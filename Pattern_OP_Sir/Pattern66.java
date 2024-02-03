import java.util.Scanner;

class Pattern66
{
	int n;
	Pattern66(int n)
	{
		this.n=n;
	}

	public int pow(int i)
	{
		int f=1,n=i;
		for(;i>=1;i--)
		{
			f*=n;
		}
		return (f/n);
 	}

	public static void main(String Deepak[])
	{
		Scanner scan = new Scanner(System.in);
		Pattern66 p = new Pattern66(scan.nextInt());
		int sum=0;
		for(int i=1;i<=p.n;i++)
		{
			sum+=p.pow(i);
		}
		System.out.println(sum);
	}
}