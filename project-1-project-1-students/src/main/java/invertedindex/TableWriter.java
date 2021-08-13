package invertedindex;

import invertedindex.file.DocumentWriter;
import invertedindex.model.TermDetails;

import java.io.File;
import java.util.Map;
import java.util.Set;

public class TableWriter {

  public static void writeTableToFile(Set<Map.Entry<String, TermDetails>> set) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(String.format("%-22s%-22s\n", "Words","Documents"));
    for (Map.Entry<String, TermDetails> e : set)
      stringBuilder.append(String.format("%-22s%-22s\n", e.getKey(),e.getValue()));
    String userDirectory = System.getProperty("user.dir");

    File f1 = new File(userDirectory + "\\src\\main\\resources\\res");
    if(!f1.exists())
      f1.mkdir();

    DocumentWriter.write(userDirectory + "\\src\\main\\resources\\res", stringBuilder.toString());
  }
}
