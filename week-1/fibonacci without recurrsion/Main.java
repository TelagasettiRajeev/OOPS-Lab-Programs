public class Main {

    int fib(int n)
    {
        if(n<=1)
            return n;
        else
        {
        int previousfib = 1, currentfib = 1;
        for(int i=1; i<n-1; i++)
        {
            int newfib = previousfib + currentfib;
            previousfib = currentfib;
            currentfib = newfib;
        }
        return currentfib;
        }
    }
    
    public static void main(String[] args) 
    {
        Main obj = new Main();
        int n=5;
        System.out.println("Nth fibonacci number is " + obj.fib(n) );
    }

}
