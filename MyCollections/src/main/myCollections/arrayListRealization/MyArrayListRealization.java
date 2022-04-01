package main.myCollections.arrayListRealization;

import java.util.Iterator;


public class MyArrayListRealization<E> implements MyArrayList<E>, Comparable<E> {

    private E[] values;

    public MyArrayListRealization() {
        values = (E[]) new Object[0];
    }

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

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void change(int index, E e) {
        values[index] = e;
    }


    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<E>(values);
    }

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

