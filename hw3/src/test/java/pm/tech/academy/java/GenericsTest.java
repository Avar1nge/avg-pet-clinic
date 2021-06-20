package pm.tech.academy.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GenericsTest {

  NumberArrayList listClass = new NumberArrayList();

  // TODO Make class NumberArrayList applicable for Number child classes only and comment odd 'addValue' call from test then.
  @Test
  public void shouldAddNumbersToList() {
    listClass.addValue(1L);
    listClass.addValue(1D);
    //listClass.addValue("1.0");
    listClass.addValue(1);

    assertTrue(listClass.validate());
    assertEquals(3, listClass.list.size());
  }


}
