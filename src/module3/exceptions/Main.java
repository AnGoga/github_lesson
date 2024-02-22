package module3.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\Angoga\\IdeaProjects\\samsung_it_school\\src\\module3.exceptions\\a.txt");
//        File file = new File("a.txt");

        Integer.parseInt("qqq");

        try {
            Scanner in = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        }

    }

    static void foo() throws FileNotFoundException {
        throw new FileNotFoundException();
    }
}

class MyException extends RuntimeException {
    public MyException(String message, int a) {
        super(message);
    }
}
