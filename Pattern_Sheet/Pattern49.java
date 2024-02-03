import java.util.Scanner;
class Pattern49{
	Scanner scan = new Scanner(System.in);
	int n;
	Pattern49(){
		n=scan.nextInt();
	}

	public static void main(String Deepak[]){
		
		Pattern49 p=new Pattern49();
		int x=9;
		for(int i=1;i<=p.n;i++){
			int t=x;
			for(int j=1;j<=i*2-1;j++){
				System.out.print(j<i?t++:t--);		
			}
			System.out.println();
			x--;
		}
	}
}