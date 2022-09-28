package Intro;

import java.util.Scanner;

public class IntroTaskLast5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number % 10 == 5) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
