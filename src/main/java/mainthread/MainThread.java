package mainthread;

import controller.StudentController;

import java.io.IOException;
import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) throws IOException {
        StudentController controller = new StudentController();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("----------Menu---------");
            System.out.println("1. Add student.");
            System.out.println("2. Write file.");
            System.out.println("3. Read File.");
            System.out.println("4. Bye.");
            System.out.println("Enter choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    controller.addStudent();
                    break;
//                case 2:
//                    controller.writeFile();
//                    break;
                case 3:
                    controller.readFile();
                    break;
                case 4:
                    System.out.println("Bye.");
                    break;
                default:
                    System.out.println("Choose number in {1,4}.");
                    break;
            }
            if (choice == 4) {
                break;
            }
        }

    }
}
