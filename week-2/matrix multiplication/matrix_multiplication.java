import java.rmi.server.SocketSecurityException;
import java.util.Scanner;

public class matrix_multiplication {
    public static void main(String[] args) {
        

        int m,n,p,q,c,d,k,sum=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of first matrix: ");
        m = sc.nextInt();
        n = sc.nextInt();
        int first[][] = new int[m][n]; 
        
        System.out.println("Enter the size of second matrix: ");
        p = sc.nextInt();
        q = sc.nextInt();
        int second[][] = new int[p][q];


        if(m!=q)
        {
            System.out.println("Matrices can't be multiplied");
        }
        else
        {
            System.out.println("Enter the elements of first matrix ("+m+"X"+n+"): ");
            for(int i=0; i<m; i++)
            {
                for(int j=0; j<n; j++)
                {
                    first[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter the elements of second matrix ("+p+"X"+q+"): ");
            for(int i=0; i<p; i++)
            {
                for(int j=0; j<q; j++)
                {
                    second[i][j] = sc.nextInt();
                }
            }

            int multiply[][] = new int[m][q];

            for(c=0; c<m; c++)
            {
                for(d=0; d<q; d++)
                {
                    for(k=0; k<p; k++)
                    {
                        sum = sum + first[c][k]*second[k][d];
                    }
                    multiply[c][d] = sum;
                    sum = 0;
                }
            }

            System.out.println("product of the matrices: ");
            for(c=0; c<m; c++)
            {
                for(d=0; d<m; d++)
                {
                    System.out.print( multiply[c][d] + "\t");
                }
                System.out.println();
            }
            

        }


        



    }
}
