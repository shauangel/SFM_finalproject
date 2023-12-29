package swfm1121.team5.demo;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicContainer.dynamicContainer;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

import java.util.Arrays;
import java.util.stream.Stream;


public class AssertionsDemo {

    private DemoExample demo = new DemoExample();


    @Test
    @ExtendWith(RunnerExtension.class)
    @Disabled
    void assertionDemo(){
        assertEquals(0.5, demo.floatDivider(1, 2),
                "the result should be a float number");

        assertTrue(0.5 == demo.floatDivider(1, 2));

        assertNull(demo.displayName(null, "test"));

        assertAll("Calculator",
                () -> assertEquals(1, demo.floatDivider(1, 1)),
                () -> assertEquals(2, demo.floatDivider(4, 2))
        );

        Exception exception = assertThrows(ArithmeticException.class,
                () -> demo.intDivider(1, 0));
        assertEquals("/ by zero", exception.getMessage());

        assertTimeout(ofMillis(10), () -> {
            // Simulate task that takes more than 10 ms.
            Thread.sleep(9);
        });
    }


    @ParameterizedTest
    @ValueSource(strings = {"ALLCAP", "ALL123CAP", "ALL!!!CAP"})
    @Disabled
    void parameterizedTestDemo(String target){
        assertTrue(demo.isAllCap(target));
    }

    @TestFactory
    @Disabled
    Iterable<DynamicTest> dynamicTestsFromIterable() {
        return Arrays.asList(
                dynamicTest("All cap test",
                        () -> assertTrue(demo.isAllCap("ALL!!CAP"))),
                dynamicTest("divider test",
                        () -> assertEquals(4, demo.floatDivider(8,2)))
        );
    }

    @TestFactory
    @Disabled
    Stream<DynamicTest> dynamicTestsFromStream() {
        return Stream.of("ALLCAP", "ALL123CAP", "ALL!@@#CAP", "A L L C A P")
                .map(text -> dynamicTest(text, () -> assertTrue(demo.isAllCap(text))));
    }

    @TestFactory
    @Disabled
    DynamicNode dynamicNodeSingleContainer() {
        return dynamicContainer("palindromes",
                Stream.of("ALLCAP", "ALL123CAP", "ALL!@@#CAP", "A L L C A P")
                        .map(text -> dynamicTest(text, () -> assertTrue(demo.isAllCap(text)))
                        ));
    }

    @RepeatedTest(value = 5, name = RepeatedTest.LONG_DISPLAY_NAME)
    @DisplayName("Test repeat!!")
    void repeatedTestWithRepetitionInfo(RepetitionInfo repetitionInfo) {
        assertEquals(5, repetitionInfo.getTotalRepetitions());
    }
}

