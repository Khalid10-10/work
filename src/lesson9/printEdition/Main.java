package lesson9.printEdition;

public class Main {
    public static void main(String[] args) {
        PrintEdition[] library = new PrintEdition[5];
        library[0] = new Journal("Натали", 2016, 59, "Москва", 8);
        library[1] = new Journal("Натали", 2002, 137, "Москва", 8);
        library[2] = new Journal("Натали", 2005, 84, "Москва", 8);
        library[3] = new Book("Война и мир", 2010, 858, "Москва", "Толстой");
        library[4] = new Book("Мастер и Маргарита", 1967, 800, "Москва", "Булгаков");

        PrintEdition theFat = library[0];
        for(PrintEdition pe:library){
            if(theFat.getPages() < pe.getPages()){
                theFat = pe;
            }

        }
        theFat.printInfo();
    }
}
