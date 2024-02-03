import java.util.Scanner;

class Pattern39{
  Scanner scan = new Scanner(System.in);
	int n;
	Pattern39(){
     n = scan.nextInt();
	}

	public static void main(String Deepak[]){
		int i,j;
		Pattern39 p =new Pattern39();

		for(i=1;i<=p.n;i++){
			char t=65;
			for(j=1;j<=(p.n-i)*2+1;j++){
				System.out.print(j<p.n?t++:t--);
			}
			      System.out.println();
		}
	}
}