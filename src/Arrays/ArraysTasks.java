package Arrays;

import java.util.Arrays;


public class ArraysTasks {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(even(5)));
        System.out.println(allSimilar(new int[]{9, 9, 9}));
        System.out.println(hasSimilar(new int[]{1, 6, 3, 9, 4}));
        System.out.println(mean(new int[]{9, 8, 7, 6, 5}));
        int[] array = {10, 20, 30, 40};
        shift(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(copyShift(array)));
    }

    private static int[] even(int n) {
        int[] arrayOfInts = new int[n];
        for (int i = 1; i <= n; i++) {
            arrayOfInts[i - 1] = i * 2;
        }
        return arrayOfInts;
    }

    private static boolean allSimilar(int[] arrayOfInts) {
        if (arrayOfInts.length == 1) {
            return true;
        }
        for (int i = 1; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i - 1] != arrayOfInts[i]) {
                return false;
            }
        }
        return true;
    }

    private static boolean hasSimilar(int[] arrayOfInts) {
        Arrays.sort(arrayOfInts);
        for (int i = 1; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i - 1] == arrayOfInts[i]) {
                return true;
            }
        }
        return false;
    }

    private static double mean(int[] arrayOfInts) {
        double sum = 0;
        for (int arrayOfInt : arrayOfInts) {
            sum += arrayOfInt;
        }
        return sum / arrayOfInts.length;
    }

    public static void shift(int[] arrayOfInts) {
        if (arrayOfInts.length != 0) {
            int last = arrayOfInts[arrayOfInts.length - 1];
            for (int i = arrayOfInts.length - 2; i >= 0; i--) {
                arrayOfInts[i + 1] = arrayOfInts[i];
            }
            arrayOfInts[0] = last;
        }
    }

    public static int[] copyShift(int[] arrayOfInts) {
        if (arrayOfInts.length != 0){
        int[] arrayOfIntsNew = new int[arrayOfInts.length];
        int last = arrayOfInts[arrayOfInts.length - 1];
        arrayOfIntsNew[0] = last;
        for (int i = arrayOfInts.length - 2; i >= 0; i--) {
            arrayOfIntsNew[i + 1] = arrayOfInts[i];
        }
        return arrayOfIntsNew;
        }
        return new int[0];
    }
}