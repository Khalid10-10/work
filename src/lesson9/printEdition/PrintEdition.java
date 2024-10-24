package lesson9.printEdition;

public abstract class PrintEdition {
    private String nazvanie;
    private int year;
    private int pages;
    private String izdatelstvo;

    public PrintEdition() {
    }

    public PrintEdition(String nazvanie, int year, int pages, String izdatelstvo) {
        this.nazvanie = nazvanie;
        this.year = year;
        this.pages = pages;
        this.izdatelstvo = izdatelstvo;
    }

    public String getNazvanie() {
        return nazvanie;
    }

    public void setNazvanie(String nazvanie) {
        this.nazvanie = nazvanie;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getIzdatelstvo() {
        return izdatelstvo;
    }

    public void setIzdatelstvo(String izdatelstvo) {
        this.izdatelstvo = izdatelstvo;
    }
public abstract void printInfo();
}
