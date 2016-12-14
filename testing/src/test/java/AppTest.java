import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {
    private App app;

    public void before() {
        app = new App();
    }

    public void adding_two_numbers_does_sum() {
        assertTrue(2 == app.sum(1,1));
    }
}
