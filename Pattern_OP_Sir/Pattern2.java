import java.util.Scanner;
/** n=5
 11111
 0000
 111
 00
 1
 */
class Pattern2{
	int n;
	Scanner scan = new Scanner(System.in); 
   Pattern2(){
   	n = scan.nextInt();
   }

   public static void main (String Deepak[]){
   Pattern2 p = new Pattern2();
   for(int i=1;i<=p.n;i++){
   	for(int j=1;j<=p.n-i+1;j++){
      if(i%2==0){
       System.out.print(0);
      }
      else{
       System.out.print(1);
      }
   	}
   	System.out.println();
   }
   }

 
}