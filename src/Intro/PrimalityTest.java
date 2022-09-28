package Intro;

import java.util.Scanner;

public class PrimalityTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                System.out.println("No");
                System.exit(0);
            }
        }
        System.out.println("Yes");
    }
}