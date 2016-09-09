import javax.xml.soap.Node;

/**
 * Created by sbabba on 9/9/16.
 */
public class HackerRankSols {

    // Print the integer data for each element of the linked list to stdout/console
    // (e.g.: using printf, cout, etc.). There should be one element per line.

    
    void Print(Node head) {

        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;

        }



    }
}
