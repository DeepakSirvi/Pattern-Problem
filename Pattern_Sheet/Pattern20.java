import java.util.Scanner;
class Pattern20{
   int n;
   Scanner scan = new Scanner(System.in);
   Pattern20(){
      n=scan.nextInt();
   }

   public static void main(String Deepak[]){
   	 Pattern20 p = new Pattern20();
   	 int i,j,t=1;
   	 for(i=1;i<=p.n;i++){
   	 	 for(j=1;j<=i;j++,t++){
   	 	  	 System.out.print(t+" ");
   	 	    }

         System.out.println(); 
   	    }
    }
}