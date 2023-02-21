import java.util.Scanner;
class Main
{
    public static void main(String[] args) {
        
        try{
            int num1, num2, num3;
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter first number: ");
            num1 = sc.nextInt();
            
            System.out.println("Enter second number: ");
            num2 = sc.nextInt();

            num3 = num1/num2;
            System.out.println("Result : " + num3 );

        }
        catch( ArithmeticException e)
        {
            System.out.println("Error : " + e.getMessage() );
            System.out.println("Error : " + e );
        }

        try{
            int num4, num5;
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a number: ");
            num4 = sc.nextInt();
            
            int num = Integer.parseInt(" ");
            
            num5 = num4 / num ;
            System.out.println("Result : " + num5 );
        }
        catch( NumberFormatException e)
        {
            System.out.println("Error : " + e.getMessage() );
            System.out.println("Error : " + e );
        }

        System.out.println("End of program...");
    }
}