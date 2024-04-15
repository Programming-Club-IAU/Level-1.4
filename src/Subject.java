public class Subject {
    private final String name;
    private final int requiredAttendance;
    private int attendance;

    public Subject(String name, int requiredAttendance) {
        this.name = name;
        this.requiredAttendance = requiredAttendance;
    }

    public void markAttendance(int days) {
        attendance += days;
    }

    public void markAttendance(int days, String excuse) {
        if (excuse != null && excuse.toLowerCase().contains("hospital")) {
            days++; // Increase absence if excuse contains "hospital"
        }
        attendance += days;
    }

    public boolean hasMetAttendanceRequirement() {
        return attendance >= requiredAttendance;
    }

    public int getAttendance() {
        return attendance;
    }

    public String getName() {
        return name;
    }
}