package pm.tech.academy.java;

import org.junit.Test;

import java.util.Iterator;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LinkedListTest {

    @Test
    public void linkedListMethodsTest() {
        LinkedList<Integer> collection = new LinkedList<>(); // init as LinkedList

        // TODO add values 5, 6, 7, 8
        collection.add(5);
        collection.add(6);
        collection.add(7);
        collection.add(8);
        assertEquals("[5, 6, 7, 8]", collection.toString());

        // TODO add values 1, 2, 3, 4 at the head with addFirst method
        collection.addFirst(4);
        collection.addFirst(3);
        collection.addFirst(2);
        collection.addFirst(1);
        assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]", collection.toString());

        collection.add(5);
        // TODO delete all number 5s with different methods
        collection.remove(Integer.valueOf(5));
        collection.remove(collection.indexOf(5));
        assertEquals("[1, 2, 3, 4, 6, 7, 8]", collection.toString());

        // TODO delete first 4 elements with 4 different methods
        collection.remove(0);
        collection.removeFirst();
        collection.remove();
        collection.remove(collection.getFirst());

        assertEquals("[6, 7, 8]", collection.toString());

        // TODO initialize linkedList with type casting from above mentioned collection
        LinkedList<Integer> linkedList = new LinkedList<>(collection);
        // TODO get backwardIterator from linkedList.
        Iterator<Integer> backwardIterator = linkedList.descendingIterator(); // <--
        // TODO get i as last element from linkedList with special LinkedList method
        int i = collection.getLast();
        while (backwardIterator.hasNext()) {
            assertTrue(backwardIterator.next().equals(i));
            i--;
        }

        // TODO change second element value to 0
        collection.remove(1);
        collection.add(1, 0);
        assertEquals("[6, 0, 8]", collection.toString());

    }
}
