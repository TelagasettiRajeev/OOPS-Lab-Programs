import java.util.Random;

class RandomNumberThread extends Thread
{
    public void run()
    {
        Random randobj = new Random();
        
        for(int i=0; i<10; i++)
        {

            int randomInteger = randobj.nextInt(100);
            System.out.println("Random Integer generated : " + randomInteger );

            if( (randomInteger%2) ==0 )
            {
                SquareThread st = new SquareThread( randomInteger );
                st.start();
            }
            else
            {
                CubeThread ct = new CubeThread( randomInteger );
                ct.start();
            }

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

class SquareThread extends Thread
{
    int number;
    SquareThread( int randomno )
    {
        number = randomno;
    }

    synchronized public void run()
    {
        System.out.println("Square of "+ number + " is "+ (number*number) );
    }
}

class CubeThread extends Thread
{
    int number;
    CubeThread( int randomno )
    {
        number = randomno;
    }

    synchronized public void run()
    {
        System.out.println("Cube of "+ number + " is "+ (number*number*number) );
    }
}

class Main
{
    public static void main(String[] args) {
        RandomNumberThread r = new RandomNumberThread();
        r.start();
    }
}