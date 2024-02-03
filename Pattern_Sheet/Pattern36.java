import java.util.Scanner;

class Pattern36{
  Scanner scan = new Scanner(System.in);
	int n;
	Pattern36(){
     n = scan.nextInt();
	}

	public static void main(String Deepak[]){
		int i,j,x=1;
		Pattern36 p =new Pattern36();

		for(i=1;i<=p.n*2-1;i++){
			int t=1;
			for(j=1;j<=x*2-1;j++){
				System.out.print(j<x?t++:t--);
			}
			if(i<p.n)
			{
				x++;
			}
			else{
				x--;
			}
      System.out.println();
		}
	}
}