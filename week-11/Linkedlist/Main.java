import java.io.*;
import java.util.*;


class Main {
    public static void main(String[] args) throws IOException
    {
        
        LinkedList<String> ll = new LinkedList<String>();

        ll.add("America");
        ll.add("India");
        ll.add("Japan");
        System.out.println("List = " + ll );

        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

        String element;
        int position, choice = 0;

        while( choice < 4 )
        {
            System.out.println("\nLinkedList Operations: ");
            System.out.println("\n1. Add an element ");
            System.out.println("\n2. Remove an element ");
            System.out.println("\n3. Change an element ");
            System.out.println("\n4. Exit");
            System.out.println("Enter your choice : ");

            choice = Integer.parseInt( br.readLine() );

            switch( choice )
            {
                case 1: 
                    System.out.println("Enter element: ");
                    element = br.readLine();
                    System.out.println("At what position : ");
                    position = Integer.parseInt( br.readLine() );
                    ll.add( position-1 , element );
                    break;
                case 2: 
                    System.out.println("Enter position : ");
                    position = Integer.parseInt( br.readLine() );
                    ll.remove( position-1 );
                    break;
                case 3: 
                    System.out.println("Enter position : ");
                    position = Integer.parseInt( br.readLine() );
                    System.out.println("Enter element: ");
                    element = br.readLine();
                    ll.set( position-1 , element );
                    break;
                default: return;
            }

            System.out.println("List : ");
            
            Iterator it = ll.iterator(); //list iterator
            while( it.hasNext() )
            {
                System.out.println( it.next() + " ");
            }
        }

    }
}
