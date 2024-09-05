package ru.texas.education;

/**
 * Task4 - программа для составления строк из цифр.
 * <p>
 * Задание:
 * <p>
 * 1. Есть переменная типа String:
 *    - "input", хранит какую-то цифру.
 * <p>
 * 2. Необходимо перевести эту строку в число и прибавить к существующему значению 10.
 *    Если посчитаешь правильно, то выведится "Умничка, я верил в тебя".
 *    В противном случае выведится "*Грустный тромбон* Попробуй ещё раз".
 */
public class Task4 {
    public static void main(String[] args) {
        AnswerChecking checking = new AnswerChecking();

        String input = checking.prepareTask4();

        // Напиши код тут
        int answer = Integer.parseInt(input)+10;

        // Дальше не лезь
        checking.answerCheckTask4("" + answer);
    }
}
