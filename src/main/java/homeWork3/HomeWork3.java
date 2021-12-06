package homeWork3;

import java.util.Arrays;
import java.util.Collections;

public class HomeWork3 {
    public static void main(String[] args) {

//        task1();
//        task2();
//        task3();
//        task4();
//        System.out.println(Arrays.toString(task5(10,9)));
//        findMinAndMax();
        int[] arr = {2, 2, 2, 1, 2, 2, 10, 1};
        task7(arr);
    }

    public static void task1() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 1 ? 0 : 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void task2() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void task3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 9, 5, 2, 4, 8, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void task4() {
        int[][] arr = new int[9][9];
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            arr[i][i] = arr[i][j] = 1;
        }

        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
            System.out.println();
        }
    }

    private static int[] task5(int length, int value) {
        int[] arr = new int[length];
        Arrays.fill(arr, value);
        return arr;
    }

    private static void findMinAndMax() {
        Integer[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int min = Collections.min(Arrays.asList(arr));
        int max = Collections.max(Arrays.asList(arr));
        System.out.printf("Min value in array %s%nMax value in array %s%n", min, max);
    }

    private static void task7(int[] arr) {
    }
}
