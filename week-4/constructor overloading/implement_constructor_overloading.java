
class A
{
    int i,j;
    A(int i)
    {
        this.i = i;
    }
    A(int i,int j)
    {
        this.i = i;
        this.j = j;
    }
    void display()
    {
        System.out.println("Value of i: "+ i );
    }
    void display1()
    {
        System.out.println("Value of i and j : "+ i + " "+ j );
    }
}

class implement_constructor_overloading 
{
    A a = new A(1);
    a.display();
    A a1 = new A(1,2);
    a.display1();

}
