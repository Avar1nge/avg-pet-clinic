package invertedindex.exceptions;

public class FileAlreadyExistInTable
        extends Exception {
  public FileAlreadyExistInTable(String errorMessage) {
    super(errorMessage);
  }
}