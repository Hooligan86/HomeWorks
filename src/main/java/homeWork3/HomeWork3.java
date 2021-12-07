package homeWork3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HomeWork3 {
    public static void main(String[] args) {

//        change1To0And0To1();
//        fillArray();
//        multiplyByTwoIfLessThenSix();
//        makeDiagonalsWithNumberOne();
//        System.out.println(Arrays.toString(fillArrayByValue(10,9)));
//        findMinAndMax();
//        int[] arr = {2, 2, 2, 1, 2, 2, 10, 1};
//        checkIfSidesOfArrayEqual(arr);
        Integer[] arr2 = { 6, 1, 3, 5};
        shiftArray(arr2,-2);
    }

    public static void change1To0And0To1() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 1 ? 0 : 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void multiplyByTwoIfLessThenSix() {
        int[] arr = {1, 5, 3, 2, 11, 4, 9, 5, 2, 4, 8, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void makeDiagonalsWithNumberOne() {
        int[][] arr = new int[9][9];
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            arr[i][i] = arr[i][j] = 1;
        }

        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
            System.out.println();
        }
    }

    private static int[] fillArrayByValue(int length, int value) {
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

    private static boolean checkIfSidesOfArrayEqual(int[] arr) {
        int leftSum = 0;
        int rightSum;
        for (int i = 0; i < arr.length; i++) {
            rightSum = 0;
            for (int j = i; j < arr.length; j++) {
                rightSum += arr[j];
            }
            if(leftSum == rightSum){
                return true;
            }
            leftSum += arr[i];
        }
        return false;
    }

    private static void shiftArray(Integer[] arr, int shift) {

        Collections.rotate(Arrays.asList(arr),shift % arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
