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
        int i = 0;
        while (total < 2_459_000) {
            total = total + moneybox;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        //я поняла задание так, что должна быть выведена 1 сточка с номером месяца, когда накопится требуемая сумма

        System.out.println("\nзадача 2");
        int a = 1;
        while (a <= 10) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();
        for (int b = 10; b >= 1; b--) {
            System.out.print(b + " ");
        }
        //не заметила в условии, что обратная последовательность выводится с использованием цикла for

        System.out.println("\n\nзадача 3");
        int polulationY = 12_000_000;
        int born = 17;
        int die = 8;
        int year = 1;
        while (year <= 10) {
            polulationY = polulationY + polulationY * born / 1000 - polulationY * die / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + polulationY);
            year++;
        }
        // я поняла задание так, что должно быть выведено 10 строк, что и сделано. Вывод в нулевом году убрала

        System.out.println("\nзадача 4");
        int deposit = 15000;
        int j = 0;
        while (deposit < 12_000_000) {
            deposit = deposit + ((deposit / 100) * 7);
            j++;
            System.out.println("Месяц " + j + ", сумма накоплений равна " + deposit + " рублей");
        }
        System.out.println("Итого " + deposit + " рублей");
        // перечитала условия - нужно посчитать накопление только за счет %

        System.out.println("\nзадача 5");
        deposit = 15000;
        j = 0;
        while (deposit < 12_000_000) {
            deposit = deposit + ((deposit / 100) * 7);
            j++;
            if (j % 6 == 0) {
                System.out.println("Месяц " + j + ", сумма накоплений равна " + deposit + " рублей");
            }
        }
        System.out.println("Итого " + deposit + " рублей");
        // перечитала условия - нужно посчитать накопление только за счет %

        System.out.println("\nзадача 6");
        deposit = 15000;
        int montgh = 9 * 12;
        int n = 0;
        while (montgh <= 108 && montgh > 0) {
            deposit = deposit + deposit / 100 * 7;
            montgh--;
            n++;
            if (montgh % 6 == 0) {
                System.out.println("Сумма накоплений за " + n + " месяцев равна " + deposit + " рублей");
            }
        }
        System.out.println("Итого, сумма накоплений за 9 лет " + deposit + " рублей");
        // перечитала условия - нужно посчитать накопление только за счет %
        // выводится сумма за каждый 6й месяц с накопительным итогом
        // скорректировала сообщение для вывода в консоль и добавила итоговую строку

        System.out.println("\nзадача 7");
        int dayNumber = 3;
        while (dayNumber <= 31) {
            System.out.println("Сегодня пятница, " + dayNumber + "-е число. Необходимо подготовить отчет");
            dayNumber = dayNumber + 7;
        }

        System.out.println("\nзадача 8");
        int t = 0;
        int comet = 79;
        int yearT = 2024;
        int t1 = yearT - 200;
        int t2 = yearT + 100;
        while (t < t2) {
            t = t + comet;
            if (t > t1 && t < t2) {
                System.out.println(t);
            }
        }
    }
}