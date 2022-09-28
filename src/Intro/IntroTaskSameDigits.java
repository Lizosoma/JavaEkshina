package Intro;

import java.util.Scanner;

public class IntroTaskSameDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number % 10 == number / 10 % 10) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
