package com.gaw.algorithms.sort.compare;

/**
 * @author gaopo
 * @date 2019/2/22.
 */
public class InsertSort {

    public static void insertSort(int[] source) {
        for (int i = 1; i < source.length; i++) {
            for (int j = 0; j < i; ) {
                if (source[j] <= source[i]) {
                    j++;
                } else {
                    int temp = source[j];
                    source[j] = source[i];
                    source[i] = temp;
                }
            }
        }
    }

}
