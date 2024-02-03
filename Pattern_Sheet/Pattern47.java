import java.util.Scanner;
class Pattern47{
	Scanner scan = new Scanner(System.in);
	int n;
	Pattern47(){
		n=scan.nextInt();
	}

	public static void main(String Deepak[]){
		
		Pattern47 p=new Pattern47();
		for(int i=1;i<=p.n;i++){
			char t=65;
			for(int j=1;j<=(p.n-i+1)*2;j++){
				System.out.print(j>=p.n-i+1?t--:t++);
			
				if(j==p.n-i+1){
					t++;
				}  
					
			}
			System.out.println();
		}
	}
}