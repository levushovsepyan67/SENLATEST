import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        int choice;
        double amount;
        double USD, EUR, GBP, RUB, CNY;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Доступные валюты:");
        System.out.println("Нажмите 1: Доллар США");
        System.out.println("Нажмите 2: Евро");
        System.out.println("Нажмите 3: Фунт стерлингов");
        System.out.println("Нажмите 4: Российский рубль");
        System.out.println("Нажмите 5: Китайский юань");

        System.out.print("\nВыберите вашу валюту: ");
        choice = scanner.nextInt();
        System.out.println("Выбранный вариант: " + choice);

        System.out.print("Введите сумму для конвертации: ");
        amount = scanner.nextDouble();
        System.out.println("Введенная сумма: " + amount);

        switch (choice) {
            case 1:
                EUR = amount * 0.92;
                System.out.println(amount + " Долларов = " + EUR + " Евро");
                GBP = amount * 0.79;
                System.out.println(amount + " Долларов = " + GBP + " Фунтов");
                RUB = amount * 91.5;
                System.out.println(amount + " Долларов = " + RUB + " Рублей");
                CNY = amount * 7.28;
                System.out.println(amount + " Долларов = " + CNY + " Юаней");
                break;

            case 2:
                USD = amount * 1.09;
                System.out.println(amount + " Евро = " + USD + " Долларов");
                GBP = amount * 0.86;
                System.out.println(amount + " Евро = " + GBP + " Фунтов");
                RUB = amount * 99.3;
                System.out.println(amount + " Евро = " + RUB + " Рублей");
                CNY = amount * 7.91;
                System.out.println(amount + " Евро = " + CNY + " Юаней");
                break;

            case 3:
                USD = amount * 1.27;
                System.out.println(amount + " Фунтов = " + USD + " Долларов");
                EUR = amount * 1.16;
                System.out.println(amount + " Фунтов = " + EUR + " Евро");
                RUB = amount * 116.2;
                System.out.println(amount + " Фунтов = " + RUB + " Рублей");
                CNY = amount * 9.18;
                System.out.println(amount + " Фунтов = " + CNY + " Юаней");
                break;

            case 4:
                USD = amount * 0.011;
                System.out.println(amount + " Рублей = " + USD + " Долларов");
                EUR = amount * 0.0101;
                System.out.println(amount + " Рублей = " + EUR + " Евро");
                GBP = amount * 0.0086;
                System.out.println(amount + " Рублей = " + GBP + " Фунтов");
                CNY = amount * 0.080;
                System.out.println(amount + " Рублей = " + CNY + " Юаней");
                break;

            case 5:
                USD = amount * 0.14;
                System.out.println(amount + " Юаней = " + USD + " Долларов");
                EUR = amount * 0.13;
                System.out.println(amount + " Юаней = " + EUR + " Евро");
                GBP = amount * 0.11;
                System.out.println(amount + " Юаней = " + GBP + " Фунтов");
                RUB = amount * 12.5;
                System.out.println(amount + " Юаней = " + RUB + " Рублей");
                break;

            default:
                System.out.println("Неверный выбор. Пожалуйста, выберите от 1 до 5.");
                break;
        }
    }
}