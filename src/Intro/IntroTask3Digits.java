package Intro;

import java.util.Scanner;

public class IntroTask3Digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number > 99 && number < 1000)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
