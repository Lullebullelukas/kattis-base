package build;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Assertions;

public class TestReader {
    interface Task {
        void run(InputStream in, PrintStream out) throws Exception;
    }

    public static void assertRun(String input, String expectedOutput, Task task) throws Exception {
        ByteArrayOutputStream b = new ByteArrayOutputStream(100000);
        task.run(TestReader.fromString(input), new PrintStream(b));
        Assertions.assertEquals(expectedOutput.trim(), b.toString().trim());
    }

    public static InputStream fromString(String input) {
        return new ByteArrayInputStream(input.getBytes());
    }
}