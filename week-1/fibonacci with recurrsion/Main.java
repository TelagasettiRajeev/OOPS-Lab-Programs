import java.util.Scanner;

public class Main
{

    int fib(int n)
    {
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
            return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args)
    {
        Main obj = new Main();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a limit: ");
        int x = sc.nextInt();
        
        for(int i=0; i<=x; i++)
            System.out.println( obj.fib(i) );

    }
}
