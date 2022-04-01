package main.myCollections.arrayListRealization;

public interface MyArrayList<E>  extends Iterable<E> {

    boolean add(E e);
    void delete(int index);
    E get(int index);
    int size();
    void change(int index, E e);

}
