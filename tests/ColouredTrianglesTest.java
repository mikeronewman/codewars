import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ColouredTrianglesTest {

    @Test
    public void examples() {
        // assertEquals("expected", "actual");
        assertEquals('R', ColouredTriangles.triangle("GB"));
        assertEquals('R', ColouredTriangles.triangle("RRR"));
        assertEquals('B', ColouredTriangles.triangle("RGBG"));
        assertEquals('G', ColouredTriangles.triangle("RBRGBRB"));
        assertEquals('G', ColouredTriangles.triangle("RBRGBRBGGRRRBGBBBGG"));
        assertEquals('B', ColouredTriangles.triangle("B"));
    }

    @Test
    public void test1() {
        assertEquals('R', ColouredTriangles.triangle("GB"));
    }

    @Test
    public void test2() {
        assertEquals('R', ColouredTriangles.triangle("RRR"));
    }

    @Test
    public void test3() {
        assertEquals('B', ColouredTriangles.triangle("RGBG"));
    }

    @Test
    public void test4() {
        assertEquals('G', ColouredTriangles.triangle("RBRGBRB"));
    }

    @Test
    public void test5() {
        assertEquals('G', ColouredTriangles.triangle("RBRGBRBGGRRRBGBBBGG"));
    }

    @Test
    public void test6() {
        assertEquals('B', ColouredTriangles.triangle("B"));
    }

    @Test
    public void test7() {
        assertEquals('G', ColouredTriangles.triangle("G"));
    }

    @Test
    public void test8() {
        assertEquals('B', ColouredTriangles.triangle("B"));
    }

}