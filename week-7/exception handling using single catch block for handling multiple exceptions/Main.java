class Main
{
    public static void main(String[] args) 
    {
        
        try
        {

            int a = 5/0;
            int b[] = new int[5];
            b[6] = 60;
            String str = null;
            System.out.println( str.length() );

            System.out.println("I am in try block");

        }
        catch( ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e)
        {
            System.out.println("Arithmetic Exception");
            System.out.println("ArrayOutOfBound Exception");
            System.out.println("Null pointer exception");
        }
        
        System.out.println("I am Out of try-catch block");

    }
}