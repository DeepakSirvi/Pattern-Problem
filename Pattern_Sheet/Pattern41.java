import java.util.Scanner;
class Pattern41{
	Scanner scan = new Scanner(System.in);
	int n;
	Pattern41(){
		n=scan.nextInt();
	}

	public static void main(String Deepak[]){
		
		int x=1;
		Pattern41 p=new Pattern41();
		for(int i=1;i<=(p.n*2-1);i++)
		{
			char t=65;
             t+=i-1;
			for(int j=1;j<=x;j++)
			{
				System.out.print(t--);
				
			}
			if(i<p.n)
			{
					
				     x++;
			}
				else
				{
		
				    x--;
				}
			System.out.println();
		}
	}
}