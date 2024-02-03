import java.util.Scanner;
class Pattern48{
	Scanner scan = new Scanner(System.in);
	int n;
	Pattern48(){
		n=scan.nextInt();
	}

	public static void main(String Deepak[]){
		
		Pattern48 p=new Pattern48();
		for(int i=1;i<=p.n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i);		
			}
			System.out.println();
		}
	}
}