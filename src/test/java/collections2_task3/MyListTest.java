package collections2_task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyListTest {

    @Test
    void shouldReturnArrayWithDefaultSizeTen() {
        //given
        String expArray = "[null, null, null, null, null, null, null, null, null, null]";

        //when
        MyList<String> myList = new MyList<>();
        String actArray = myList.toString();

        //then
        Assertions.assertEquals(expArray, actArray);
    }

    @Test
    void shouldReturnArrayWithDefaultSize() {
        //given
        int initialSize = 7;
        String expArray = "[null, null, null, null, null, null, null, null, null, null]";

        //when
        MyList<Integer> myList = new MyList<>(initialSize);
        String actArray = myList.toString();

        //then
        Assertions.assertEquals(expArray, actArray);
    }

    @Test
    void shouldReturnArrayWithGivenInitialSize() {
        //given
        int initialSize = 12;
        String expArray = "[null, null, null, null, null, null, null, null, null, null, null, null]";

        //when
        MyList<Integer> myList = new MyList<>(initialSize);
        String actArray = myList.toString();

        //then
        Assertions.assertEquals(expArray, actArray);
    }

    @Test
    void shouldThrowExceptionForWrongInitialSizeValue() {
        //given
        int initialSize = -3;

        //then
        Assertions.assertThrows(IllegalArgumentException.class, ()-> new MyList<Integer>(initialSize));
    }


    @Test
    void shouldAddElementToEmptyArray() {
        //given
        String addedElement = "elem1";
        MyList<String> myList = new MyList<>();
        String expResult = "[elem1, null, null, null, null, null, null, null, null, null]";

        //when
        myList.add(addedElement);
        String actResult = myList.toString();

        //then
        Assertions.assertEquals(expResult, actResult);
    }

    @Test
    void shouldAddSomeElementsToArray() {
        //given
        char[] elements = {'A', 'B', 'C', 'D', 'E'};
        MyList<Character> myList = new MyList<>();
        String expResult = "[A, B, C, D, E, null, null, null, null, null]";

        //when
        myList.add(elements[0]);
        myList.add(elements[1]);
        myList.add(elements[2]);
        myList.add(elements[3]);
        myList.add(elements[4]);
        String actResult = myList.toString();

        //then
        Assertions.assertEquals(expResult, actResult);
    }

    @Test
    void shouldAddElementsToArrayAndExtendSizeWhenArrayFull() {
        //given
        char[] elements = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K'};
        MyList<Character> myList = new MyList<>(10);
        String expResult = "[A, B, C, D, E, F, G, H, I, J, K, null, null, null, null, null, null, null, null, null]";

        //when
        myList.add(elements[0]);
        myList.add(elements[1]);
        myList.add(elements[2]);
        myList.add(elements[3]);
        myList.add(elements[4]);
        myList.add(elements[5]);
        myList.add(elements[6]);
        myList.add(elements[7]);
        myList.add(elements[8]);
        myList.add(elements[9]);
        myList.add(elements[10]);
        String actResult = myList.toString();

        //then
        Assertions.assertEquals(expResult, actResult);
    }


    @Test
    void shouldReturnSizeZeroForEmptyArray() {
        //given
        MyList<Float> myList = new MyList<>();
        int expResult = 0;

        //when
        int actResult = myList.size();

        //then
        Assertions.assertEquals(expResult, actResult);
    }

    @Test
    void shouldReturnSizeThreeForGivenArray() {
        //given
        double[] elements = {100d, 200d, 300d};
        MyList<Double> myList = new MyList<>();
        int expResult = 3;

        //when
        myList.add(elements[0]);
        myList.add(elements[1]);
        myList.add(elements[2]);
        int actResult = myList.size();

        //then
        Assertions.assertEquals(expResult, actResult);
    }

    //test metody get()
    @Test
    void shouldReturnElementOfArrayIfExists() {
        //given
        char[] elements = {'A', 'B', 'C', 'D', 'E', 'F'};
        MyList<Character> myList = new MyList<>();
        myList.add(elements[0]);
        myList.add(elements[1]);
        myList.add(elements[2]);
        myList.add(elements[3]);
        myList.add(elements[4]);
        myList.add(elements[5]);
        int givenIndex = 2;
        char expResult = 'C';

        //when
        char actResult = myList.get(givenIndex);

        //then
        Assertions.assertEquals(expResult, actResult);
    }

    @Test
    void shouldThrowExceptionIfElementNotExists() {
        //given
        char[] elements = {'A', 'B', 'C', 'D', 'E', 'F'};
        MyList<Character> myList = new MyList<>();
        myList.add(elements[0]);
        myList.add(elements[1]);
        myList.add(elements[2]);
        myList.add(elements[3]);
        myList.add(elements[4]);
        myList.add(elements[5]);

        //when
        int searchedIndex = 7;

        //then
        Assertions.assertThrows(IllegalArgumentException.class, ()-> myList.get(searchedIndex));
    }

    //TEST METODY REMOVE
    @Test
    void shouldRemoveGivenElementIfExistsAndReindexArray() {
        //given
        String[] elements = {"elem1", "elem2", "elem3", "elem4", "elem5"};
        MyList<String> myList = new MyList<>();
        myList.add(elements[0]);
        myList.add(elements[1]);
        myList.add(elements[2]);
        myList.add(elements[3]);
        myList.add(elements[4]);

        //when
        String removedElem = "elem4";
        //then
       Assertions.assertTrue(myList.remove(removedElem));
    }

    @Test
    void shouldReturnFalseIfGivenElementNotExists() {
        //given
        String[] elements = {"elem1", "elem2", "elem3", "elem4", "elem5"};
        MyList<String> myList = new MyList<>();
        myList.add(elements[0]);
        myList.add(elements[1]);
        myList.add(elements[2]);
        myList.add(elements[3]);
        myList.add(elements[4]);

        //when
        String removedElem = "elem7";
        //then
        Assertions.assertFalse(myList.remove(removedElem));
    }

    @Test
    void shouldThrowExceptionIfRemovedElementIsNull() {
        //given
        String[] elements = {"elem1", "elem2", "elem3", "elem4", "elem5"};
        MyList<String> myList = new MyList<>();
        myList.add(elements[0]);
        myList.add(elements[1]);
        myList.add(elements[2]);

        //when
        String removedElem = null;
        //then
        Assertions.assertThrows(IllegalArgumentException.class, ()->myList.remove(removedElem));
    }


}