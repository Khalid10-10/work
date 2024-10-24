package lesson9.printEdition;

public class Journal extends PrintEdition{
    private int numberOfYear;

    public Journal() {
    }

    @Override
    public void printInfo() {
        System.out.println("Журнал: " + getNazvanie() + " кол-во страниц: " + getPages());
    }

    public Journal(String nazvanie, int year, int pages, String izdatelstvo, int numberOfYear) {
        super(nazvanie, year, pages, izdatelstvo);
        this.numberOfYear = numberOfYear;
    }

    public int getNumberOfYear() {
        return numberOfYear;
    }

    public void setNumberOfYear(int numberOfYear) {
        this.numberOfYear = numberOfYear;
    }

}
