import java.util.Scanner;
class Pattern26{
	Scanner scan = new Scanner(System.in);
	String s;
	Pattern26(){
		s=scan.nextLine();
	}

	public static void main(String Deepak[]){
		int t=0;
		Pattern26 p=new Pattern26();
		//String s ="INDIA";
		for(int i=1;i<=p.s.length()*2;i++)
		{
          
     		System.out.print(p.s.substring(0,t));
			if(i<p.s.length()+1)
					t++;
				else
					t--;
			System.out.println();
		}
	}
}