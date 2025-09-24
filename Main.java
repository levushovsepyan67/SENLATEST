import java.util.Scanner;

public class Main {
    private static final String[] WORDS = {
            "программирование", "алгоритм",
            "интерфейс", "база данных", "функция"
    };

    private static final int MAX_LIVES = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String secretWord = WORDS[(int)(Math.random() * WORDS.length)];
        char[] guessedLetters = new char[secretWord.length()];
        int lives = MAX_LIVES;

        for (int i = 0; i < guessedLetters.length; i++) {
            if (secretWord.charAt(i) == ' ') {
                guessedLetters[i] = ' ';
            } else {
                guessedLetters[i] = '_';
            }
        }

        System.out.println("Добро пожаловать в игру 'Виселица'!");
        System.out.println("Угадайте слово. У вас " + lives + " жизней.");

        while (lives > 0) {

            System.out.println("\nСлово: " + String.valueOf(guessedLetters));
            System.out.println("Осталось жизней: " + lives);
            System.out.print("Введите букву: ");

            String input = scanner.nextLine().toLowerCase();

            if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                System.out.println("Пожалуйста, введите одну букву!");
                continue;
            }

            char letter = input.charAt(0);
            boolean found = false;

            // Проверяем, есть ли буква в слове
            for (int i = 0; i < secretWord.length(); i++) {
                if (secretWord.charAt(i) == letter && guessedLetters[i] == '_') {
                    guessedLetters[i] = letter;
                    found = true;
                }
            }

            if (found) {
                System.out.println("Правильно! Буква '" + letter + "' есть в слове.");
            } else {
                lives--;
                System.out.println("Неправильно! Буквы '" + letter + "' нет в слове.");
            }

            // Проверяем, угадано ли слово
            if (isWordGuessed(guessedLetters)) {
                System.out.println("\nПоздравляем! Вы угадали слово: " + secretWord);
                break;
            }
        }

        if (lives == 0) {
            System.out.println("\nИгра окончена! Вы проиграли.");
            System.out.println("Загаданное слово было: " + secretWord);
        }
    }

    private static boolean isWordGuessed(char[] guessedLetters) {
        for (char c : guessedLetters) {
            if (c == '_') {
                return false;
            }
        }
        return true;
    }
}