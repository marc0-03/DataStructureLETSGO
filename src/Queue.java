/**
 * This should be a queue
 * Created 2020-02-14
 *
 * @author Magnus Silverdal
 */
public class Queue {
    // Need data structure....
    Node first;
    int size;
    Node End;

    public void enqueue(String text) {
        if (size==0) {
            first=new Node(text, null);
            End = first;
        } else if(size==1){
            first.next=new Node(text, null);
            End = first.next;
        } else {
            End.next=new Node(text, null);
            End = End.next;
        }
        size++;
    }

    public Queue() {
        first=null;
        size=0;
    }

    public String dequeue() {
        String mem = first.data;
        first=first.next;
        size--;
        return mem;
    }

    public boolean isEmpty() {
        return size==0;
    }

    public int size() {
        return size;
    }
}
