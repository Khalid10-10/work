package lesson10.blackJack;

public class Main1 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Иван", "Иванов", "Группа 1", 4);
        students[1] = new Aspirant("Петр", "Петров", "Группа 2", 5, "Название научной работы");
        students[2] = new Student("Сидор", "Сидоров", "Группа 1", 4);

        for (Student student : students) {
            System.out.println(student.getScholarship());
        }
    }
}


