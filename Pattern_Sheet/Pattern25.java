import java.util.Scanner;
class Pattern25{
	Scanner scan = new Scanner(System.in);
	int n;
	Pattern25(){
		n=scan.nextInt();
	}

	public static void main(String Deepak[]){
		int t=1;
		Pattern25 p=new Pattern25();
		for(int i=1;i<=(p.n*2-1);i++)
		{
          
			for(int j=1;j<=t;j++)
			{
				System.out.print(t);
				
			}
			if(i<p.n)
					t++;
				else
					t--;
			System.out.println();
		}
	}
}