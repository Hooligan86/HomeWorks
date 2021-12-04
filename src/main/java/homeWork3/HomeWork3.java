package homeWork3;

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {

//        task1();
//        task2();
//        task3();
            task4();
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
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 6){
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
}
