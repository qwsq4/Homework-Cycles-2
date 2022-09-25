public class Main {
    public static void main(String[] args) {
        ///ДЗ 1
        ///Задание 1
        System.out.println("  ДЗ 1. Задание 1");
        double total = 0;
        int mounth = 0;
        int depositPerMounth = 15_000;
        while(total <= 2_459_000) {
            mounth = mounth + 1;
            total = total + total / 100;
            total = total + depositPerMounth;
            System.out.println("Месяц " + mounth + ", сумма накоплений равна " + String.format("%.2f", total) + " рублей");
        }

        ///Задание 2
        System.out.println("  ДЗ 1. Задание 2");
        int i = 0;
        while(i < 10){
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for(i = 10; i > 0; i--){
            System.out.print(i + " ");
        }

        ///Задание 3
        System.out.println("  ДЗ 1. Задание 3");
        int year = 0;
        int population = 12_000_000;
        while (year < 10){
            year++;
            population = population + (population/1000 * 17) - (population/1000 * 8);
            System.out.println("Год " + year + ", численность населения составляет " + population + " человек");
        }

        ///ДЗ 2
        ///Задание 1
        System.out.println("  ДЗ 2. Задание 2");
        double total1 = 15_000;
        int mounth1 = 0;
        while (total1 < 12_000_000){
            mounth1++;
            total1 = total1 + total1/100 * 7;
            System.out.println("Месяц " + mounth1 + ", сумма накоплений составляет " + String.format("%.2f", total1) + " рублей");
        }

        ///Задание 2
        System.out.println("  ДЗ 2. Задание 2");
        double total2 = 15_000;
        int mounth2 = 0;
        while (total2 < 12_000_000) {
            mounth2++;
            total2 = total2 + total2 / 100 * 7;
            if (mounth2 % 6 == 0) {
                System.out.println("Месяц " + mounth2 + ", сумма накоплений составляет " + String.format("%.2f", total2) + " рублей");
            }
        }

        ///Задание 3
        System.out.println("  ДЗ 2. Задание 3");
        double total3 = 15_000;
        int mounth3 = 0;
        while (mounth3 <= 108){
            mounth3++;
            total3 = total3 + total3/100*7;
            if (mounth3 % 6 == 0){
                System.out.println("Месяц " + mounth3 + ", сумма накоплений составляет " + String.format("%.2f", total3) + " рублей");
            }
        }

        ///Задание 4
        System.out.println("  ДЗ 2. Задание 4");
        int reportDay = 5;
        while (reportDay <= 31){
            if (reportDay <= 31) {
                System.out.println("Сегодня пятница, " + reportDay + "-е число. Необходимо подготовить отчет.");
            reportDay = reportDay + 7;
            }
        }

        ///ДЗ 3
        ///Задание 1
        System.out.println("  ДЗ 3. Задание 1");
        int year1 = 0;
        while (year1 >= 0){
            year1 = year1 + 79;
            if (year1 >= 1822 && year1 <= 2122){
                System.out.println(year1);
            }
        }

        //Задание 2
        System.out.println("  ДЗ 2. Задание 2");
        for (int y = 1; y <= 10; y++){
            int x = 2 * y;
            System.out.println("2 * " + y + " = " + x);
        }
    }
}