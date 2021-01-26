import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SumOfDifferencesArrayTest {

    @Test
    public void basicTests() {
        assertEquals(9, SumOfDifferencesArray.sumOfDifferences(new int[]{1, 2, 10}));
        assertEquals(2, SumOfDifferencesArray.sumOfDifferences(new int[]{-3, -2, -1}));
        assertEquals(0, SumOfDifferencesArray.sumOfDifferences(new int[]{1, 1, 1, 1, 1}));
        assertEquals(34, SumOfDifferencesArray.sumOfDifferences(new int[]{-17, 17}));
        assertEquals(0, SumOfDifferencesArray.sumOfDifferences(new int[0]));
        assertEquals(0, SumOfDifferencesArray.sumOfDifferences(new int[]{0}));
        assertEquals(0, SumOfDifferencesArray.sumOfDifferences(new int[]{-1}));
        assertEquals(0, SumOfDifferencesArray.sumOfDifferences(new int[]{1}));
    }
}