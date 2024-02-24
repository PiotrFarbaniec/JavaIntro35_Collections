package collections1_task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class MyListTest {

    @Test
    void shouldReturnArrayWithGivenInitialSize(){
        //given
        int initialSize = 11;
        String expArray = "[null, null, null, null, null, null, null, null, null, null, null]";

        //when
        MyList myList = new MyList(initialSize);
        String actArray = myList.toString();

        //then
        Assertions.assertEquals(expArray, actArray);
    }

    @Test
    void shouldThrowExceptionForWrongInitialSizeValue(){
        //when
        int initialSize = -5;

        //then
        Assertions.assertThrows(IllegalArgumentException.class, ()->new MyList(initialSize));
    }

    // TESTY METODY SIZE
    @Test
    void shouldReturnSizeZeroForEmptyArray() {
        //given
        MyList myList = new MyList();
        int expResult = 0;
        //when
        int actResult = myList.size();

        //then
        Assertions.assertEquals(expResult, actResult);
    }

    @Test
    void shouldReturnSizeFiveForFiveElementsAdded() {
        //given
        MyList myList = new MyList();
        int[] elementsToAdd = {-4, 0, 2, 4, 15};
        myList.add(elementsToAdd[0]);
        myList.add(elementsToAdd[1]);
        myList.add(elementsToAdd[2]);
        myList.add(elementsToAdd[3]);
        myList.add(elementsToAdd[4]);
        int expResult = 5;

        //when
        int actResult = myList.size();

        //then
        Assertions.assertEquals(expResult, actResult);
    }

    @Test
    void shouldReturnSizeElevenForElevenElementsAdded() {
        //given
        MyList myList = new MyList();
        int[] elementsToAdd = {-4, 0, 2, 4, 15, -4, -48, 21, 18, 33, 14};
        myList.add(elementsToAdd[0]);       myList.add(elementsToAdd[6]);
        myList.add(elementsToAdd[1]);       myList.add(elementsToAdd[7]);
        myList.add(elementsToAdd[2]);       myList.add(elementsToAdd[8]);
        myList.add(elementsToAdd[3]);       myList.add(elementsToAdd[9]);
        myList.add(elementsToAdd[4]);       myList.add(elementsToAdd[10]);
        myList.add(elementsToAdd[5]);
        int expResult = 11;

        //when
        int actResult = myList.size();

        //then
        Assertions.assertEquals(expResult, actResult);
    }

    //TESTY METODY IS_EMPTY
    @Test
    void shouldReturnTrueForEmptyArray() {
        //given
        MyList myList = new MyList(0);

        //when
        boolean actResult = myList.isEmpty();

        //then
        Assertions.assertTrue(actResult);
    }

    @Test
    void shouldReturnFalseForNotEmptyArray() {
        //given
        MyList myList = new MyList(0);
        int [] elements = {-5, 1, 14, 26};
        myList.add(0, elements[0]);
        myList.add(1, elements[1]);
        myList.add(2, elements[2]);
        myList.add(3, elements[3]);

        //when
        boolean actResult = myList.isEmpty();

        //then
        Assertions.assertFalse(actResult);
    }

    //TESTY METODY GET
    @Test
    void shouldThrowExceptionForNotCorrectIndex() {
        //given
        int[] elemToAdd = {5, 10, 15, 20, 25};
        MyList myList = new MyList();
        myList.add(0, elemToAdd[0]);
        myList.add(1, elemToAdd[1]);
        myList.add(2, elemToAdd[2]);
        myList.add(3, elemToAdd[3]);
        myList.add(4, elemToAdd[4]);

        //when
        int indexTaken1 = -2;
        int indexTaken2 = 6;

        //then
        Assertions.assertThrows(IllegalArgumentException.class, ()-> myList.get(indexTaken1));
        Assertions.assertThrows(IllegalArgumentException.class, ()-> myList.get(indexTaken2));
    }

    @Test
    void ShouldReturnFifteenForGivenIndexAndGivenArray() {
        //given
        int[] elemToAdd = {5, 10, 15, 20, 25};

        MyList myList = new MyList();
        myList.add(0, elemToAdd[0]);
        myList.add(1, elemToAdd[1]);
        myList.add(2, elemToAdd[2]);
        myList.add(3, elemToAdd[3]);
        myList.add(4, elemToAdd[4]);

        int indexTaken = 2;
        int expResult = 15;

        //when
        int actResult = myList.get(indexTaken);

        //then
        Assertions.assertEquals(expResult, actResult);
    }

    @Test
    void ShouldReturnFiveForGivenIndexAndGivenArray() {
        //given
        int[] elemToAdd = {5, 10, 15, 20, 25};

        MyList myList = new MyList();
        myList.add(0, elemToAdd[0]);
        myList.add(1, elemToAdd[1]);
        myList.add(2, elemToAdd[2]);
        myList.add(3, elemToAdd[3]);
        myList.add(4, elemToAdd[4]);

        int indexTaken = 0;
        int expResult = 5;

        //when
        int actResult = myList.get(indexTaken);

        //then
        Assertions.assertEquals(expResult, actResult);
    }

//TESTY METODY REMOVE
    @Test
    void shouldRemoveAndReturnFiveFromGivenArray() {
        //given
        int[] elemToAdd = {-5, 0, 5, 10, 15, 20, 25};

        MyList myList = new MyList();
        myList.add(0, elemToAdd[0]);
        myList.add(1, elemToAdd[1]);
        myList.add(2, elemToAdd[2]);
        myList.add(3, elemToAdd[3]);
        myList.add(4, elemToAdd[4]);
        myList.add(5, elemToAdd[5]);
        myList.add(6, elemToAdd[6]);

        int indexRemoved = 2;
        int expResult = 5;
        String expArray = "[-5, 0, 10, 15, 20, 25, null, null, null, null]";

        //when
        int actResult = myList.remove(indexRemoved);
        String actArray = myList.toString();
        //then
        Assertions.assertEquals(expResult, actResult);
        Assertions.assertEquals(expArray, actArray);
    }

    @Test
    void shouldRemoveAndReturnFirstElementFromGivenArray() {
        //given
        int[] elemToAdd = {-5, 0, 5, 10, 15, 20, 25};

        MyList myList = new MyList();
        myList.add(0, elemToAdd[0]);
        myList.add(1, elemToAdd[1]);
        myList.add(2, elemToAdd[2]);
        myList.add(3, elemToAdd[3]);
        myList.add(4, elemToAdd[4]);
        myList.add(5, elemToAdd[5]);
        myList.add(6, elemToAdd[6]);

        int indexRemoved = 0;
        int expResult = -5;
        String expArray = "[0, 5, 10, 15, 20, 25, null, null, null, null]";

        //when
        int actResult = myList.remove(indexRemoved);
        String actArray = myList.toString();
        //then
        Assertions.assertEquals(expResult, actResult);
        Assertions.assertEquals(expArray, actArray);
    }

    @Test
    void shouldRemoveAndReturnLastElementFromGivenArray() {
        //given
        int[] elemToAdd = {-5, 0, 5, 10, 15, 20, 25, 30, 35, 40};

        MyList myList = new MyList();
        myList.add(0, elemToAdd[0]);
        myList.add(1, elemToAdd[1]);
        myList.add(2, elemToAdd[2]);
        myList.add(3, elemToAdd[3]);
        myList.add(4, elemToAdd[4]);
        myList.add(5, elemToAdd[5]);
        myList.add(6, elemToAdd[6]);
        myList.add(7, elemToAdd[7]);
        myList.add(8, elemToAdd[8]);
        myList.add(9, elemToAdd[9]);

        int indexRemoved = 9;
        int expResult = 40;
        String expArray = "[-5, 0, 5, 10, 15, 20, 25, 30, 35, null]";

        //when
        int actResult = myList.remove(indexRemoved);
        String actArray = myList.toString();
        //then
        Assertions.assertEquals(expResult, actResult);
        Assertions.assertEquals(expArray, actArray);
    }

    @Test
    void shouldThrowExceptionWhenRemovedIndexNotExist() {
        //given
        int[] elemToAdd = {-5, 0, 5, 10, 15, 20, 25};

        MyList myList = new MyList();
        myList.add(0, elemToAdd[0]);
        myList.add(1, elemToAdd[1]);
        myList.add(2, elemToAdd[2]);
        myList.add(3, elemToAdd[3]);
        myList.add(4, elemToAdd[4]);
        myList.add(5, elemToAdd[5]);
        myList.add(6, elemToAdd[6]);

        //when
        int removedIndex1 = -1;
        int removedIndex2 = 7;

        //then
        Assertions.assertThrows(IndexOutOfBoundsException.class, ()-> myList.remove(removedIndex1));
        Assertions.assertThrows(IndexOutOfBoundsException.class, ()-> myList.remove(removedIndex2));
    }

    @Test
    void shouldAddElementToArrayOnFreePosition() {
        //given
        int element = 100;
        MyList myList = new MyList();
        String expArray = "[100, null, null, null, null, null, null, null, null, null]";

        //when
        myList.add(element);
        String actArray = myList.toString();

        //then
        Assertions.assertEquals(expArray, actArray);
    }

    @Test
    void shouldAddSomeElementsToArrayOnFreePositions() {
        //given
        int[] elementsToAdd = {100, 200, 300, 400};
        MyList myList = new MyList();
        String expArray = "[100, 200, 300, 400, null, null, null, null, null, null]";

        //when
        myList.add(elementsToAdd[0]);
        myList.add(elementsToAdd[1]);
        myList.add(elementsToAdd[2]);
        myList.add(elementsToAdd[3]);
        String actArray = myList.toString();

        //then
        Assertions.assertEquals(expArray, actArray);
    }


    @Test
    void shouldAddGivenElementsOnGivenArrayIndexes() {
        //given
        int[] addedIndexes = {0, 1, 2, 3};
        int[] addedElements = {1000, 500, 250, 100};
        MyList myList = new MyList();
        String expArray = "[1000, 500, 250, 100, null, null, null, null, null, null]";

        //when
        myList.add(addedIndexes[0], addedElements[0]);
        myList.add(addedIndexes[1], addedElements[1]);
        myList.add(addedIndexes[2], addedElements[2]);
        myList.add(addedIndexes[3], addedElements[3]);
        String actResult = myList.toString();

        //then
        Assertions.assertEquals(expArray, actResult);
    }

    @Test
    void shouldAddElementOnGivenIndexAndReindexArray() {
        //given
        MyList myList = new MyList(10);
        myList.add( 100);
        myList.add( 200);
        myList.add( 300);
        myList.add( 400);
        int addedIndex = 1;
        int addedElement = 1000;
        String expArray = "[100, 1000, 200, 300, 400, null, null, null, null, null]";

        //when
        myList.add(addedIndex, addedElement);
        String actArray = myList.toString();

        //then
        Assertions.assertEquals(expArray, actArray);
    }



    @Test
    void shouldExtendsArraySizeWhenNotEnaughtPlaceForElements() {
        //given
        MyList myList = new MyList(10);
        int[] addedIndexes = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] addedElements = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};

        String expArray = "[10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110," +
                          " null, null, null, null, null, null, null, null, null]";

        //when
        myList.add(addedIndexes[0], addedElements[0]);
        myList.add(addedIndexes[1], addedElements[1]);
        myList.add(addedIndexes[2], addedElements[2]);
        myList.add(addedIndexes[3], addedElements[3]);
        myList.add(addedIndexes[4], addedElements[4]);
        myList.add(addedIndexes[5], addedElements[5]);
        myList.add(addedIndexes[6], addedElements[6]);
        myList.add(addedIndexes[7], addedElements[7]);
        myList.add(addedIndexes[8], addedElements[8]);
        myList.add(addedIndexes[9], addedElements[9]);
        myList.add(addedIndexes[10], addedElements[10]);
        String actResult = myList.toString();

        //then
        Assertions.assertEquals(expArray, actResult);
    }

    @Test
    void shouldThrowExceptionWhenAddedIndexNotExists() {
        //given
        MyList myList = new MyList();
        myList.add(0, 50);
        myList.add(1, 100);
        myList.add(2, 150);
        myList.add(3, 200);
        myList.add(4, 250);
        myList.add(5, 300);

        //when
        int addedIndex1 = -1;
        int addedIndex2 = 7;

        //then
        Assertions.assertThrows(IndexOutOfBoundsException.class, ()->myList.add(addedIndex1, 400));
        Assertions.assertThrows(IndexOutOfBoundsException.class, ()->myList.add(addedIndex2, 500));
    }

}