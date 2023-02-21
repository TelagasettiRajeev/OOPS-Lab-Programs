import java.io.File;
import java.rmi.server.SocketSecurityException;
import java.util.Scanner;

class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner( System.in );
        String filename;

        System.out.println("Enter filename : ");
        filename = sc.nextLine();

        File f1 = new File( filename );
        System.out.println( "Name of the File : " + f1.getName() );
        System.out.println( "Path of the file : " + f1.getAbsolutePath() );
        System.out.println( "Length of the file : " + f1.length() );

        if( f1.exists() )
        {
            System.out.println("File exists");
        }
        else{
            System.out.println("File does not exists");
        }

        if( f1.canRead() )
        {
            System.out.println("File is readable");
        }
        else{
            System.out.println("File is not readable");
        }

        if( f1.canWrite() )
        {
            System.out.println("File is writable");
        }
        else{
            System.out.println("File is not writable");
        }


    }

}