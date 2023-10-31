
public class Main {
    public static void main(String[] args) {
//        Robot robot = new Robot();
//        Object obj = (Object) robot;
//        Robot objRob = (Robot) obj;

        Human human = new Human();
        Car car = new Car();

        Moveable m1 = human;
        Moveable m2 = car;
        m1.move();
        m2.move();

        Runnable r1 = human;
        Runnable r2 = car;
        r1.run();
        r2.run();
    }

    static void change1(Robot robot, int num) {
        num = 0;
        robot.name = null;
    }

    static void change2(Robot robot) {
        robot = new Robot();
        robot.name = "qwerty";
    }
}