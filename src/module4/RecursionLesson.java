package module4;

import java.util.List;

public class RecursionLesson {
    public static void main(String[] args) {


//        List<Integer> lst = new ArrayList<>();
//        for (int i = 0; i < 10; i++ ) {
//            lst.add(i);
//        }
//
//        print(lst, 0);


        System.out.println(fib(1000));
    }

    static long fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    static void print(List<Integer> lst, int i) {
        if (i >= lst.size()) return;
        print(lst, i + 1);
        System.out.print(lst.get(i) + " ");
    }

    static long factorial(int n) {
        if (n <= 0) return 1;
        long v = factorial(n - 1);
        return n * v;
    }
}

