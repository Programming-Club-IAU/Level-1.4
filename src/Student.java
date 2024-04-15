public class Student {
    private final String name;
    private final Subject[] subjects;
    private double grade;

    public Student(String name) {
        this.name = name;
        this.subjects = new Subject[]{
                new Subject("Math", 44),
                new Subject("Physics", 42),
                new Subject("Chemistry", 40),
                new Subject("Programming", 47)
        };
    }

    public String getName() {
        return name;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }
}