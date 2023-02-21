class parentClass
{
    void disp()
    {
        System.out.println("This is from parent class display() method");
    }
}
class childClass extends parentClass
{
    void disp()
    {
        System.out.println("This is from child class display() method");
    }
}

class implement_method_overriding 
{
    public static void main(String[] args) {
        parentClass p = new parentClass();
        p.disp();
        p = new childClass();
        p.disp();

    }
}
