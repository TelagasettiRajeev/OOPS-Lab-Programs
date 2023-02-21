

class implement_method_overloading {
    void add(int i,int j)
    {
        System.out.println("This is addition of integers "+ i + " and " + j);
    }
    void add(double i,double j)
    {
        System.out.println("This is addition of doubles "+ i + " and " + j);
    }
    void add(String i,String j)
    {
        System.out.println("This is addition of strings "+ i + " and " + j);
    }
    public static void main(String[] args) {
        implement_method_overloading obj = new implement_method_overloading();
        obj.add( 10, 20);
        obj.add(11.1,12.2);
        obj.add("john","abraham");
    }

}
