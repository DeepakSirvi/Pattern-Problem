import java.util.Scanner;

class Pattern17
{ Scanner scan = new Scanner(System.in);
  int n;
	Pattern17(){
	 n=scan.nextInt();	
	}
	public static void main(String[] Deepak)
	{
		int t;
		Pattern17 p = new Pattern17();
		int i,j;
		for(i=1;i<=p.n;i++)
		{ t=1;
			for(j=1;j<=i*2-1;j++)
			{
				System.out.print(j<i?t++:t--);
			}
			System.out.println();
		}

	}
}