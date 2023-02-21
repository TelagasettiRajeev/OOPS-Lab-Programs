

class GenDemo<T extends Comparable<T> >
{
    T x,y;
    GenDemo(T x, T y)
    {
        this.x = x;
        this.y = y;
    }

    void max()
    {
        if( y.compareTo(x) >0 ) 
            System.out.println("Maximum is " + y );
        else
            System.out.println("Maximum is " + x );
    }
    void min()
    {
        if( y.compareTo(x) < 0 ) 
            System.out.println("Minimum is " + y );
        else
            System.out.println("Minimum is " + x );
    }

    public static void main(String[] args) {
        GenDemo<Integer> g = new GenDemo<Integer>(10, 20);
        g.max();
        g.min();
    }
}
