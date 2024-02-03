import java.util.Scanner;

class Pattern30
{ Scanner scan = new Scanner(System.in);
  int n;
	Pattern30(){
	 n=scan.nextInt();	
	}
	public static void main(String[] Deepak)
	{
	
		Pattern30 p = new Pattern30();
		int i,j;
		for(i=1;i<=p.n;i++)
		{ 
			for(j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}
}