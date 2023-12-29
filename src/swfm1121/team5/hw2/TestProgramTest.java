package swfm1121.team5.hw2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestProgramTest {
    private TestProgram test = new TestProgram();

    @Test
    void edgeCoverage(){
        assertAll("edge coverage",
                () -> assertEquals(-1, test.countExponent(-1, -1)),
                () -> assertEquals(-1, test.countExponent(3, 2)),
                () -> assertEquals(3, test.countExponent(8, 2)));
    }

    @Test
    void edgePairCoverage(){
        assertEquals(-1, test.countExponent(-1, -1));
        assertEquals(0, test.countExponent(1, 2));
        assertEquals(-1, test.countExponent(3, 2));
        assertEquals(3, test.countExponent(8, 2));
    }

    @Test
    void pathCoverage(){
        assertEquals(-1, test.countExponent(4, 5));
        assertEquals(0, test.countExponent(1, 2));
        assertEquals(-1, test.countExponent(-1, 2));
        assertEquals(-1, test.countExponent(12, 3));
        assertEquals(2, test.countExponent(16, 4));
    }

}

