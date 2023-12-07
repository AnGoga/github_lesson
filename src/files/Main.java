package files;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File fileA = new File("C:\\Users\\Angoga\\IdeaProjects\\samsung_it_school\\src\\files\\a.txt");
        File fileB = new File("C:\\Users\\Angoga\\IdeaProjects\\samsung_it_school\\src\\files\\b.txt");

        FileInputStream input = new FileInputStream(fileA);
        FileOutputStream out = new FileOutputStream(fileB);

        Scanner scanner = new Scanner(input);
        PrintWriter printer = new PrintWriter(out);

        for (int i = 0; i < 100_000; i++) {
            printer.println(i);
        }
        printer.flush();
    }
}
