package lesson8;

public class Tour {
    private String country;
    private int days;
    private String transport;
    private int price;
    private Hotel hotel;

    public Tour() {
    }

    public Tour(String country, int days, String transport, int price, Hotel hotel) {
        this.country = country;
        this.days = days;
        this.transport = transport;
        this.price = price;
        this.hotel = hotel;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
    public void printTour(){
        System.out.print("Тур в " + country);
        System.out.print(", цена: " + price);
        System.out.print(", транспорт: " + transport);
        System.out.print(", кол-во дней: " + days);
        System.out.println(", отель: ");
        hotel.printHotel();



    }
}
