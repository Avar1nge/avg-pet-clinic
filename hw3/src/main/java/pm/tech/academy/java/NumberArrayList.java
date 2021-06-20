package pm.tech.academy.java;

import java.util.ArrayList;
import java.util.List;

public class NumberArrayList <T extends Number> {
  List list = new ArrayList<>();

  void addValue(T value) {
    list.add(value);
  }

  boolean validate() {
    for (Object o : list) {
      if (o instanceof String) {
        return false;
      }
    }
    return true;
  }

}
