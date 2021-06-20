package pm.tech.academy.java.task;

public class CustomException extends RuntimeException {
  public CustomException(CustomExceptionScenario customExceptionScenario) {
    customExceptionScenario.precomplete();
  }
}
