package ru.texas.education;

/**
 * Task3 - программа для составления строк из цифр.
 * <p>
 * Задание:
 * <p>
 * 1. Есть 4 переменных типа int:
 *    - "two", хранит цифру 2.
 *    - "three", хранит цифру 3.
 *    - "five", хранит цифру 5.
 * <p>
 * 2. Необходимо используя математические операции и
 *    перевод чисел из типа int в String занести в
 *    переменную answer строку со значением "65".
 *    Если посчитаешь правильно, то выведится "Умничка, я верил в тебя".
 *    В противном случае выведится "*Грустный тромбон* Попробуй ещё раз".
 */
public class Task3 {
    public static void main(String[] args) {
        int two = 2;
        int three = 3;
        int five = 5;

        // Напиши свой код ниже
        String answer = (three-two)+two+three+""+five;


        // А вот дальше уже не лезь
        AnswerChecking checking = new AnswerChecking();
        checking.answerCheckTask3(answer);
    }
}
