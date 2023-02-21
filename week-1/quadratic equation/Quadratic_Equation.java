import java.util.Scanner;


class Quadratic_Equation {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        double a, b, c, d, x1, x2;


        System.out.println("Input a value : ");
        a= sc.nextDouble();
        System.out.println("Input b value : ");
        b = sc.nextDouble();
        System.out.println("Input c value : ");
        c = sc.nextDouble();


        d = Math.pow(b,2) - 4*a*c;


        if(d>0)
        {
            x1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
            x2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
            System.out.println("There are 2 real roots at x1 and x2 : ");
            System.out.println("x1 value is " + x1);
            System.out.println("x2 value is " + x2);
        }
        else if(d==0)
        {
            x1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
            System.out.println("There is only one real root at x :  "+ x1 );
        }
        else{
            System.out.println("There are no real roots");
        }


    }
}
