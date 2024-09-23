public class Main {
    public static void main(String[] args) {

        /* Задание 1. */
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        }

        /* Задание 2. */
        for (int k = 10; k >= 1; k = k - 1) {
            System.out.println(k);
        }

        /* Задание 3. */
        for (int d = 0; d <= 17; d = d + 2) {
            System.out.println(d);
        }

        /* Задание 4. */
        for (int p = 10; p <= 10 && p >= -10; p = p - 1) {
            System.out.println(p);
        }

        /* Задание 5. */
        for (int g = 1904; g <= 2096; g = g + 4) {
            System.out.println(g + " год является високосным");
        }

        /* Задание 6. */
        for (int f = 7; f <= 98; f = f + 7) {
            System.out.println(f);
        }

        /* Задание 7. */
        // есть еще один вариант действия s = s * 2
        for (int s = 1; s <= 512; s = s + s) {
            System.out.println(s);
        }

        /* Задание 8. */
        int deposit = 29000;
        int total = 0;
        for (int month = 1; month <= 12; month++) {
            total = total + deposit;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");

        }

        /* Задание 9. */
        int total2 = 0;
        for (int month = 1; month <= 12; month++) {
            total2 = total2 + deposit / 100;
            total2 = total2 + deposit;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total2 + " рублей");

        }

        /* Задание 10. */
        int num = 2;
        for (int s = 1; s <= 10; s++) {
            System.out.println(num + "*" + s + "=" + num * s);
        }
    }
}