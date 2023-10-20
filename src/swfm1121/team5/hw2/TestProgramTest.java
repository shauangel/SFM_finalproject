package swfm1121.team5.hw2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestProgramTest {
    @Test
    void testCountExponent(){
        TestProgram test = new TestProgram();
        assertEquals(-1, test.countExponent(-1, -1));
        assertEquals(-1, test.countExponent(3, 2));
        assertEquals(3, test.countExponent(8, 2));
    }

}