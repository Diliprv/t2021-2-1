
class Calculator
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    // Entering Inputs of two numbers
      System.out.pintln("Enter the two numbers to perform the reqquired operation");
    double a = scan.Double();
    double b = scan.Double();
    // Declaring an extra variable to store the operation performed
    double c = scan.Double();
    // Entering the operation in string format
    System.out.println("Enter the operation to be performed");
    String typeofoperation = scan.next();
    // Using Switch Operation to Perform and Print the Output 
    switch(typeofoperation)
    {
      case addition:
        c = a+b;
        System.out.println(" The Addition of Given Two Numbers is "+c);
        break;
      case subtraction:
        c = a-b;
        System.out.println(" The Subtraction of Given Two Numbers is "+c);
        break;
      case multiplication:
        c = a*b;
        System.out.printlm(" The Multiplicaton of Given Two Numbers is "+c);
        break;
      case division:
        c = a/b;
        System.out.println(" The Division of Given Two Number is "+c);
        break;
      default:
        System.out.println(" You have Entered Wrong Operation");
    }
  }
}
