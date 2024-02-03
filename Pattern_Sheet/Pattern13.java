import java.util.Scanner;

class Pattern13
{ Scanner scan = new Scanner(System.in);
  int n;
	Pattern13(){
	 n=scan.nextInt();	
	}
	public static void main(String[] Deepak)
	{
		int t;
		Pattern13 p = new Pattern13();
		int i,j;
		for(i=1;i<=p.n;i++)
		{ t=p.n-i+1;
			for(j=1;j<=p.n-i+1;j++)
			{
				System.out.print(t--);
			}
			System.out.println();
		}

	}
}