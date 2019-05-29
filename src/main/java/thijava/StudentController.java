package thijava;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
    private ArrayList<Student> list = new ArrayList<Student>();

    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("EnrollID : ");
        String EnrollID = scanner.nextLine();
        System.out.println("FirstName : ");
        String FirstName = scanner.nextLine();
        System.out.println("LastName : ");
        String LastName = scanner.nextLine();
        Student student = new Student(EnrollID, FirstName, LastName);
        list.add(student);
    }

    public void Save() {
        try {
            FileWriter fileWriter = new FileWriter("src/main/java/thijava/student.dat");
            fileWriter.write("EnrollID\t" + "FirstName\t" + "LastName"+"\n");
            for (Student student :
                    list
            ) {
                fileWriter.write(student.getEnrollID() + "       |       " + student.getFirstName() + "      |       " + student.getLastName() + "\n");
            }
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void Display() throws IOException {
        FileReader fileReader = new FileReader("src/main/java/thijava/student.dat");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

    }


}
