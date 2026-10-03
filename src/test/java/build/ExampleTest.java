package build;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExampleTest {
    @Test
    void name() throws Exception {
        TestReader.assertRun("5", "10", Example::run);
    }
}