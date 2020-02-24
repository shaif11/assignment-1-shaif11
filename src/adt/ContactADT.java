package adt;

public interface ContactADT<E> {

    void add(E item);

    E remove();

    void search(E item);

    void sort();


}
