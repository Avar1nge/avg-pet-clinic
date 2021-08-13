package invertedindex;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;

public class FilesIndexer {
  private List<File> files = new ArrayList<>();

  public  void filesFromDirectory(final File folder) {
    for (final File fileEntry : Objects.requireNonNull(folder.listFiles())) {
      if (fileEntry.isDirectory()) {
        filesFromDirectory(fileEntry);
      } else {
        files.add(fileEntry);
      }
    }
  }

  public void indexingAllFiles(RankTable r) {
    Main.LOGGER.logp(Level.INFO, "FilesIndexer", "indexingAllFiles", "Indexing all files");
    for (File f : files)
      r.indexingFile(f);
    Main.LOGGER.logp(Level.INFO, "FilesIndexer", "indexingAllFiles", "All files are indexed");
  }
}
