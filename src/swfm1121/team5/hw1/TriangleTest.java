package swfm1121.team5.hw1;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


class TriangleTest {

    private final int[][] triangle_test = {{1, 2, 3}, {3, 3, 3}, {3, 2, -1}};
    private Triangle t = new Triangle();

    @Test
    void lineCoverage(){
        Integer[] expected = {0, 1, 0};
        assertTrue(Arrays.equals(expected, t.isEquilateral(triangle_test)));
    }

}

