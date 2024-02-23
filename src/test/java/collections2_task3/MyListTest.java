package collections2_task3;

import collections1_task2.MyList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


class MyListTest {
    private static Stream<Arguments> providesArraysForSizeReturnMethod() {
        return Stream.of(
                Arguments.of(new Byte[] {63, 112, 1, -2, 5, 103, 14}, 7),
                Arguments.of(new Short[] {8, 14, 29, 506, -300, 1120, 788, -4500, 402}, 9),
                Arguments.of(new Integer[] {4, 12, -7, 32, 11, 7, 0, 3}, 8),
                Arguments.of(new Long[] {7350l, 5600l}, 2),
                Arguments.of(new Double[]{3d, 5.1d, 0.1d, -5.1d, 2.6d, -4.9d}, 6),
                Arguments.of(new Float[]{ }, 0)
        );
    }


    //TEST METODY SIZE
   /* @ParameterizedTest
    @MethodSource("providesArraysForSizeReturnMethod")
    void shouldReturnActualArraySize(Object[] input, int expectedResult) {
        //given
        MyList<Byte> list = new MyList<>();
        //list = new MyList<>()
        //when
        int actualResult = list.size();

        //then
        Assertions.assertEquals(expectedResult, actualResult);
    }*/

    @Test
    void shouldAddToEmptyList() {
        // given
        int element = 2;
        MyList myList = new MyList();

        // when
        myList.add(element);

        // then
        Assertions.assertEquals(myList.size(), 1);
        Assertions.assertEquals(myList.toString(), "[2, null, null, null, null, null, null, null, null, null]");
    }

    @Test
    void shouldAddToList() {
    }

    @Test
    void shouldAddToListOnFirstPosition() {
    }

    @Test
    void shouldAddToListOnLastPosition() {
    }

    @Test
    void shouldAddToListOnMiddlePosition() {
    }


    @Test
    void get() {
    }

    @Test
    void remove() {
    }

    @Test
    void testToString() {
    }
}