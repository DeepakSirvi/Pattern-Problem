import java.util.Scanner;

class Pattern65
{
	int n;
	Pattern65(int n)
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
		return f;
 	}

	public static void main(String Deepak[])
	{
		Scanner scan = new Scanner(System.in);
		Pattern65 p = new Pattern65(scan.nextInt());
		int sum=0;
		for(int i=1;i<=p.n;i++)
		{
			sum+=p.pow(i);
		}
		System.out.println(sum);
	}
}