import java.util.Scanner;

class Pattern63
{
	int n;
	Pattern63(int n)
	{
		this.n=n;
	}
	
	public static void main(String Deepak[])
	{
		Scanner scan = new Scanner(System.in);
		Pattern63 p = new Pattern63(scan.nextInt());
		int sum=0;
		for(int i=1;i<=p.n;i++)
		{
			sum+=(i*i);
		}
		System.out.println(sum);
	}
}