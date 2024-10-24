package lesson8;

import java.util.Scanner;

public class ToursBaza {
    private Tour[] tours = new Tour[100000];

    public void addTour(Tour tour) {
        for (int i = 0; i < tours.length; i++) {
            if (tours[i] == null) { // если пусто
                tours[i] = tour; //сохранение тура
                break; // стоп, чтоб копия не пошла по всем ячейкам
            }
        }
    }

    // создать метод, который будет печатать на консоль туры в ... страну
    public void searchByCountry() {
        System.out.println("Введите страну в которую хотите поехать: ");
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine().toLowerCase();
        System.out.println(" ----------------- Туры в: " + country);
        for (Tour t : tours) {
            if (t != null && t.getCountry().equalsIgnoreCase(country)) {
                t.printTour();

            }
        }
        System.out.println("----------------------");

    }

    public void ssearchByBudget() {
        System.out.println("Введите минимальную сумму тура: ");
        Scanner scanner = new Scanner(System.in);
        int budgetOt = scanner.nextInt();
        System.out.println("Введите максимальную сумму тура");
        int budgetDo = scanner.nextInt();
        System.out.println("--------------Туры от: " + budgetOt + " До: " + budgetDo);
        for (Tour t : tours) {
            if (t != null && t.getPrice() >= budgetOt && t.getPrice() <= budgetDo) {
                t.printTour();
            }

        }
        System.out.println("----------------------");

    }

    public void searchByTransport() {
        System.out.println("Введите вид транспорта: ");
        Scanner scanner = new Scanner(System.in);
        String transport = scanner.nextLine().toLowerCase();
        System.out.println("-------------Транспорт тура: " + transport);
        for (Tour t : tours) {
            if (t != null && t.getTransport().equalsIgnoreCase(transport)) {
                t.printTour();
            }

        }
        System.out.println("----------------------");
    }

    public void searchByStars() {
        System.out.println("Введите минимальное кол-во звезд отеля: ");
        Scanner scanner = new Scanner(System.in);
        int stars = scanner.nextInt();
        System.out.println("-----------Отели с количеством звезд от: " + stars);
        for (Tour t : tours) {
            if (t != null && t.getHotel() != null && t.getHotel().getStars() >= stars) {
                t.printTour();
            }
        }
        System.out.println("----------------------");

    }

    public void searchByPriceLessThanSpecified() {
        System.out.println("Введите максимальную цену: ");
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        System.out.println("Список туров ценой до: " + price);
        for (Tour t : tours) {
            if (t != null && t.getPrice() <= price) {
                t.printTour();

            }
        }
    }

    public void searchByTheMostExpensiveTour() {
        Tour maxPriceTour = null;
        for (Tour t : tours) {
            if(t != null) {
                if (maxPriceTour == null || t.getPrice() > maxPriceTour.getPrice()) {
                    maxPriceTour = t;
                    t.printTour();


                }
            }
        }
    }
}











