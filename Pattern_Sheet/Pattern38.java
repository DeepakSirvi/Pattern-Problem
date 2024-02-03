import java.util.Scanner;

class Pattern38{
  Scanner scan = new Scanner(System.in);
	int n;
	Pattern38(){
     n = scan.nextInt();
	}

	public static void main(String Deepak[]){
		int i,j;
		Pattern38 p =new Pattern38();

		for(i=1;i<=p.n;i++){
			char t=65;
			for(j=1;j<=i*2-1;j++){
				System.out.print(j<i?t++:t--);
			}
			      System.out.println();
		}
	}
}