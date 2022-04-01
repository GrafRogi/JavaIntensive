package main.myCollections.arrayListRealization;

import java.util.Iterator;


/**
 * This is my realization of ArrayList.
 */

public class MyArrayListRealization<E> implements MyArrayList<E>, Comparable<E> {

    private E[] values;

    /**
     * This method initializes massive of Object .
     */

    public MyArrayListRealization() {
        values = (E[]) new Object[0];
    }

    /**
     * This method adds new object to the end of myArrayList.
     */

    @Override
    public boolean add(E e) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = e;
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    /**
     * This method deletes object by its index from the myArrayList
     */

    @Override
    public void delete(int index) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            System.arraycopy(temp, index + 1, values, index, temp.length - index - 1);
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * This method returns the object value by its index from the myArrayList
     */

    @Override
    public E get(int index) {
        return values[index];
    }


    /**
     * This method returns the  number of objects in the  myArrayList
     */

    @Override
    public int size() {
        return values.length;
    }

    /**
     * This method changes the object by index to a new object in the  myArrayList
     */

    @Override
    public void change(int index, E e) {
        values[index] = e;
    }

    /**
     * This method is the Iterator interface realization
     * This method needs to use for-each cycle
     */

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<E>(values);
    }

    /**
     * This method is the Comparable interface realization
     * This method compares Object from myArray list.
     * It will return 1, if first object greater;
     * It will return 0, if objects equals;
     * It will return -1, if first object smaller;
     */

    @Override
    public int compareTo(E o) {
        if (this.hashCode() > o.hashCode()) {
            return 1;
        } else if (this.hashCode() < o.hashCode()) {
            return -1;
        } else {
            return 0;
        }
    }
}

