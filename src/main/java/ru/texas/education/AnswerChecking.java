package ru.texas.education;

public class AnswerChecking {
    public void answerCheckTask1(String output1, String output2) {
        PropertyTaker propertyTaker = new PropertyTaker();

        if(output1.equals(propertyTaker.takeProperty("task1", "key1"))){
            System.out.println("В output1 всё верно");
        }else {
            System.out.println("В output1 накосячил");
        }

        if(output2.equals(propertyTaker.takeProperty("task1", "key2"))){
            System.out.println("В output2 всё верно");
        }else {
            System.out.println("В output2 накосячил");
        }
    }

    public void answerCheckTask2(String diff) {
        PropertyTaker propertyTaker = new PropertyTaker();
        if ((diff).equals(propertyTaker.takeProperty("task2", "diff"))){
            System.out.println("Умничка");
        }else {
            System.out.println("Накосячил");
        }
    }

    public void answerCheckTask3(String answer) {
        PropertyTaker propertyTaker = new PropertyTaker();
        if (answer.equals(propertyTaker.takeProperty("task3", "age"))){
            System.out.println("Умничка, я верил в тебя");
        }else {
            System.out.println("*Грустный тромбон* Попробуй ещё раз");
        }
    }

    public String prepareTask4() {
        return "63524";
    }

    public void answerCheckTask4(String answer) {
        PropertyTaker propertyTaker = new PropertyTaker();
        if (answer.equals(propertyTaker.takeProperty("task4", "answer"))){
            System.out.println("Умничка, я верил в тебя");
        }else {
            System.out.println("*Грустный тромбон* Попробуй ещё раз");
        }
    }
}
