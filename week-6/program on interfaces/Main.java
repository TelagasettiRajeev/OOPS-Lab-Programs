interface A 
{
    void meth1();
    void meth2();
}

class myClass implements A
{
    public void meth1()
    {
        System.out.println("This is method 1 of interface A");
    }
    public void meth2()
    {
        System.out.println("This is method 2 of interface B");
    }
}

class Main extends myClass
{
    public static void main(String[] args) 
    {
        
        myClass obj = new myClass();
        obj.meth1();
        obj.meth2();

    }
}