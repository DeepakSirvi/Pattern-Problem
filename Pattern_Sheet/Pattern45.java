import java.util.Scanner;
class Pattern45{
	Scanner scan = new Scanner(System.in);
	int n;
	Pattern45(){
		n=scan.nextInt();
	}

	public static void main(String Deepak[]){
		
		Pattern45 p=new Pattern45();
		for(int i=1;i<=p.n;i++){
			for(int j=1;j<=i*2-1;j++){
				System.out.print(j);		
			}
			System.out.println();
		}
	}
}