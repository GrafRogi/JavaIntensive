package main.Test;

import main.myCollections.arrayListRealization.MyArrayListRealization;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayListRealizationTest {


    MyArrayListRealization<TestAnimals> animals = new MyArrayListRealization<>();
    TestAnimals Rino = new TestAnimals("Rino", 4, "Savannah");

//    @Test
//    public void add() {
//        animals.add(Rino);
//        MyArrayListRealization<TestAnimals> expected = new MyArrayListRealization<>();
//        expected.add(Rino);
//
//        MyArrayListRealization<TestAnimals> actual = new MyArrayListRealization<>();
//        actual.add(Rino);
//
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void delete() {
//    }
//
//    @Test
//    public void get() {
//
//    @Test
//    public void size() {
//    }
//
//    @Test
//    public void change() {
//    }
}