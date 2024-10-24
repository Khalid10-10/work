package lesson10.blackJack;

public class Student {
    private String firtName;
    private String lastName;
    private String group;
    private int averageMark;

    public Student(String firtName, String lastName, String group, double averageMark) {
        this.firtName = firtName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = (int) averageMark;
    }
    public int getScholarship() {
        if (averageMark == 5) {
            return 2000;
        } else {
            return 1900;
        }

    }

}
