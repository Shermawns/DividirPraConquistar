package org.example;

import java.util.Arrays;

public class RecursiveSum {

    private static int soma(int[] array) {
        if (array.length == 0) {
            return 0;
        } else {
            return array[0] + soma(Arrays.copyOfRange(array, 1, array.length));
        }
    }

    private static int count(int[] array) {
        if (array.length == 0) {
            return 0;
        } else {
            return 1 + count(Arrays.copyOfRange(array, 1, array.length));
        }
    }

    private static int maior(int[] array){
        if (array.length == 2) {
            return Math.max(array[0], array[1]);
        }
        int subMaior = maior(Arrays.copyOfRange(array, 1, array.length));
        return Math.max(array[0], subMaior);
    }
    public static void main(String[] args) {
        System.out.println(soma(new int[]{12,32,45,21}));
        System.out.println(count(new int[]{12,32,45,21}));
        System.out.println(maior(new int[]{12,32,45,21}));
    }
}