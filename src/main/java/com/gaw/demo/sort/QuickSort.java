package com.gaw.demo.sort;

import java.util.Arrays;

/**
 * @author gaopo
 * @date 2019/2/20.
 */
public class QuickSort {

    private static int transfer(int highIndex, int lowIndex, int baseIndex, int[] source) {
        if (lowIndex >= highIndex) {
            return highIndex;
        }
        if (source[lowIndex] <= source[baseIndex]) {
            lowIndex++;
        }
        if (source[highIndex] >= source[baseIndex]) {
            highIndex--;
        }
        if (source[highIndex] < source[lowIndex]) {
            int temp = source[highIndex];
            source[highIndex] = source[lowIndex];
            source[lowIndex] = temp;
        }
        return transfer(highIndex, lowIndex, baseIndex, source);
    }

    private static void quickSort(int highIndex, int lowIndex, int[] source) {
        //int response = transfer(highIndex, lowIndex, lowIndex, source);
        int left = highIndex;
        int right = lowIndex;
        while (true) {
            if (highIndex <= lowIndex) {
                break;
            }
            if (source[highIndex] >= source[right]) {
                highIndex--;
            }
            if (source[lowIndex] <= source[right]) {
                lowIndex++;
            }
            if (source[highIndex] < source[lowIndex]) {
                int temp = source[highIndex];
                source[highIndex] = source[lowIndex];
                source[lowIndex] = temp;
            }
        }
        int temp = source[right];
        source[right] = source[lowIndex];
        source[lowIndex] = temp;
        quickSort(lowIndex, right, source);
        quickSort(left, lowIndex + 1, source);

    }

    public static void main(String[] args) {
        int[] source = {212, 341, 5646, 7, 45, 75, 89, 4, 57, 42, 67, 456, 9, 231, 42, 74, 326, 2134, 26761, 23797, 23434, 234, 3545, 24, 75, 9, 32465, 9965, 2367, 3621, 3, 678};
        System.out.println(Arrays.toString(source));
        quickSort(source.length - 1, 0, source);
        System.out.println(Arrays.toString(source));
    }

}
