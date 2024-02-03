import java.util.Scanner;
class Pattern43{
	Scanner scan = new Scanner(System.in);
	int n;
	Pattern43(){
		n=scan.nextInt();
	}

	public static void main(String Deepak[]){
		
		Pattern43 p=new Pattern43();
		int t=0;
		for(int i=1;i<=(p.n);i++)
		{
			
			for(int j=1;j<=i+1;j++)
			{
				System.out.print(t++ +" ");
				if(t>9)
				{
					t=0;
				}
				
			}

			System.out.println();
		}
	}
}