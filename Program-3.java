import java.util.Scanner;
Public class NumberSeries2
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number");
    int a = scan.nextInt();
    if(a%2==0)
    {
      for(int i=1;i<=a-1;i++)
      {
      System.out.print(2*i-1+",");
      }
    }
  else
  {
    for(int i=1;i<=a;i++)
    {
      System.out.print(2*i-1+",");
    }
  }
  }
}
