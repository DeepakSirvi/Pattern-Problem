import java.util.Scanner;
class Pattern51
{
  int n;
  Pattern51(int n)
  {
    this.n=n;
  }
  public static void main (String Deepak[])
  {
    Scanner scan = new Scanner(System.in);
    Pattern51 p = new Pattern51(scan.nextInt());
    for(int i=1;i<=p.n;i++)
    { 
      char t=(char)(65+i-1);
      for(int j=1;j<=i*2-1;j++)
      {
            System.out.print(t);
            if(j<i)
            {
              t--;
            } 
            else 
            {
              t++;
            }
      } 
      System.out.println();

    }

  }
}