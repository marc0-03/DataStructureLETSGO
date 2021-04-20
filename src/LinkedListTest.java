import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    @Test
    public void shouldBeAbleToCreateLinkedList() {
        new LinkedList();
    }

    @Test
    public void createdLinkedListShouldBeEmpty() {
        LinkedList l = new LinkedList();
        assertEquals(true, l.isEmpty());
    }

    @Test
    public void createdLinkedListShouldHaveSizeZero() {
        LinkedList l = new LinkedList();
        assertEquals(0, l.size());
    }

    @Test
    public void addLastShouldWork() {
        LinkedList l = new LinkedList();
        l.addLast(new Node("Test",null));
        assertEquals("Test", l.first.getData());
    }

    @Test
    public void addLastShouldWorkProperly() {
        LinkedList l = new LinkedList();
        l.addLast(new Node("Test",null));
        l.addLast(new Node("Another test",null));
        assertEquals("Test", l.first.getData());
    }

    @Test
    public void addLastShouldReallyWorkProperly() {
        LinkedList l = new LinkedList();
        l.addLast(new Node("Test",null));
        l.addLast(new Node("Another test",null));
        assertEquals("Another test", l.first.getNext().getData());
    }

    @Test
    public void addLastShouldIncreaseSize() {
        LinkedList l = new LinkedList();
        l.addLast(new Node("Test",null));
        l.addLast(new Node("Another test",null));
        assertEquals(2,l.size());
    }

    @Test
    public void removeFirstShouldWork() {
        LinkedList l = new LinkedList();
        l.addLast(new Node("Test",null));
        l.removeFirst();
    }

    @Test
    public void removeFirstShouldDecreaseSize() {
        LinkedList l = new LinkedList();
        l.addLast(new Node("Test",null));
        l.addLast(new Node("Another Test",null));
        l.removeFirst();
        assertEquals(1,l.size());
    }

    @Test
    public void removeFirstShouldReturnTheFirstInTheList() {
        LinkedList l = new LinkedList();
        l.addLast(new Node("Test",null));
        l.addLast(new Node("Another Test",null));
        assertEquals("Test",l.removeFirst());
    }

    @Test
    public void Extratesttocheckmorethan2inlist() {
        LinkedList l = new LinkedList();
        l.addLast(new Node("Test",null));
        l.addLast(new Node("Another Test",null));
        l.addLast(new Node("Another Test2",null));
        l.addLast(new Node("Another Test3",null));
        assertEquals("Test",l.removeFirst());
        assertEquals("Another Test",l.removeFirst());
        assertEquals("Another Test2",l.removeFirst());
        assertEquals("Another Test3",l.removeFirst());
    }

}