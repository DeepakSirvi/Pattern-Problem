import java.util.Scanner;
class G
{
	int n;
	Scanner scan = new Scanner(System.in);	
	G()
	{
		n = scan.nextInt();
	}

	public static void main(String Deepak[])
	{
		G p = new G();
		for(int i=1;i<=p.n;i++)
		{
			for(int j=1;j<=p.n;j++)
			{
				if(i==1 || j==1 || i==p.n || (i==(p.n/2+1) && j>=i) || (j==p.n && i>=(p.n/2+1)))
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