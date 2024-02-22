package module4;

import org.jetbrains.annotations.NotNull;

import java.util.*;


class Data implements Comparable {
    private int value;

    public Data(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return value == data.value;
    }

    @Override
    public int compareTo(@NotNull Object o) {
        if (!(o instanceof Data)) return  1;
        Data data = (Data) o;
        return this.value - data.value;
    }
}

public class BinarySearchLesson {
    public static void main(String[] args) {
        List<Data> lst = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            lst.add(new Data((int)(Math.random() * 100)));
        }

        System.out.println(lst);
        lst.sort((o1, o2) -> o1.getValue() - o2.getValue());
        System.out.println(lst);

        binarySearch(lst, new Data(10));

    }

    static void binarySearch (List<Data> lst, Data data) {
        int l = 0, r = lst.size() - 1;

        int index = -1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (data.compareTo(lst.get(mid)) == 0) {
                index = mid;
                break;
            }
            if (data.compareTo(lst.get(mid)) > 0) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        System.out.println(index);
    }

    void find(List<Data> lst) {
        Data data = new Data(9);

        // O(n)
        int index = -1;
        for (int i = 0; i < lst.size(); i++) {
            if (data.equals(lst.get(i))) {
                index = i;
                break;
            }
        }
    }


}








