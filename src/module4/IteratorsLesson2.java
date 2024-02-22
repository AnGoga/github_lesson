package module4;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class MyIterator implements Iterator<Integer> {
    private int a;
    private int b;

    private int i;


    public MyIterator(int a, int b) {
        this.a = a;
        this.b = b;
        i = a;
    }

    @Override
    public boolean hasNext() {
        return i <= b;
    }

    @Override
    public Integer next() {
        int res = i * i;
        i++;
        return res;
    }
}


public class IteratorsLesson2 {
    public static void main(String[] args) {
        int a = 3, b = 999999999;

        // 1
        List<Integer> lst = new ArrayList<>();
        for (int i = a; i <= b; i++) {
            lst.add(i * i);
        }

        lst.listIterator();


        // 2
        Iterator<Integer> it = new MyIterator(a, b);
        while (it.hasNext()) {
            Integer element = it.next();
            System.out.print(element + " ");
        }

    }
}
