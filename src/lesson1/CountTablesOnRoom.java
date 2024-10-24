package lesson1;

public class CountTablesOnRoom {
    public static void main(String[] args) {
        int shirinaRoom = 251;
        int dlinaRoom = 400;

        int shirinaTable = 40;
        int dlinaTable = 50;

        int ploshadRoom = shirinaRoom * dlinaRoom;
        int ploshadTable = shirinaTable * dlinaTable;

        double countTablesToInsertToRoom = (double) ploshadRoom / ploshadTable;

        System.out.println(countTablesToInsertToRoom);

    }
}
