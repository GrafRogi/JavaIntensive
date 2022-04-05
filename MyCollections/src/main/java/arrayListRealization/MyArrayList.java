package main.java.arrayListRealization;

/**
 * This is MyArrayList Interface
 * @param <E>
 */

public interface MyArrayList<E>  extends Iterable<E> {

    boolean add(E e);
    void delete(int index);
    E get(int index);
    int size();
    void change(int index, E e);

}
