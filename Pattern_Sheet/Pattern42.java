import java.util.Scanner;
class Pattern42{
	Scanner scan = new Scanner(System.in);
	int n;
	Pattern42(){
		n=scan.nextInt();
	}

	public static void main(String Deepak[]){
		
		Pattern42 p=new Pattern42();
		for(int i=1;i<=(p.n*2-1);i++)
		{
			char t=65;
             t+=p.n-i;
			for(int j=1;j<=(p.n-i)+1;j++)
			{
				System.out.print(t--);
				
			}
			System.out.println();
		}
	}
}