package module3.final_test;

public class Change1Example {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        change(b);
        System.out.println(a + " " + b);
    }

    static void change(int a) {
        a = 7;
    }
}
