class GenDemo<T>
{
    T x,y;
    GenDemo(T x, T y)
    {
        this.x = x;
        this.y = y;
    }

    void swap()
    {
        System.out.println("Before swaping : " + x + " " + y );
        T temp = x;
        x = y;
        y = temp;
        System.out.println("After swaping : " + x + " " + y );
    }
    public static void main(String[] args) {
        GenDemo<Integer> g = new GenDemo<Integer>(10, 20);
        g.swap();
        GenDemo<String> g1 = new GenDemo<String>("Java", "Python");
        g1.swap();
    }
}