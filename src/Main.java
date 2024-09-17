import Command.SchoolManagementApp;
import  GradingSystem.*;
import LibrarySystem.*;
import AttendanceSystem.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean stopper = false;

        do {
            System.out.println("1. Manage Grading System");
            System.out.println("2. Manage Attendance System");
            System.out.println("3. Manage Library System");
            System.out.println("4. Exit");

            System.out.print("Please Choose a Number: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    GradingSystem gradingSystem1 = new GradingSystem();
                    SchoolManagementApp grade1 = new GradingSystemAdapter(gradingSystem1);
                    System.out.println(grade1.integrateSystem());
                    break;
                case 2:
                    AttendanceSystem attendanceSystem1 = new AttendanceSystem();
                    SchoolManagementApp attendance1 = new AttendanceSystemAdapter(attendanceSystem1);
                    System.out.println(attendance1.integrateSystem());
                    break;
                case 3:
                    LibrarySystem librarySystem1 = new LibrarySystem();
                    SchoolManagementApp librarry1 = new LibrarySystemAdapter(librarySystem1);
                    System.out.println(librarry1.integrateSystem());
                    break;
                case 4:
                    stopper = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid number.");
                    break;
            }
        } while (!stopper);
        scan.close();
    }
}