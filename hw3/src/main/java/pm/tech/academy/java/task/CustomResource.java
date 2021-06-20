package pm.tech.academy.java.task;

public class CustomResource implements AutoCloseable {
  private boolean isOpen = true;

  @Override
  public void close() throws Exception {
    isOpen = false;
  }

  public boolean getResult() {
    return true;
  }

  public boolean isClosed() {
    return !this.isOpen;
  }
}
