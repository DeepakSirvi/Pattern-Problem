import java.util.Scanner;

class Pattern29
{ Scanner scan = new Scanner(System.in);
  int n;
	Pattern29(){
	 n=scan.nextInt();	
	}
	public static void main(String[] Deepak)
	{
		int t;
		Pattern29 p = new Pattern29();
		int i,j;
		for(i=1;i<=p.n;i++)
		{ t=i;
			for(j=1;j<=((p.n-i+1)*2-1);j++)
			{
				System.out.print(j<p.n-i+1?t++:t--);
			}
			System.out.println();
		}

	}
}