import java.util.Scanner;

class Pattern18
{ Scanner scan = new Scanner(System.in);
  int n;
	Pattern18(){
	 n=scan.nextInt();	
	}
	public static void main(String[] Deepak)
	{
		int t;
		Pattern18 p = new Pattern18();
		int i,j;
		for(i=1;i<=p.n;i++)
		{ t=1;
			for(j=1;j<=((p.n-i+1)*2-1);j++)
			{
				System.out.print(j<p.n-i+1?t++:t--);
			}
			System.out.println();
		}

	}
}