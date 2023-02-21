import java.io.*;

class Main
{
    public static void main(String[] args) throws IOException
    {
        int ch;
        FileInputStream fis = new FileInputStream( "file1.txt" );
        FileOutputStream fos = new FileOutputStream( "file2.txt" );

        while( ( ch=fis.read() ) != -1)
        {
            System.out.println( (char) ch );
            fos.write( ch );
        }
        fis.close();
        fos.close();
        System.out.println("File contents is copied ");
    }
}