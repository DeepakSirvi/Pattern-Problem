import java.util.Scanner;

class Pattern24
{ Scanner scan = new Scanner(System.in);
  int n;
	Pattern24(){
	 n=scan.nextInt();	
	}
	public static void main(String[] Deepak)
	{
		char ch;
		Pattern24 p = new Pattern24();
		int i,j;
		for(i=1;i<=p.n;i++)
		{ ch=65;
			for(j=1;j<=((p.n-i+1)*2-1);j++)
			{
				System.out.print(j<p.n-i+1?ch++:ch--);
			}
			System.out.println();
		}

	}
}