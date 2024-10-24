package lesson2;

public class Main1 {
    public static void main(String[] args) {
        // У нас есть число, вывести на консоль это четное число (true) или нечетное (false)
        int number = 60;
        if (number % 2 == 0) {
            System.out.println("Это четное число");
        } else {
            System.out.println("Это нечетное число");
        }
    }
}
