import java.util.Scanner;

class Pattern69
{
	int n;
	Pattern69(int n)
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
		Pattern69 p = new Pattern69(scan.nextInt());
		for(int i=1;i<=p.n;i++)
		{
			for(int j=1;j<=i*2-1;j++)
			{
			    System.out.print(p.pow(j)+" ");
			}
			System.out.println();
		}
	}
}