public class Main {
    public static void main(String[] args) {
        System.out.println("Циклы. Часть 2");

        //        System.out.println("\n\nзадача 8");
        //        int jar = 29000;
        //        int total = 0;
        //        for (int i = 0; i < 12; i++) {
        //            total = total + jar;
        //            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        //        }

        System.out.println("\nзадача 1");
        int moneybox = 15000;
        int total = 0;
        int i = 1;
        while (total < 2_459_000) {
            total = total + moneybox;
            i++;
        }
        System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");

        System.out.println("\nзадача 2");
        int a = 1;
        int b = 10;
        while (a <= 10) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();
        while (b >= 1) {
            System.out.print(b + " ");
            b--;
        }

        System.out.println("\n\nзадача 3");
        int polulationY = 12_000_000;
        int born = 17;
        int die = 8;
        int year = 0;
        while (year <= 10) {
            System.out.println("Год " + year + ", численность населения составляет " + polulationY);
            year++;
            polulationY = polulationY + ((polulationY * born) / 1000) + ((polulationY * die) / 1000);
        }

        System.out.println("\nзадача 4");
        int bank = 15000;
        int deposit = 15000;
        int j = 0;
        while (deposit < 12_000_000) {
            deposit = deposit + ((deposit / 100) * 7);
            deposit = deposit + bank;
            j++;
            System.out.println("Месяц " + j + ", сумма накоплений равна " + deposit + " рублей");
        }
        System.out.println("Итого " + deposit + " рублей");

        System.out.println("\nзадача 5");
        int bank2 = 15000;
        int deposit2 = 15000;
        int j2 = 0;
        while (deposit2 < 12_000_000) {
            deposit2 = deposit2 + ((deposit2 / 100) * 7);
            deposit2 = deposit2 + bank2;
            j2++;
            if (j2 % 6 == 0) {
                System.out.println("Месяц " + j2 + ", сумма накоплений равна " + deposit2 + " рублей");
            }
        }
        System.out.println("Итого " + deposit2 + " рублей");

        System.out.println("\nзадача 6");
        int bank3 = 15000;
        int deposit3 = 15000;
        int j3 = 9 * 12;
        int n = 0;
        while (j3 <= 108 && j3 > 0) {
            deposit3 = deposit3 + ((deposit3 / 100) * 7);
            deposit3 = deposit3 + bank3;
            j3--;
            n++;
            if (j3 % 6 == 0) {
                System.out.println("Месяц " + n + ", сумма накоплений равна " + deposit3 + " рублей");
            }
        }

        System.out.println("\nзадача 7");
        int dayNumber = 3;
        while (dayNumber <= 31) {
            System.out.println("Сегодня пятница, " + dayNumber + "-е число. Необходимо подготовить отчет");
            dayNumber = dayNumber + 7;
        }

        System.out.println("\nзадача 8");
        int t = 0;
        int yearT = 2024;
        int t1 = yearT - 200;
        int t2 = yearT + 100;
        int comet = 79;
        while (t < t2) {
            t = t + comet;
            if (t > t1 && t < t2) {
                System.out.println(t);
            }
        }
    }
}