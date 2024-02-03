import java.util.Scanner;
class Pattern49
{
	int n;
	Pattern49(int n)
	{
		this.n=n;
	}
	public static void main (String Deepak[])
	{
		Scanner scan = new Scanner(System.in);
		Pattern49 p = new Pattern49(scan.nextInt());
		for(int i=1;i<=p.n;i++)
		{ 
			int t=i;
              if(i>p.n/2+1)
              {
              	t=p.n-i+1;
              }
			for(int j=1;j<=p.n-i+1;j++)
			{
						System.out.print(t);	
			}	
			System.out.println();

		}

	}
}