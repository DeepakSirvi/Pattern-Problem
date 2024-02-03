   import java.util.Scanner;
/** n=5
      1
     123
    12345
   1234567
  123456789
   1234567
    12345
     123
      1
 */
class Pattern4{
	int n;
	Scanner scan = new Scanner(System.in); 
   Pattern4(){
   	n = scan.nextInt();
   }

   public static void main (String Deepak[]){
   Pattern4 p = new Pattern4();
   int y=p.n;
   int x=p.n;
   for(int i=1;i<=p.n*2-1;i++){
      int t=1;
   	for(int j=1;j<=x;j++){
      if(j>=y){
       System.out.print(t++);
      }
      else{
       System.out.print(" ");
      }
   	}
   	System.out.println();
      if(i<p.n){
         x++;
         y--;
      }
      else{
         x--;
         y++;
      }
   }
   }

 
}