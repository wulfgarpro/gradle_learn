import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {
    private App app;

    @Before
    public void before() {
        app = new App();
    }

    @Test
    public void adding_two_numbers_does_sum() {
        assertTrue(3 == app.sum(1,1));
    }
}
