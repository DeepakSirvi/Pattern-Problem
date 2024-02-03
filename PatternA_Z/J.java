import java.util.Scanner;
class J
{
	int n;
	Scanner scan = new Scanner(System.in);	
	J()
	{
		n = scan.nextInt();
	}

	public static void main(String Deepak[])
	{
		J p = new J();
		if(p.n%2==0)
		{
			p.n--;
		}
		for(int i=1;i<=p.n;i++)
		{
			for(int j=1;j<=p.n;j++)
			{
				if(i==1 || j==(p.n/2+1) || (i==p.n && j<p.n/2+1) || ( j==1 && i>p.n/2+1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}	

			}
			System.out.println();
		}
	}
}		