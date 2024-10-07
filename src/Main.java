public class Main {
    public static void main(String[] args) {
        //Task 1
        int totalSum = 0;
        byte i = 0;
        while (totalSum < 2_459_000) {
            totalSum = (101 * (totalSum + 15000)) / 100;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalSum + " рублей");
        }
        totalSum = (101 * (totalSum + 15000)) / 100;
        i++;
        System.out.println("Месяц " + i + ", сумма накоплений равна " + totalSum + " рублей");

        System.out.println();
        //Task 2
        i = 0;
        while (i < 10) {
            i++;
            System.out.print(i);
            System.out.print(' ');
        }
        System.out.println();
        while (i != 0) {
            System.out.print(i);
            System.out.print(' ');
            i--;
        }

        System.out.println('\n');
        //Task 3
        int population = 12_000_000;
        while (i < 10) {
            i++;
            population += population / 1000 * 9;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }

        System.out.println();
        //Task 4
        totalSum = 15000;
        i = 0;
        while (totalSum < 12_000_000) {
            totalSum += totalSum * 7 / 100;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalSum + " рублей");
        }

        System.out.println();
        //Task 5
        totalSum = 15000;
        i = 0;
        while (totalSum < 12_000_000) {
            totalSum += totalSum * 7 / 100;
            i++;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + totalSum + " рублей");
            }
        }

        System.out.println();
        //Task 6
        totalSum = 15000;
        i = 0;
        while (i < 109) {
            totalSum += totalSum * 7 / 100;
            i++;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + totalSum + " рублей");
            }
        }

        System.out.println();
        //Task 7
        int friday = 3;
        i = 1;
        while (i < 32) {
            if ((i - friday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
            }
            i++;
        }

        System.out.println();
        //Task 8
        int year = 0;
        int currentYear = 2024;
        while (year < currentYear+100) {
            if (year > currentYear-200) {
                System.out.println(year);
            }
            year += 79;
        }

    }
}