package pm.tech.academy.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ArrayListTest {

    @Test
    public void arrayListMethodsTest() {
        List<Integer> customList = new ArrayList<>();
        // TODO add values 5, 6, 7, 8
        customList.add(5);
        customList.add(6);
        customList.add(7);
        customList.add(8);
        assertEquals("[5, 6, 7, 8]", customList.toString());

        // TODO add values 1, 2, 3, 4 at the head
        customList.add(0, 4);
        customList.add(0, 3);
        customList.add(0, 2);
        customList.add(0, 1);
        assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]", customList.toString());

        // TODO find first and last index of number 5
        customList.add(5);
        int number5Index = customList.indexOf(5);
        int number5LastIndex = customList.lastIndexOf(5);

        assertEquals(4, number5Index);
        assertEquals(8, number5LastIndex);

        // TODO copy customList to new copy instance in single command
        List<Integer> copy = new ArrayList<>(customList);
        assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 5]", copy.toString());

        // TODO delete all number 5s from customList
        while(customList.contains(5))
            customList.remove(Integer.valueOf(5));
        assertEquals("[1, 2, 3, 4, 6, 7, 8]", customList.toString());
        assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 5]", copy.toString());

        // TODO init fiveElementsList as last 5 elements of customList
        List<Integer> fiveElementsList = new ArrayList<>(customList.subList(customList.size() - 5, customList.size()));
        assertEquals("[3, 4, 6, 7, 8]", fiveElementsList.toString());
    }
}
