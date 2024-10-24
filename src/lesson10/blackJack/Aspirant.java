package lesson10.blackJack;

public class Aspirant extends Student {
    private String scientificWork;

    public Aspirant(String firtName, String lastName, String group, int averageMark, String scientificWork) {
        super(firtName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    @Override
    public int getScholarship() {
        int averageMark = 0;
        if (averageMark == 5) {
            return 2500;
        } else {
            return 2200;
        }
    }
}


