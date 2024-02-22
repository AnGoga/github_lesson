package module2;

public class Test {
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                super.run();
                // do ...
            }
        }.start();



        MyThread thread = new MyThread();
        thread.start();
    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        // do ...
    }
}



