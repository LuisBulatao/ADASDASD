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
                    SchoolManagementApp targetGrade = new GradingSystemAdapter(gradingSystem1);
                    System.out.println(targetGrade.integrateSystem());
                    break;
                case 2:
                    System.out.println("Attendance System selected.");
                    AttendanceSystem
                    break;
                case 3:
                    System.out.println("Library System selected.");
                    // Add functionality for managing library system
                    break;
                case 4:
                    stopper = true; // Exit the loop
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