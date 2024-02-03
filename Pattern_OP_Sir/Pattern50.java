import java.util.Scanner;
class Pattern50
{
  int n;
  Pattern50(int n)
  {
    this.n=n;
  }
  public static void main(String Deepak[])
  {
    Scanner scan = new Scanner(System.in);
    Pattern50 p = new Pattern50(scan.nextInt());
    char t;
    for(int i=1;i<=p.n;i++)
    { if(i%2==0)
       {
        t=66;
       }
       else 
       {
        t=65;
       }
      for(int j=1;j<=i;j++)
      {
        System.out.print(t);  

        if(j%2==0)
        {
          t--;
          if(t==64)
          {
            t=65;
          }
        }
        else 
        {
          t++;
          if(t==67)
          {
            t=65;
          }
        }   
      } 

      System.out.println();
    }

  }
}