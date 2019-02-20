package com.gaw.demo.sort;

import java.util.Arrays;

/**
 * @author gaopo
 * @date 2019/2/20.
 */
public class QuickSort {

    private static void quickSort(int highIndex, int lowIndex, int[] source) {
        //int response = transfer(highIndex, lowIndex, lowIndex, source);
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

    public static void main(String[] args) {
        //int[] source = {212, 341, 5646, 7, 45, 75, 89, 4, 57, 42, 67, 456, 9, 231, 42, 74, 326, 2134, 26761, 23797, 23434, 234, 3545, 24, 75, 9, 32465, 9965, 2367, 3621, 3, 678};
        int[] source = {212, 341, 5646, 7, 45, 75, 89, 4, 57, 42, 67};
        System.out.println(Arrays.toString(source));
        quickSort(source.length - 1, 0, source);
        System.out.println(Arrays.toString(source));
    }

}
