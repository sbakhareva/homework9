import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Task #1
        int[] waste = {276, 3954, 7641, 12876, 9731};
        int wasteSum = 0;
        for (int weeklyWaste : waste) {
            wasteSum += weeklyWaste;
        }
        System.out.println("Сумма трат за месяц составляет " + wasteSum + " рублей.");

        // Task #2
        int[] daysOfWeek = {1341, 764, 1207, 546, 2017};
        int dailyWaste = 0;
        for (int theBiggestWaste : daysOfWeek) {
            if (theBiggestWaste > dailyWaste) {
                dailyWaste = theBiggestWaste;
            }
        }
        System.out.println("Максимальная сумма трат за неделю составляет " + dailyWaste + " рублей.");

        int minWaste = Arrays.stream(daysOfWeek).min().getAsInt();
        System.out.println("Минимальная сумма трат за неделю составляет " + minWaste + " рублей.");
        /*
        int minWaste = daysOfWeek [0];
        for (int a = 1; a < daysOfWeek.length - 1; a++) {
        if (daysOfWeek[a] < minWaste) {
        minWaste = daysOfWeek[a];
            System.out.println("Минимальная сумма трат за неделю составляет " + minWaste + " рублей.");
        }
        }
         */

        // Task #3
        wasteSum = 0;
        for (int weeklyWaste : waste) {
            wasteSum += weeklyWaste;
        }
        float averageWaste = (float) wasteSum / waste.length;
        System.out.println("Средняя сумма трат за неделю в течении месяца составляет " + averageWaste + " рублей.");

        // Task #4
        char [] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int fullName = reverseFullName.length - 1; fullName >= 0; fullName--) {
            System.out.print(reverseFullName[fullName]);
        }
    }
}