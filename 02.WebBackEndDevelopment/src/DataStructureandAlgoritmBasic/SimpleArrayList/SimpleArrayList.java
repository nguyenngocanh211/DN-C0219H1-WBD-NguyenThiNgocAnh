package DataStructureandAlgoritmBasic.SimpleArrayList;

import java.util.Arrays;

public class SimpleArrayList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    protected Object elements[];

    public SimpleArrayList() {
    }

    public SimpleArrayList(int DEFAULT_CAPACITY) {
        elements =  new Object[DEFAULT_CAPACITY];
    }

    public void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index, E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public E remove(int index) {
        if (index < 0 && index > elements.length) {
            return null;
        } else {
            E e = (E) elements[index];
            for (int j = index; j < size - 1; j++) {
                elements[j] = elements[j + 1];
            }
            elements[size - 1] = null;
            size--;
            return e;
        }
    }

    public int getSize() {
        return size;
    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++)
            if (e.equals(elements[i])) {
                return true;
            }
        return false;
    }

    public int indexOf(E e) {
        for (int i = 0; i < size; i++)
            if (e.equals(elements[i])) {
                return i;
            }
        return -1;
    }

//    public E get(int i) {
//        if(i < 0 & i > size){
//            return null;
//        } return (E) elements[i];
//    }

//    public void clear() {
//        elements =  new Object [DEFAULT_CAPACITY];
//        size = 0;
//    }
}
