import java.util.Scanner;
class Pattern47
{
	int n;
	Pattern47(int n)
	{
		this.n=n;
	}
	public static void main (String Deepak[])
	{
		Scanner scan = new Scanner(System.in);
		Pattern47 p = new Pattern47(scan.nextInt());
		for(int i=1;i<=p.n;i++)
		{ 
			char ch = (char)(65+i-1);
			for(int j=1;j<=p.n;j++)
			{
			 System.out.print(ch++ + " ");
			 if(ch==65+p.n)
			 {
			 	ch = (char)(65);
			 }
			}	
			System.out.println();

		}

	}
}