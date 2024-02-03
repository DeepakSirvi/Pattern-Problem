import java.util.Scanner;
/** n=4
 *000*000*
 0*00*00*0
 00*000*00
 000***000
 */
class Pattern5{
	int n;
	Scanner scan = new Scanner(System.in); 
   Pattern5(){
   	n = scan.nextInt();
   }

   public static void main (String Deepak[]){
   Pattern5 p = new Pattern5();
   for(int i=0;i<p.n;i++){
   	for(int j=0;j<p.n*2+1;j++){
      if(i==j || j==p.n || (i+j==p.n*2) ){
       System.out.print("*");
      }
      else{
       System.out.print(0);
      }
   	}
   	System.out.println();
   }
   }

 
}