/* write a java program to create an abstract class named Shape that contains 2 integers and an empty member named printArea(). provide three classes named Rectangle, Triangle, and circle such that each one of the classes extends the class shape. Each of the classes contains only the method printArea() that prints the area of the given shape. */

import java.util.Scanner;
abstract class Shape
{
    int length, breadth;
    float radius;
    Scanner sc = new Scanner(System.in);
    abstract void printArea(); 
}

class Rectangle extends Shape
{
    int length = sc.nextInt();
    int breadth = sc.nextInt();
    void printArea()
    {
        System.out.println("The area of the Rectangle is: "+ ( (length*breadth) / 2 ) );
    }
}

class Triangle extends Shape
{
    int length = sc.nextInt();
    int breadth = sc.nextInt();
    void printArea()
    {
        System.out.println("The area of Triangle is : " + ( 0.5*length*breadth) );
    }
}

class Circle extends Shape
{
    float radius = sc.nextFloat();
    void printArea()
    {
        System.out.println("The area of the circle is: "+ ( 3.14f * radius * radius ) );
    }
}

class program_on_abstract_class 
{
    public static void main(String[] args) 
    {
        Rectangle r = new Rectangle();
        r.printArea();
        Triangle t = new Triangle();
        t.printArea();
        Circle c = new Circle();
        c.printArea();
    }
}

