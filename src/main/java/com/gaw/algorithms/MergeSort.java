package com.gaw.algorithms;

/**
 * @author gaopo
 * @date 2019/2/22.
 */
public class MergeSort {


    public static void mergeSort(int[] source) {
        int[] left = splitArray(source, 0, source.length / 2 - 1);
        int[] right = splitArray(source, source.length / 2, source.length - 1);
        if (source.length < 2) {
            return;
        }
        mergeSort(left);
        mergeSort(right);
        merge(left, right, source);
    }

    private static void merge(int[] left, int[] right, int[] source) {
        int i = 0, j = 0, k = 0;
        while (k < source.length) {
            if (left[i] < right[j]) {
                source[k] = left[i];
                if (i < left.length - 1) {
                    i++;
                } else {
                    left[i] = right[right.length - 1];
                }
            } else {
                source[k] = right[j];
                if (j < right.length - 1) {
                    j++;
                } else {
                    right[i] = left[left.length - 1];
                }
            }
            k++;
        }
    }

    private static int[] splitArray(int[] source, int beginIndex, int endIndex) {
        int[] result = new int[endIndex - beginIndex + 1];
        int j = 0;
        for (int i = beginIndex; i <= endIndex; i++) {
            result[j] = source[i];
            j++;
        }
        return result;
    }

}
