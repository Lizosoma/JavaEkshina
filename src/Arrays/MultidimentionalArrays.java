package Arrays;

import java.util.Arrays;


public class MultidimentionalArrays {
    public static void main(String[] args) {
        int[][] array = {{1, 22, 333}, {555, 66, 7}};
        printTable(array);

        int[][] array2 = {{10, 1, 1000000, 44, 4244}, {111, 432, 44}, {5, 27, 1, 33, 123523, 6}};
        printTableAligned(array2);

        char[][] c = createTable(20, '.');
        printTable1(c);

        System.out.println("============ Заполним строки: ==========");
        fillFirstAndLastLines(c, '#');
        printTable1(c);

        System.out.println("============ Заполним столбцы: =========");
        fillFirstAndLastColumns(c, '#');
        printTable1(c);
    }

    private static void printTable(int[][] arraysOfInts) {
        for (int[] ints : arraysOfInts) {
            for (int i : ints) {
                System.out.print(i + " ");
            }
            System.out.print("\n");
        }
    }

    private static void printTableAligned(int[][] arraysOfInts) {
        int maxLengthArray = 0;
        for (int[] i : arraysOfInts) {
            if (i.length > maxLengthArray) {
                maxLengthArray = i.length;
            }
        }
        int[] maxLength = new int[maxLengthArray];
        for (int[] ints : arraysOfInts) {
            for (int i = 0; i < ints.length; i++) {
                String iToString = Integer.toString(ints[i]);
                if (iToString.length() > maxLength[i]) {
                    maxLength[i] = iToString.length();
                }
            }
        }
        for (int[] ints : arraysOfInts) {
            StringBuilder formattedString = new StringBuilder();
            for (int i = 0; i < ints.length; i++) {
                String maxLengthToString = Integer.toString(maxLength[i]);
                formattedString.append(String.format("%" + maxLengthToString + "d  ", ints[i]));
            }
            System.out.println(formattedString);
        }
    }

    public static char[][] createTable(int number, char symbol) {
        char[][] table = new char[number][number];
        for (int row = 0; row < number; row++) {
            for (int column = 0; column < number; column++) {
                table[row][column] = symbol;
            }
        }
        return table;
    }

    public static void printTable1(char[][] table) {
        for (char[] tab : table) {
            String[] arrayToString = new String[tab.length];
            for (int t = 0; t < tab.length; t++) {
                arrayToString[t] = Character.toString(tab[t]);
            }
            System.out.println(String.join(" ", arrayToString));
        }
    }

    public static void fillFirstAndLastLines(char[][] array, char symbol) {
        Arrays.fill(array[0], symbol);
        Arrays.fill(array[array.length - 1], symbol);
    }

    public static void fillFirstAndLastColumns(char[][] array, char symbol) {
        for (char[] row : array) {
            Arrays.fill(row, 0, 1, symbol);
            Arrays.fill(row, array.length - 1, array.length, symbol);
        }
    }
}
