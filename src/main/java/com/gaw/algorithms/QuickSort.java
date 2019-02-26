package com.gaw.algorithms;

/**
 * @author gaopo
 * @date 2019/2/20.
 */
public class QuickSort {

    public static void quickSort(int highIndex, int lowIndex, int[] source) {
        int left = highIndex;
        int right = lowIndex;
        //基准数
        int base = source[right];
        //排序
        while (true) {
            if (highIndex <= lowIndex) {
                break;
            }
            if (source[highIndex] >= base) {
                highIndex--;
            }
            if (source[lowIndex] <= base) {
                lowIndex++;
            }
            if (source[highIndex] < source[lowIndex]) {
                int temp = source[highIndex];
                source[highIndex] = source[lowIndex];
                source[lowIndex] = temp;
            }
        }
        //基准数归位
        source[right] = source[lowIndex];
        source[lowIndex] = base;
        //分治处理
        if (lowIndex > right) {
            quickSort(lowIndex - 1, right, source);
        }
        if (highIndex < left) {
            quickSort(left, lowIndex + 1, source);
        }
    }

}
