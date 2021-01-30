import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MultiplesThreeFiveTest {
    @Test
    public void test() {
        assertEquals(23, new MultiplesThreeFive().solution(10));
    }

}