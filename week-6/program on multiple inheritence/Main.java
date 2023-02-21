
interface Father
{
    float HT = 6.2f;
    void height();
}
interface Mother
{
    float HT = 5.5f;
    void height();
}

class child implements Father, Mother
{
    float HT = ( Father.HT + Mother.HT ) / 2 ;
    public void height()
    {
        System.out.println("This child height is " + HT );
    }
}

class Main{
    public static void main(String[] args) {
        child c = new child();
        c.height();
    }
}