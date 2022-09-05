import java.util.Scanner;

public class IntroTaskCat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number % 10 > 1 && number % 10 < 5 && (number % 100 < 10 || number % 100 > 15)) {
            System.out.println(number + " кота");
        } else if (number % 10 == 1 && number % 100 != 11) {
            System.out.println(number + " кот");
        } else {
            System.out.println(number + " котов");
        }
    }
}
