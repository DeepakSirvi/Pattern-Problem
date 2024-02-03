import java.util.Scanner;

class Pattern71
{
	int n;
	Pattern71(int n)
	{
		this.n=n;
	}

	public int pow(int i)
	{
		return i*i;
 	}

	public static void main(String Deepak[])
	{
		Scanner scan = new Scanner(System.in);
		Pattern71 p = new Pattern71(scan.nextInt());
		int sum=0;
		for(int i=1;i<=p.n;i++)
		{
			int t=1;
			for(int j=1;j<=i;j++)
			{
			    sum+=t++;
			}
		}
		System.out.println(sum);
	}
}