import java.util.Random;

class RandomNumberThread extends Thread
{
    public void run()
    {
        Random random = new Random();
        
        for(int i=0; i<10; i++)
        {

            int randomInteger = 

            try{
                Thread.sleep(1000);
            }
            catch( InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}