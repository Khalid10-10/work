package lesson3;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        System.out.println("Выберите фигуру: ");
        System.out.println("1 - Треугольник");
        System.out.println("2 - Овал");
        System.out.println("3 - Квадрат");
        System.out.println("4 - Прямоугольник");
        System.out.println("5 - Круг");

        Scanner scanner = new Scanner(System.in);
        int selectFigura = scanner.nextInt();

        switch (selectFigura) {

            case 1:
                System.out.println("Введите сторону А:");
                int a = scanner.nextInt();
                System.out.println("Введите сторону Б:");
                int b = scanner.nextInt();
                System.out.println("Введите сторону C:");
                int c = scanner.nextInt();
                double semiperimeter = (a + b + c) / 2;
                double areaOfATriangle = Math.sqrt(semiperimeter * (semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c));
                System.out.println("Периметр треугольника: " + (a + b + c) + " Площадь треугольника: " + (areaOfATriangle));
                break;
            case 2:
                System.out.println("Введите малый радиус: ");
                int r1 = scanner.nextInt();
                System.out.println("Введите большой радиус: ");
                int r2 = scanner.nextInt();

                double perimetrOvala = 2 * Math.PI * Math.sqrt(((r1 * r1) + (r2 * r2)) / 2);
                double ploshadOvala = Math.PI * r1 * r2;
                System.out.println("Периметр овала: " + perimetrOvala + " Площадь овала " + ploshadOvala);

                System.out.println();
                break;
            case 3:
                System.out.println("Введите сторону квадрата: ");
                int s = scanner.nextInt();

                System.out.println("Периметр квадрата: " + (s + s + s + s) + " Площадь квадрата " + (s * s ));
                break;
            case 4:
                System.out.println("Найти периметр прямоугольника:");
                System.out.println("Введите сторону 1:");
                int p1 = scanner.nextInt();
                System.out.println("Введите сторону 2:");
                int p2 = scanner.nextInt();

                System.out.println("Периметр прямоугольника: " + ((p1 + p1) + (p2 + p2)) + " Площадь прямоугольника " + (p1  * p2));

                break;
            case 5:
                System.out.println("Введите радиус круга:");
                int radiusKruga = scanner.nextInt();

                double perimetrKruga = (radiusKruga * Math.PI) * 2;
                double plosadKruga = Math.PI * (radiusKruga * radiusKruga);

                System.out.println("Периметр круга: " + perimetrKruga + " Площадь круга: " + plosadKruga);






        }


    }
}
