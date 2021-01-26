import org.junit.Test;
import static org.junit.Assert.assertEquals;


// TODO: Replace examples and use TDD development by writing your own tests

public class SheepCountingTest {
    @Test
    public void testSomething() {
        assertEquals("1 sheep...", SheepCounting.countingSheep(1));
        assertEquals("1 sheep...2 sheep...", SheepCounting.countingSheep(2));
        assertEquals("1 sheep...2 sheep...3 sheep...", SheepCounting.countingSheep(3));
    }
}