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


    /*
  Insert Node at the end of a linked list
  head pointer input could be NULL as well for empty list
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/
    Node Insert(Node head, int data) {
        if(head == null){
            head = new Node();
            head.data = data;
        }
        else {
            Node temp = head;

            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new Node();
            temp.next.data = data;
        }
        return head;
    }



    /*
  Insert Node at the beginning of a linked list
  head pointer input could be NULL as well for empty list
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/
// This is a "method-only" submission.
// You only need to complete this method.

    Node Insert(Node head,int x) {

        Node temp = new Node();
        temp.data = x;
        temp.next = head;

        return temp;

    }







}
