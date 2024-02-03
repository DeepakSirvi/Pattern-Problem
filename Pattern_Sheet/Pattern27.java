import java.util.Scanner;
class Pattern27{
	Scanner scan = new Scanner(System.in);
	int n;
	Pattern27(){
		n=scan.nextInt();
	}

	public static void main(String Deepak[]){
		char ch=65;
		int t=1;
		Pattern27 p=new Pattern27();
		for(int i=1;i<=(p.n*2-1);i++)
		{
          
			for(int j=1;j<=t;j++)
			{
				System.out.print(ch);
				
			}
			if(i<p.n)
			{
					t++;
					ch++;
			}
				else
				{
					t--;
					ch--;
				}
			System.out.println();
		}
	}
}