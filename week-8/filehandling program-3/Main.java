// write a java program to create a file and write some content into it.

import java.io.*;

class Main
{
    static String filepath = "C:\\Users\\telag\\OneDrive\\Desktop\\java programs\\week-8\\filehandling program-3\\something.txt";
    public static void main(String[] args) throws IOException
    {

        char[] array = new char[100];

        String data = "this is the newly added line in file." + "\nHello World";

        File f = new File( filepath );
        if( f.createNewFile() )
        {
            System.out.println( "File is created : " + f.getName() );
        }
        else{
            System.out.println("File not exists");
        }

        
        FileWriter fw = new FileWriter( filepath );
        fw.write( data );
        System.out.println("Data is written into the file");
        
        FileReader fr = new FileReader( filepath );
        fr.read( array );
        System.out.println("Data in the file ");
        System.out.println( data );

        fr.close();
        fw.close();

    }
}