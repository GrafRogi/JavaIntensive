
import main.java.arrayListRealization.MyArrayListRealization;
import org.junit.jupiter.api.Test;
import test.TestAnimals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class MyArrayListRealizationTest {



    @Test
    void myArrayListLengthIsThreeIfThreeObjectAdd() {

        //
        // Given
        //

        MyArrayListRealization<TestAnimals> animals = new MyArrayListRealization<>();
        TestAnimals rino = new TestAnimals("Rino", 4, "Savannah");
        TestAnimals penguin = new TestAnimals("Penguin", 2, "Antarctica");
        TestAnimals whale = new TestAnimals("Whale", 0, "Ocean");

        //
        // When
        //

        animals.add(rino);
        animals.add(penguin);
        animals.add(whale);

        //
        // Then
        //

        assertEquals(3, animals.size());

    }

    @Test
    void myArrayListGetAddedObjects() {

        //
        // Given
        //

        MyArrayListRealization<TestAnimals> animals = new MyArrayListRealization<>();
        TestAnimals rino = new TestAnimals("Rino", 4, "Savannah");
        TestAnimals penguin = new TestAnimals("Penguin", 2, "Antarctica");
        TestAnimals whale = new TestAnimals("Whale", 0, "Ocean");
        animals.add(rino);
        animals.add(penguin);
        animals.add(whale);

        //
        // When
        //

        animals.get(0);
        animals.get(1);
        animals.get(2);

        //
        // Then
        //

        assertTrue(animals.get(0) == rino);
        assertTrue(animals.get(1) == penguin);
        assertTrue(animals.get(2) == whale);

    }

    @Test
    void myArrayListDeleteObject() {

        //
        // Given
        //

        MyArrayListRealization<TestAnimals> animals = new MyArrayListRealization<>();
        TestAnimals rino = new TestAnimals("Rino", 4, "Savannah");
        TestAnimals penguin = new TestAnimals("Penguin", 2, "Antarctica");
        TestAnimals whale = new TestAnimals("Whale", 0, "Ocean");
        animals.add(rino);
        animals.add(penguin);
        animals.add(whale);

        //
        // When
        //

        animals.delete(0);
        animals.get(0);
        animals.get(1);

        //
        // Then
        //

        assertTrue(animals.size() == 2);
        assertTrue(animals.get(0) == penguin);
        assertTrue(animals.get(1) == whale);

    }

    @Test
    void myArrayLisChangeObject() {

        //
        // Given
        //

        MyArrayListRealization<TestAnimals> animals = new MyArrayListRealization<>();
        TestAnimals rino = new TestAnimals("Rino", 4, "Savannah");
        TestAnimals penguin = new TestAnimals("Penguin", 2, "Antarctica");
        TestAnimals whale = new TestAnimals("Whale", 0, "Ocean");
        TestAnimals bear = new TestAnimals("Bear", 4, "Taiga");
        animals.add(rino);
        animals.add(penguin);
        animals.add(whale);


        //
        // When
        //

        animals.get(0);
        animals.get(1);
        animals.get(2);
        animals.change(1, bear);


        //
        // Then
        //

        assertTrue(animals.size() == 3);
        assertTrue(animals.get(0) == rino);
        assertTrue(animals.get(1) == bear);
        assertTrue(animals.get(2) == whale);

    }

}
