package day6.Task3;

import java.util.Random;

public class Teacher {
    private String name;
    private String predmet;

    public Teacher(String name, String predmet) {
        this.name = name;
        this.predmet = predmet;
    }

    public String getName() {
        return name;
    }

    public String getPredmet() {
        return predmet;
    }

    public String evaluate(String studentName){
        String res = "";

        Random random = new Random();
        int n  = random.nextInt(1,6);
        res = switch (n) {
            case 1, 2 -> "Неуд";
            case 3 -> "Удовлетворительно";
            case 4 -> "Хорошо";
            case 5 -> "Отлично";
            default -> res;
        };
        return "Преподаватель " + getName() + " оценил студента с именем " + studentName + " по предмету " + getPredmet() + " на оценку " + res + " ("+n+")";
    }
}
