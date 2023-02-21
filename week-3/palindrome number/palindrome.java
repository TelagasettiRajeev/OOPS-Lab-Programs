import java.util.Scanner;
public class palindrome
{
    public static void main(String[] args) {

        String a, b="";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string you want to check: ");
        a = sc.nextLine();
        int n = a.length();

        for(int i=n-1; i>=0; i--)
        {
            b = b + a.charAt(i);
        }
        
        if( a.equalsIgnoreCase(b) )
            System.out.println("String is palindrome");
        else   
            System.out.println("String is not palindrome");
    }    
}
