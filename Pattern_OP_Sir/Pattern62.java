import java.util.Scanner;

class Pattern62
{
	int n;
	Pattern62(int n)
	{
		this.n=n;
	}

	public static void main(String Deepak[])
	{
		Scanner scan = new Scanner(System.in);
		Pattern62 p = new Pattern62(scan.nextInt());
		int sum=0;
		for(int i=1;i<=p.n;i++)
		{
			sum+=i;
		}
		System.out.println(sum);
	}
}