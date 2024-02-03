import java.util.Scanner;
class Pattern50{
	Scanner scan = new Scanner(System.in);
	int n,x;
	Pattern50(){
		n=scan.nextInt();
		x=n;
	}

	public static void main(String Deepak[]){
		
		Pattern50 p=new Pattern50();
		for(int i=1;i<=p.n;i++){
			int t=p.x;
			for(int j=1;j<=i;j++){
				System.out.print(t++);		
			}
			System.out.println();
			p.x--;
		}
	}
}