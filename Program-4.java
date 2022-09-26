import java.util.Scanner;
public class TotalCount
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    // Entering the Length of the Array
    System.out.println("Enter the lenth of the Array");
    int a[] = new int[scan.nextInt];
    // Entering the Elements of the Array
    System.out.println("Enter the Array Elements");
    // Logic for Multiple of Given Numbers
    for(int i=0;i<a.length;i++)
    {
      a[i] = scan.nextInt();
    }
    System.out.print("{");
    for(int i=1;i<=9;i++)
    {
      int k=0;
      for(int j=0;j<a.length-1;j++)
      {
        if(a[j]%==0)
        {
          k++;
        }
      }
      System.out.print(i+":"+k+",");
    }
    System.out.println("}");
  }
}
