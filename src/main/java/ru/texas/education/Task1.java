package ru.texas.education;

/**
 * Task1 - программа для изменения регистра строк.
 * <p>
 * Задание:
 * <p>
 * 1. Есть 2 строки:
 *    - "output1", использует строковые переменные "text" и "big".
 *    - "output2", использует строковые переменные "text" и "small".
 * <p>
 * 2. Необходимо необходимо сделать переменную output1 в верхнем регистре,
 *    а переменную output2 в нижнем регистре.
 *    Если сделаешь всё правильно, то выведится "Всё верно".
 *    В противном случае выведится "Накосячил".
 */

public class Task1 {
    public static void main(String[] args) {
        String text = "Сделай меня ";
        String big = "большими";
        String small = "маленькими";

        //Напиши свой код ниже
        String output1 = text + big;
        String output2 = text + small;

        //Дальше ничего не трогай
        AnswerChecking check = new AnswerChecking();
        check.answerCheckTask1(output1, output2);
    }
}