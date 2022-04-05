package main.java.arrayListRealization;

import java.util.Iterator;

/**
 * This is realization Iterator interface
 * It's need to use for-each cycle
 * @param <E>
 */

public class ArrayIterator<E> implements Iterator<E> {

    private int index = 0;
    private E[] values;

    ArrayIterator(E[] values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public E next() {
        return values[index++];
    }
}
