public class Stack {
    Node first;
    int size;
    Node Last;

    public void push(String text) {
        if (size==0) {
            first=new Node(text, null);
            Last = first;
        } else {
            first = new Node(text, null);
            first.next = Last;
            Last = first;
        }
        size++;
    }

    public Stack() {
        first=null;
        size=0;
    }

    public void pop() {
        if (size!=0)
        first = first.next;
        Last = first;
        size--;
    }

    public String peek() {
        return first.data;
    }

    public boolean isEmpty() {
        return size==0;
    }

    public int size() {
        return size;
    }
}
