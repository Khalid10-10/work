package lesson9.printEdition;

public class Book extends PrintEdition{
    private String avtor;

    public Book() {
    }

    @Override
    public void printInfo() {
        System.out.println("Книга: " + getNazvanie() + " кол-во страниц: " + getPages());
    }

    public Book(String nazvanie, int year, int pages, String izdatelstvo, String avtor) {
        super(nazvanie, year, pages, izdatelstvo);
        this.avtor = avtor;
    }

    public String getAvtor() {
        return avtor;
    }

    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }
}
