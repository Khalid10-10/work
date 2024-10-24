package lesson8;

public class Main {
    public static void main(String[] args) {
        Hotel hotelItaly1 = new Hotel("Венеция отель", 4, "завтраки");
        Hotel hotelItaly2 = new Hotel("Рим отель", 3, "пансион");
        Hotel hotelItaly3 = new Hotel("Неаполь отель", 5, "завтраки");
        Hotel hotelFrance1 = new Hotel("Париж отель", 5, "пансион");
        Hotel hotelFrance2 = new Hotel("Лион отель", 4, "завтраки");
        Hotel hotelFrance3 = new Hotel("Марсель отель", 3, "полупансион");
        Hotel hotelOAE1 = new Hotel("Дубай отель", 5, "завтраки");
        Hotel hotelOAE2 = new Hotel("Абу Даби отель", 5, "пансион");
        Hotel hotelOAE3 = new Hotel("Аджман отель", 4, "завтраки");
        Hotel hotelFinlyandia = new Hotel("Хельсинки отель", 4, "завтраки");

        Tour france1 = new Tour("Франция", 6, "самолёт", 150000, hotelFrance1);
        Tour france2 = new Tour("Франция", 7, "самолёт", 120000, hotelFrance2);
        Tour france3 = new Tour("Франция", 10, "автобус", 100000, hotelFrance3);
        Tour italy1 = new Tour("Италия", 10, "самолёт", 180000, hotelItaly1);
        Tour italy2 = new Tour("Италия", 14, "автобус", 130000, hotelItaly2);
        Tour italy3 = new Tour("Италия", 7, "автобус", 190000, hotelItaly3);
        Tour oae1 = new Tour("ОАЭ", 10, "Самолёт", 250000, hotelOAE1);
        Tour oae2 = new Tour("ОАЭ", 5, "Самолёт", 200000, hotelOAE2);
        Tour oae3 = new Tour("ОАЭ", 7, "Самолёт", 180000, hotelOAE3);
        Tour finlyandia = new Tour("Финляндия", 7, "Самолёт", 90000, hotelFinlyandia);

        ToursBaza baza = new ToursBaza();
        baza.addTour(oae1);
        baza.addTour(finlyandia);
        baza.addTour(oae1);
        baza.addTour(italy2);
        baza.addTour(france1);

        baza.addTour(italy3);
        baza.addTour(oae2);
        baza.addTour(france2);
        baza.addTour(italy1);
        baza.addTour(france3);


        baza.searchByTheMostExpensiveTour();



    }
}


