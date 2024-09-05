package ru.texas.education;

/**
 * Task2 - программа для вычисления разницы в длине двух строк.
 * <p>
 * Задание:
 * <p>
 * 1. Есть 2 строки:
 *    - "longString", представляет собой объемный текст.
 *    - "shortString", содержит небольшое сообщение.
 * <p>
 * 2. Необходимо вычислить разницу между длиннами этих строк.
 *    Если посчитаешь правильно, то выведится "Умничка".
 *    В противном случае выведится "Накосячил".
 */
public class Task2 {
    public static void main(String[] args) {
        String longString = "Я очень длинная строка, настолько большая, что считать замучаешься, даже не пытайся";
        String shortString = "Я короткая строка";

        // Напиши код здесь
        int diff = longString.length()-shortString.length();

        // Всё что ниже - не трогай!!!
        AnswerChecking answerChecking = new AnswerChecking();
        answerChecking.answerCheckTask2("" + diff);
    }
}
