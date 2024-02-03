import java.util.Scanner;
class Pattern19{
   int n;
   Scanner scan = new Scanner(System.in);
   Pattern19(){
      n=scan.nextInt();
   }

   public static void main(String Deepak[]){
   	 Pattern19 p = new Pattern19();
   	 int i,j;
   	 for(i=1;i<=p.n;i++){
   	 	 for(j=1;j<=i*2-1;j++){
   	 	  	 System.out.print("*");
   	 	    }

         System.out.println(); 
   	    }
    }
}