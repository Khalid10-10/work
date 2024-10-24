package lesson2;

public class Main2 {
    public static void main(String[] args) {
        //Вывести стороны треуголника
        int a = 7;
        int b = 7;
        int c = 10;

        if (a != b && b != c && c != a) {
            System.out.println("Это разносторонний треугольник");
        } else if (a == b && b == c && c == a) {
            System.out.println("Это равносторонний треугольник");
        } else {
            System.out.println("Это равнобедренный треугольник");
        }
    }
}
