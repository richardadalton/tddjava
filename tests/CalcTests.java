import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.devjoy.Calculator;

class FirstJUnit5Tests {

    @Test
    void myFirstTest() {
        Calculator c = new Calculator();
        assertEquals(8, c.add(3, 5));
    }

}