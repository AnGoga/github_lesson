package module3.final_test;

public class Change2Example {
    public static void main(String[] args) {
        Data data = new Data(5);
        change(data);
        System.out.println(data.value);
    }

    static void change(Data data) {
        data.value = 10;
        data = new Data(20);
    }
}

class Data {
    static int a;
    int value;
    Data(int value) {
        this.value = value;
    }
}
