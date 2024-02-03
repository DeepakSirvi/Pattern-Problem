import java.util.Scanner;

class Pattern23
{ Scanner scan = new Scanner(System.in);
  int n;
	Pattern23(){
	 n=scan.nextInt();	
	}
	public static void main(String[] Deepak)
	{
		char ch;
		Pattern23 p = new Pattern23();
		int i,j;
		for(i=1;i<=p.n;i++)
		{ ch=65;
			for(j=1;j<=i*2-1;j++)
			{
				System.out.print(j<i?ch++:ch--);
			}
			System.out.println();
		}

	}
}