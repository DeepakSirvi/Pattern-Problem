import java.util.Scanner;

class Pattern31
{ Scanner scan = new Scanner(System.in);
  int n;
	Pattern31(){
	 n=scan.nextInt();	
	}
	public static void main(String[] Deepak)
	{
		int t;
		Pattern31 p = new Pattern31();
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