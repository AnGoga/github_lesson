
public class Wizard extends Unit implements Moveable {
}

class Car implements Runnable {

    @Override
    public void move() {

    }

    @Override
    public void run() {

    }
}

class Human extends SuperUnit {

    @Override
    void f() {

    }

    @Override
    public void move() {

    }

    @Override
    public void run() {

    }
}

abstract class SuperUnit extends Unit {
    abstract void f();
}

abstract class Unit implements Runnable {
    String name;
}

interface Moveable {
    void move();
}
interface Runnable extends Moveable {
    void run();
}





