package csku.data;

/**
 * Created by 708 on 8/10/2018.
 */
public interface Collection {
    void add(Object element);
    void remove(Object element);
    boolean contains(Object element);
    boolean isEmpty();
    int size();

}