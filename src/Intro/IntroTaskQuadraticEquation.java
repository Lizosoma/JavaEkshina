package Intro;

import java.util.Scanner;

public class IntroTaskQuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int disc = (int) Math.pow(b, 2) - 4 * a * c;
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Решений бесконечно много");
                } else {
                    System.out.println("Решений нет");
                }
            } else {
                System.out.println("Одно решение: x = " + -c / b);
            }
        } else if (disc < 0) {
            System.out.println("Решений нет");
        } else if (disc == 0) {
            System.out.println("Одно решение: x = " + -b / (2 * a));
        } else if (disc > 0) {
            System.out.println("Два решения: x1 = " + Math.min((-b - Math.sqrt(disc)) / (2 * a), (-b + Math.sqrt(disc)) / (2 * a)) + ", x2 = " + Math.max((-b - Math.sqrt(disc)) / (2 * a), (-b + Math.sqrt(disc)) / (2 * a)));
        }
    }
}
