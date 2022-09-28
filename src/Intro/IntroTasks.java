package Intro;

public class IntroTasks {
    public static void main(String[] args) {
        System.out.println(introTask3Digits(456));
        System.out.println(introTaskCat(123));
        System.out.println(introTaskLast5(987));
        System.out.println(introTaskLeap(2014));
        System.out.println(introTaskQuadraticEquation(1, 9, -10));
        System.out.println(introTaskSameDigits(67788899));
        System.out.println(primalityTest(7));
    }

    private static boolean introTask3Digits(int number) {
        return number > 99 && number < 1000;
    }

    private static String introTaskCat(int number) {
        if (number % 10 > 1 && number % 10 < 5 && (number % 100 < 10 || number % 100 > 15))
            return number + " кота";
        else if (number % 10 == 1 && number % 100 != 11)
            return number + " кот";
        else
            return number + " котов";
    }

    private static boolean introTaskLast5(int number) {
        return number % 10 == 5;
    }

    private static boolean introTaskLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    private static String introTaskQuadraticEquation(int a, int b, int c) {
        int disc = (int) Math.pow(b, 2) - 4 * a * c;
        if (a == 0)
            if (b == 0)
                if (c == 0)
                    return "Решений бесконечно много";
                else
                    return "Решений нет";
            else
                return "Одно решение: x = " + (-c / b);
        else if (disc < 0)
            return "Решений нет";
        else if (disc == 0)
            return "Одно решение: x = " + -b / (2 * a);
        else if (disc > 0)
            return "Два решения: x1 = " + Math.min((-b - Math.sqrt(disc)) / (2 * a), (-b + Math.sqrt(disc)) / (2 * a)) + ", x2 = " + Math.max((-b - Math.sqrt(disc)) / (2 * a), (-b + Math.sqrt(disc)) / (2 * a));
        else
            return "Решений нет";
    }

    private static boolean introTaskSameDigits(int number) {
        return number % 10 == number / 10 % 10;
    }

    private static boolean primalityTest(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++)
            if (number % i == 0)
                return false;
        return true;
    }
}
