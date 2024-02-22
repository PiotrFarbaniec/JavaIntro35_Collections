package collections2_task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.util.stream.Stream;


class BubbleSorterTest {
    private static Stream<Arguments> providesNumbersArraysForBubbleSorting() {
        return Stream.of(
                Arguments.of(new Byte[] {63, 112, 1, -2, 5, 103, 14}, new Byte[] {-2, 1, 5, 14, 63, 103, 112}),
                Arguments.of(new Short[] {506, -300, 1120, 788, -4500, 402}, new Short[] {-4500, -300, 402, 506, 788, 1120}),
                Arguments.of(new Integer[] {4, 12, -7, 32, 11, 7, 0, 3}, new Integer[] {-7, 0, 3, 4, 7, 11, 12, 32}),
                Arguments.of(new Long[] {7350l, 5600l, -1200l, 8900l, -1500l, 6200l, 2500l }, new Long[] {-1500l, -1200l, 2500l, 5600l, 6200l, 7350l, 8900l}),
                Arguments.of(new Double[]{3d, 5.1d, 0.1d, -5.1d, 2.6d, -4.9d, 2.3d}, new Double[]{-5.1d, -4.9d, 0.1d, 2.3d, 2.6d, 3d, 5.1d}),
                Arguments.of(new Float[]{3f, 5.1f, 0.1f, -5.1f, 2.6f, -4.9f, 2.3f}, new Float[]{-5.1f, -4.9f, 0.1f, 2.3f, 2.6f, 3f, 5.1f})
        );
    }

    @ParameterizedTest
    @MethodSource("providesNumbersArraysForBubbleSorting")
    void shouldReturnSortedArray(Number[] input, Number[] expResult) {
        //when
        BubbleSorter.sorter(input);
        //then
        Assertions.assertArrayEquals(expResult, input);
    }

    @ParameterizedTest
    @NullAndEmptySource
    void shouldThrowExceptionForEmptyAndNullValue(Number[] input){

        //then
        Assertions.assertThrows(RuntimeException.class, ()-> BubbleSorter.sorter(input));
    }
}