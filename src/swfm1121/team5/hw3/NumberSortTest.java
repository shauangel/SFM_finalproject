package swfm1121.team5.hw3;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class NumberSortTest {
    @Test
    public void testSortNumbersValidSmallValues() {
        int[] input = {5, 2, 9, 1, 3, 6};
        int[] expected = {1, 2, 3, 5, 6, 9};
        assertArrayEquals(expected, NumberSort.sortNumbers(input));
    }


    @Test
    public void testSortNumbersValidLargeValues() {
        int[] input = {50, 2, 9, 1, 5, 6};
        int[] expected = {1, 2, 5, 6, 9, 50};
        assertArrayEquals(expected, NumberSort.sortNumbers(input));
    }

    @Test
    public void testSortNumbersValidFewValues() {
        int[] input = { 1 };
        int[] expected = { 1 };
        assertArrayEquals(expected, NumberSort.sortNumbers(input));
    }


    @Test
    public void testSortNumbersValidManyValues() {
        int[] input = new int[200];
        for (int i = 0; i < 200; i++) {
            input[i] = 200 - i;
        }

        int[] sorted = NumberSort.sortNumbers(input);
        for (int i = 0; i < 199; i++) {
            assertTrue(sorted[i] <= sorted[i + 1]);
        }
    }


    @ParameterizedTest
    @NullSource
    public void testSortNullArray(int[] source) {
        assertNull(source);
    }


    @ParameterizedTest
    @EmptySource
    public void testSortNumbersEmptyArray(int[] source) {
        int[] expected = {};
        assertArrayEquals(expected, NumberSort.sortNumbers(source));
    }
}
