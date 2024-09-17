package AttendanceSystem;
import Command.SchoolManagementApp;

public class AttendanceSystem {

    private String tracktAttendance;

    public AttendanceSystem(String tracktAttendance){
        this.tracktAttendance = tracktAttendance;
    }

    public String markAttendance() {
        return "Mark Attendance";
    }
}
