package thijava;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        StudentController controller = new StudentController();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("-----Menu-----");
            System.out.println("1. Add new student");
            System.out.println("2. Save");
            System.out.println("3. Display all student");
            System.out.println("4. Exit");
            System.out.println("Enter choice : ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    controller.addStudent();
                    break;
                case 2:
                    controller.Save();
                    break;
                case 3:
                    controller.Display();
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
