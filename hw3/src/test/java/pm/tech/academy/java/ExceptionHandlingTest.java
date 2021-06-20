package pm.tech.academy.java;

import org.junit.Test;
import pm.tech.academy.java.task.CustomException;
import pm.tech.academy.java.task.CustomExceptionScenario;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ExceptionHandlingTest {
    // see CustomExceptionScenario todos

    @Test(expected = CustomException.class)
    public void riskyTaskTest() {
        CustomExceptionScenario customExceptionScenario = new CustomExceptionScenario();
        customExceptionScenario.riskyTask();
    }

    @Test
    public void safeTaskTest() {
        CustomExceptionScenario customExceptionScenario = new CustomExceptionScenario();
        assertFalse(customExceptionScenario.safeTask());
        assertTrue(customExceptionScenario.safeTask());
    }

    @Test
    public void taskWithResourcesTest() {
        CustomExceptionScenario customExceptionScenario = new CustomExceptionScenario();
        assertTrue(customExceptionScenario.taskWithResource());
    }
}
