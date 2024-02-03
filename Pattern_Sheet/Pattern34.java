import java.util.Scanner;
class Pattern34{
	Scanner scan = new Scanner(System.in);
	int n;
	Pattern34(){
		n=scan.nextInt();
	}

	public static void main(String Deepak[]){
		int t=1;
		Pattern34 p=new Pattern34();
		for(int i=1;i<=(p.n*2-1);i++)
		{
          
			for(int j=1;j<=t;j++)
			{
				System.out.print("*");
				
			}
			if(i<p.n)
					t++;
				else
					t--;
			System.out.println();
		}
	}
}