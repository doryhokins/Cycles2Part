public class Main {
    public static void main(String[] args) {
        //
        System.out.println("Задание №1 (1ДЗ).");
        int bank = 29000;
        int broke = 0;
        int i = 1;
        for (; broke <= 2459000; i++) {
            broke = broke + broke/100;
            broke = broke + bank;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + broke + " рублей.");
        }
        System.out.println("Вывод: для накопления нужной суммы потребуется 5 лет и 2 месяца.");
        //
        System.out.println();
        System.out.println("Задание №2 (1ДЗ).");
        int j = 0;
        while (j <= 9) {
            j++;
            System.out.print(j + " ");
        }
        System.out.println();
        for (int h = 10; h >= 1; h--) {
            System.out.print(h + " ");
        }
        //
        System.out.println();
        System.out.println();
        System.out.println("Задание №3 (1ДЗ).");
        int population = 12000_000;
        int birthrate = 17;
        int deathrate = 8;
        int dif = birthrate - deathrate;
        for (int q = 1; q <= 10; q++) {
            population += population * dif / 1000;
            System.out.println("Год " + q + " , численность населения составляет " + population + " человек.");
            // Хоть бы подсказки какие сделали в математическом плане: что как высчитать, чтобы определить разницу и тд, даже не проходили подобное в предыдущих уроках.
            // По каждому маленькому вопросу не будешь же обращаться, и ждать не знай сколько ответа.
        }
        //
        System.out.println("Задание №1 (2ДЗ).");
        // НИЧЕРТА НЕПОНЯТНО (ВИДЕООБЗОРА НЕ НАШЛОСЬ, ОТВЕТЫ НА СКАЙПРО НЕ ПОМОГАЮТ, ПОДСКАЗОК НЕТ, ЖЕСТЬ ОДНИМ СЛОВОМ)
        int cash = 15000;
        int amountSavings = cash * 7 / 100;
        int month = 0;
        while (cash <= 12000000) {
            cash = cash + amountSavings;
            month++;
            System.out.println("Месяц " + month + ", накопления составляют " + cash + " рублей.");
        }
        // НИЧЕРТА НЕПОНЯТНО (ВИДЕООБЗОРА НЕ НАШЛОСЬ, ОТВЕТЫ НА СКАЙПРО НЕ ПОМОГАЮТ, ПОДСКАЗОК НЕТ, ЖЕСТЬ ОДНИМ СЛОВОМ)
        System.out.println();
        System.out.println("Задание №2 (2ДЗ).");
        int cash1 = 15000;
        int amountSavings1 = cash * 7 / 100;
        int month1 = 0;
        while (cash1 <= 12000000) {
            cash1 = cash1 + amountSavings1;
            month1+= 6;
            if (month1 % 6 == 0);
            System.out.println("Месяц " + month1 + ", накопления составляют " + cash1 + " рублей");
        }
        // НИЧЕРТА НЕПОНЯТНО (ВИДЕООБЗОРА НЕ НАШЛОСЬ, ОТВЕТЫ НА СКАЙПРО НЕ ПОМОГАЮТ, ПОДСКАЗОК НЕТ, ЖЕСТЬ ОДНИМ СЛОВОМ)
        System.out.println("Задание №3 (2ДЗ).");
        int cash2 = 15000;
        int amountSavings2 = cash * 7 / 100;
        int month2 = 0;
        while (cash2 < 120000000) {
            cash2 = cash2 + amountSavings2;
            month2+= 6;
            if (month2 % 6 == 0 && month2 <= 108);
            System.out.println("Месяц " + month2 + ", накопления составляют " + cash2 + " рублей.");
        }
        //
        System.out.println();
        System.out.println("Задание №4 (2ДЗ).");
        int firstFriday = 5;
        for (int currentFriday = firstFriday; currentFriday <= 31; currentFriday +=7) {
            System.out.println(" Сегодня пятница " + currentFriday + " -е число. Необходимо сдать еженедельный отчет");
        }
        System.out.println();
        System.out.println("Задание №1 (3ДЗ).");
        int currentYear = 2022;
        int start = currentYear - 200;
        int end = currentYear + 100;
        for (int year = start; year <= end; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
        System.out.println();
        System.out.println("Задание №2 (3ДЗ).");
        for (int w = 2; w <= 10; w++) {
            System.out.println("2 x " + w + " = " +2*w);
        }
    }
}