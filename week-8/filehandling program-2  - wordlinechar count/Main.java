import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Main
{
    public static void main(String[] args) {
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        BufferedReader reader = null;

        try{
            reader = new BufferedReader(new FileReader( "filename.txt" ));
            String currentLine = reader.readLine();
            
            while( currentLine != null )
            {
                lineCount++;
                String[] words = currentLine.split(" ");

                wordCount = wordCount + words.length;
                
                for(String word : words )
                {
                    charCount = charCount + word.length();
                }
                currentLine = reader.readLine();
            }

            System.out.println("Number of Characters in file : " + charCount);
            System.out.println("Number of Words in file : " + wordCount );
            System.out.println("Number of Lines in file : "+ lineCount);

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        finally{
            try{
                reader.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}