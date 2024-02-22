package module4;

import org.jetbrains.annotations.NotNull;

import java.util.*;


public class IteratorsLesson1 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            array.add(i);
        }


        ListIterator<Integer> it = array.listIterator();

        it.next();
        it.remove();

        it.next();
        it.next();
        it.next();

        it.remove();

        System.out.println("Len = " + array.size());

        for (Integer element : array) {
            System.out.print(element + " ");
        }
    }
}



interface MyArray<T> extends Iterable<T> {
    void append(T value);
    void remove(int index);
    T get(int index);
    void set(int index, T value);
    int getSize();
}

class MyArrayImpl<T> implements MyArray<T> {
    private T data[] = getArray(16);
    private int size = 0;

    @Override
    public void append(T value) {
        if (size < data.length) {
            data[size] = value;
            size++;
            return;
        }

        T[] newData = getArray(data.length * 2);
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
        data[size] = value;
        size++;
    }

    @Override
    public void remove(int index) {
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
    }

    @Override
    public T get(int index) {
        return data[index];
    }

    @Override
    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public int getSize() {
        return size;
    }

    private T[] getArray(int len) {
        return (T[]) new Object[len];
    }

    @NotNull
    @Override
    public Iterator iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<T> {
        int index = 0;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new RuntimeException("Нет ячеек дальше");
            }
            T res = data[index];
            index++;
            return res;
        }
    }
}




//class _LinkedList<T> implements MyArray<T> {
//    private int size = 0;
//    private Node<T> start, end;
//
//
//    @Override
//    public void append(T value) {
//
//    }
//
//    @Override
//    public void remove(int index) {
//
//    }
//
//    @Override
//    public T get(int index) {
//        return null;
//    }
//
//    @Override
//    public void set(int index, T value) {
//
//    }
//
//    @Override
//    public int getSize() {
//        return 0;
//    }
//
//    private class Node<T> {
//        public T value;
//        public Node<T> next;
//        public Node<T> prev;
//    }
//}
