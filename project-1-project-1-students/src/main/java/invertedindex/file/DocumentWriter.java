package invertedindex.file;

import invertedindex.Main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;

public class DocumentWriter {

  private DocumentWriter() {

  }

  public static void write(String path, String text) {
    if(path == null || text == null)
      throw new NullPointerException();
    Main.LOGGER.logp(Level.INFO, "DocumentWriter", "write", "Writing our inverted index to file: res.txt");
    try (FileWriter writer = new FileWriter(new File(path,"res.txt"))) {
      writer.write(text);
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    }
  }
}
