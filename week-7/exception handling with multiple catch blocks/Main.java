// demonstrate multiple errors with multiple catch blocks

class Main
{
    public static void main(String[] args) {
        try
        {
            int n = 5/0;
            int arr[] = new int[5];
            arr[6] = 7;
            String str = null;
            System.out.println( str.length() );
            System.out.println( "I am in try block ");
        }
        catch( ArithmeticException ae )
        {
            System.out.println("A number cannot be divided by zero, illegal operation in java");
        }
        catch( NullPointerException e)
        {
            System.out.println("Null Pointer error");
        }
        catch( ArrayIndexOutOfBoundsException arre)
        {
            System.out.println("Accessing array element more than its size");
        }

        System.out.println("I am out of try-catch block");
    }
}